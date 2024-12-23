package com.demo.test.DTO.Login;

import java.io.Serializable;

import javax.persistence.Entity;
@Entity
public class LoginDTO implements Serializable{
	
	private String semail;
	private String spwd;
	
	public LoginDTO() {
		System.out.println(this.getClass().getSimpleName()+" Created");
	}

	public String getSemail() {
		return semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
	}

	public String getSpwd() {
		return spwd;
	}

	public void setSpwd(String spwd) {
		this.spwd = spwd;
	}
	

}
