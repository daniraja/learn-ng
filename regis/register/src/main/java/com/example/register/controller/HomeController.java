package com.example.register.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.example.register.Regparm;
import com.example.register.dto.Regparmdto;
import com.example.register.message.ResponseFile;
import com.example.register.message.ResponseMessage;
import com.example.register.repo.Regrepo;
import com.example.register.storage.StorageService;



@Controller
public class HomeController {

	
	private final StorageService storageService;

	@Autowired
	public HomeController(StorageService storageService) {
		this.storageService = storageService;
	}
	
	
	@Autowired
	Regrepo repo;
	
	@RequestMapping("/")
	public String home() {
		
		return "home";
	}
	
/*	@CrossOrigin(origins = "*", maxAge = 3600)
	@RequestMapping("/addRegis")
	public String addRegparm(Regparm regis) {
		System.out.println(regis.toString());
		repo.save(regis);
		return "home";
	} */
	
	
	
	@CrossOrigin(origins = "*", maxAge = 3600)
	@RequestMapping("/addRegis")
	public ResponseEntity<?> addregis(@RequestBody Regparmdto regis) {
		Regparm new_Regparm = new Regparm();
		new_Regparm.setId(regis.getId());
		new_Regparm.setFirstname(regis.getFirstName());
		new_Regparm.setLastname(regis.getLastName());
		new_Regparm.setEmail(regis.getEmail());
		new_Regparm.setPhone(regis.getPhone());
		new_Regparm.setPassword(regis.getPassword());
		new_Regparm.setDob(regis.getDob());
		System.out.println(regis.toString());
		new_Regparm = repo.save(new_Regparm);
		BeanUtils.copyProperties(new_Regparm, regis);
		return ResponseEntity.ok().build();
	}
	
	@RequestMapping("/getRegis")
	public List<Regparm>getRepo(){
		List<Object[]> objectlist = repo.getRepo();
		List<Regparm> regparm1 = new ArrayList<Regparm>();
		if (objectlist.size() > 0) {
			objectlist.forEach(objlist -> {
				Regparm regparm = new Regparm();
				regparm.setId(((Integer) objlist[0]).intValue());
				regparm.setFirstname((String) objlist[1]);
				regparm.setLastname((String) objlist[2]);
				regparm.setEmail((String) objlist[3]);
				regparm.setPhone((String) objlist[4]);
				regparm.setPassword((String) objlist[5]);
				
			});
			return regparm1;
		}
		return regparm1;
		
		
		
}
	@PostMapping("/upload")
	  public ResponseEntity<ResponseMessage> uploadFile(@RequestParam("file") MultipartFile file) {
	    String message = "";
	    try {
	      storageService.store(file);

	      message = "Uploaded the file successfully: " + file.getOriginalFilename();
	      return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
	    } catch (Exception e) {
	      message = "Could not upload the file: " + file.getOriginalFilename() + "!";
	      return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
	    }
	  }

	
	@GetMapping("/files")
	  public ResponseEntity<List<ResponseFile>> getListFiles() {
	    List<ResponseFile> files = storageService.getAllFiles().map(dbFile -> {
	      String fileDownloadUri = ServletUriComponentsBuilder
	          .fromCurrentContextPath()
	          .path("/files/")
	          .path(dbFile.getId())
	          .toUriString();

	      return new ResponseFile(
	          dbFile.getName(),
	          fileDownloadUri,
	          dbFile.getType(),
	          dbFile.getData().length);
	    }).collect(Collectors.toList());

	    return ResponseEntity.status(HttpStatus.OK).body(files);
	  }
	
	@GetMapping("/files/{id}")
	  public ResponseEntity<byte[]> getFile(@PathVariable String id) {
	    Regrepo Regrepo = storageService.getFile(id);

	    return ResponseEntity.ok()
	        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + Regrepo.getName() + "\"")
	        .body(Regrepo.getData());
	  }
	}
	
}

