package com.example.register;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "reg")
public class Regparm implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true)
	 private int id;
	@Column(name = "firstname")
	    private String firstname;
	@Column(name = "lastname")
	    private String lastname;
	@Column(name = "email")
	    private String email;
	@Column(name = "phone")
	    private String phone;
	@Column(name = "password")
    	private String password;
	@Column(name = "dob")
		private String dob;
	
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@GeneratedValue(generator = "uuid")
	@Column(name = "pic_id")
		private String pic_id;
	@Column(name = "pic_name")
		private String pic_name;
	@Column(name = "pic_type")
		private String pic_type;
	@Lob
	@Column(name = "pic_data")
		private byte[] pic_data;

	
		
	public String getPic_id() {
		return pic_id;
	}
	public void setPic_id(String pic_id) {
		this.pic_id = pic_id;
	}
	public String getPic_name() {
		return pic_name;
	}
	public void setPic_name(String pic_name) {
		this.pic_name = pic_name;
	}
	public String getPic_type() {
		return pic_type;
	}
	public void setPic_type(String pic_type) {
		this.pic_type = pic_type;
	}
	public byte[] getPic_data() {
		return pic_data;
	}
	public void setPic_data(byte[] pic_data) {
		this.pic_data = pic_data;
	}
		public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
		public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		@Override
		public String toString() {
			return "Regparm [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
					+ ", phone=" + phone + ", password=" + password + ", dob=" + dob + ", pic_id=" + pic_id
					+ ", pic_name=" + pic_name + ", pic_type=" + pic_type + ", pic_data=" + Arrays.toString(pic_data)
					+ "]";
		}
		public Regparm(String pic_name, String pic_type, byte[] pic_data) {
			super();
			this.pic_name = pic_name;
			this.pic_type = pic_type;
			this.pic_data = pic_data;
		}
		
				
			    
		
}
