package com.demo.test.DTO.Registration;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="stud_details")
public class StudentDTO implements Serializable{
	
	@Id
	@GenericGenerator(name="ref",strategy="increment")
	@GeneratedValue(generator="ref")
	private int sid;
	@Column(name = "student_name")
	private String sname;
	@Column(name = "student_address")
	private String saddress;
	@Column(name = "student_course")
	private String scourse;
	@Column(name = "student_place")
	private String splace;
	@Column(name = "student_age")
	private int sage;
	@Column(name = "student_email")
	private String semailid;
	@Column(name = "student_password")
	private String spwd;
	
	public String getSemailid() {
		return semailid;
	}

	public void setSemailid(String semailid) {
		this.semailid = semailid;
	}

	public String getSpwd() {
		return spwd;
	}

	public void setSpwd(String spwd) {
		this.spwd = spwd;
	}

	public StudentDTO() {
		System.out.println(this.getClass().getSimpleName()+" created.");
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	public String getScourse() {
		return scourse;
	}

	public void setScourse(String scourse) {
		this.scourse = scourse;
	}

	public String getSplace() {
		return splace;
	}

	public void setSplace(String splace) {
		this.splace = splace;
	}

	public int getSage() {
		return sage;
	}

	public void setSage(int sage) {
		this.sage = sage;
	}

	@Override
	public String toString() {
		return "StudentDTO [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + ", scourse=" + scourse
				+ ", splace=" + splace + ", sage=" + sage + ", semailid=" + semailid + ", spwd=" + spwd + "]";
	}

	
	
	

}
