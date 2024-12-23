package com.demo.test.Controller.Delete;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.demo.test.DTO.Registration.StudentDTO;
import com.demo.test.Model.Service.Delete.DeleteService;

@Controller
public class DeleteController {

    @Autowired
    private DeleteService service;

    public DeleteController() {
        System.out.println(this.getClass().getSimpleName() + " Created");
    }

    @RequestMapping(value = "/delete.do", method = RequestMethod.POST)
    public ModelAndView userDeleteController(StudentDTO dto, HttpServletRequest req) {
        System.out.println("User delete Controller started. ");
        boolean isDeleted = service.userDeleteService(dto);
        if (isDeleted) {
            return new ModelAndView("/Home.jsp", "message", "Profile Deleted Successfully!");
        } else {
            return new ModelAndView("/Delete.jsp", "message", "Error deleting profile.");
        }
    }
}
