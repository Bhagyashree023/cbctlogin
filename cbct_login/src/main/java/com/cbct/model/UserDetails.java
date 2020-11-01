package com.cbct.model;

public class UserDetails {
	
	public UserDetails() {
		super();
	}
	
	private String fname,mname,lname,phone,email,password;
	private String institute;
	private String role;

	public UserDetails(String fname, String mname, String lname, String phone, String email, String password,
			String institute, String role) {
		super();
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.institute = institute;
		this.role = role;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getInstitute() {
		return institute;
	}

	public void setInstitute(String institute) {
		this.institute = institute;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "UserDetails [fname=" + fname + ", mname=" + mname + ", lname=" + lname + ", phone=" + phone + ", email="
				+ email + ", password=" + password + ", institute=" + institute + ", role=" + role + "]";
	}

}
