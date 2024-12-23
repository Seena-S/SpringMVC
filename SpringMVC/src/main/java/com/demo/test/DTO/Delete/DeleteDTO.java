package com.demo.test.DTO.Delete;

import javax.persistence.Entity;

@Entity
public class DeleteDTO {
	
	private int sid;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	@Override
	public String toString() {
		return "DeleteDTO [sid=" + sid + "]";
	}
	public DeleteDTO() {
		System.out.println(this.getClass().getSimpleName()+" Created");
	}

}
