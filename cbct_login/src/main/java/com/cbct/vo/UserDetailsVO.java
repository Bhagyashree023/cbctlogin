package com.cbct.vo;

public class UserDetailsVO {

	private String fname;
	private String mname;
	private String lname;
	private String phnumber;
	private String emailid;
	private String password;
	private String instname;
	private Integer userid;
	private String role;
	public UserDetailsVO() {
		super();
	}
	public UserDetailsVO(String fname, String mname, String lname, String phnumber, String emailid, String password,
			String instname, Integer userid, String role) {
		super();
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.phnumber = phnumber;
		this.emailid = emailid;
		this.password = password;
		this.instname = instname;
		this.userid = userid;
		this.role = role;
	}
	
	public UserDetailsVO(String fname, String mname, String lname, String phnumber, String emailid, String instname,
			Integer userid, String role) {
		super();
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.phnumber = phnumber;
		this.emailid = emailid;
		this.instname = instname;
		this.userid = userid;
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
	public String getPhnumber() {
		return phnumber;
	}
	public void setPhnumber(String phnumber) {
		this.phnumber = phnumber;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getInstname() {
		return instname;
	}
	public void setInstname(String instname) {
		this.instname = instname;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	} 
	@Override
	public String toString() {
		return "UserDetailsVO [fname=" + fname + ", mname=" + mname + ", lname=" + lname + ", phnumber=" + phnumber
				+ ", emailid=" + emailid + ", password=" + password + ", instname=" + instname + ", userid=" + userid
				+ ", role=" + role + "]";
	}
	
	
}
