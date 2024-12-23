package com.demo.test.Controller.Login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.demo.test.DTO.Login.LoginDTO;
import com.demo.test.DTO.Registration.StudentDTO;
import com.demo.test.Model.Service.Login.LoginService;
@Controller
public class LoginController {
	
	@Autowired
	private LoginService service;
	
	HttpSession session;
	public LoginController() {
		System.out.println(this.getClass().getSimpleName()+" Created");
	}
	
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
    public ModelAndView userLoginController(LoginDTO dto, HttpServletRequest req) {
    	System.out.println("User login Controller started. ");
    	StudentDTO fromdb=service.userLoginService(dto);
    	if(fromdb!=null) {
    		
    		session=req.getSession();//If the login is successful, it creates a session (session = req.getSession()), and 
    		//it stores the student data in the session with the name "student". 
    		//This allows the system to remember who logged in during their visit
    		session.setAttribute("student", fromdb);
    		return new ModelAndView("/Home.jsp","ts",fromdb.getSname());
    	}
    	else {
    		return new ModelAndView("/Login.jsp");
    	}
		
	}


}
