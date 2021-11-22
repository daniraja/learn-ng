package com.example.register.dto;

public class Regparmdto {

	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String password;
	private String dob;
	private String pic_id;
	private String pic_name;
	private String pic_data;
	private String pic_type;
	
	public Regparmdto() {
		super();
	}
	
	public Regparmdto(int id, String firstName, String lastName, String email, String phone,
			String password, String dob, String pic_id, String pic_name, String pic_data, String pic_type) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.dob = dob;
		this.pic_id = pic_id;
		this.pic_name = pic_name;
		this.pic_data = pic_data;
		this.pic_type = pic_type;
		
	}

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

	public String getPic_data() {
		return pic_data;
	}

	public void setPic_data(String pic_data) {
		this.pic_data = pic_data;
	}

	public String getPic_type() {
		return pic_type;
	}

	public void setPic_type(String pic_type) {
		this.pic_type = pic_type;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Regparmdto [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phone=" + phone + ", password=" + password + ", dob=" + dob + ", pic_id=" + pic_id + ", pic_name="
				+ pic_name + ", pic_data=" + pic_data + ", pic_type=" + pic_type + "]";
	}
	
}
