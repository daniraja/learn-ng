package com.example.register.storage;

import java.io.IOException;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.example.register.Regparm;
import com.example.register.dto.Regparmdto;
import com.example.register.repo.Regrepo;


@Service
public class StorageService {

  @Autowired
  private Regrepo Regrepo;

  public Regparm store(MultipartFile file) throws IOException {
    String fileName = StringUtils.cleanPath(file.getOriginalFilename());
    Regparm Regparm = new Regparm(fileName, file.getContentType(), file.getBytes());

    return Regrepo.save(Regparm);
  }

  public Stream<Regparm> getAllFiles() {
    return Regrepo.findAll().stream();
  }

public com.example.register.repo.Regrepo getFile(String id) {
	// TODO Auto-generated method stub
	return null;
}
}