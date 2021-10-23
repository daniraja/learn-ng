package com.example.register;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "reg")
public class Regparm implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name = "id", unique = true)
	@NotNull
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
	    
		
}
