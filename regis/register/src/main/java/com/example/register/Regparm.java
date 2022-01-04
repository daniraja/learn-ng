package com.example.register;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

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
					+ ", phone=" + phone + ", password=" + password + ", dob=" + dob + "]";
		}
		
		
}
