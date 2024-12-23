package com.demo.test.Model.Service.Registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.test.DTO.Registration.StudentDTO;
import com.demo.test.Model.DAO.Registration.RegistrationDAO;

@Service
public class RegistrationService {
	
	@Autowired
	private RegistrationDAO dao;
	public RegistrationService() {
		System.out.println(this.getClass().getSimpleName()+" Created");
	}
	
	public void userRegistrationService(StudentDTO sdto) {
		System.out.println("user Registration Service started");
		dao.userRegistrationDAO(sdto);
		System.out.println("user Registration Service ended");
	}

}
