package com.demo.test.Model.Service.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.test.DTO.Login.LoginDTO;
import com.demo.test.DTO.Registration.StudentDTO;
import com.demo.test.Model.DAO.Login.LoginDAO;
@Service
public class LoginService {
	
	@Autowired
	private LoginDAO dao;
	
	public LoginService() {
		System.out.println(this.getClass().getSimpleName()+" Created");
	}
	
	public StudentDTO userLoginService(LoginDTO dto) {
		System.out.println("User login Service started. ");
		StudentDTO fromdb=dao.userLoginDAO(dto);
		System.out.println("User login Service ended. ");
		return fromdb;
	}

}
