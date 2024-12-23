package com.demo.test.Controller.Update;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.demo.test.DTO.Registration.StudentDTO;
import com.demo.test.Model.Service.Update.UpdateService;

@Controller
public class UpdateController {

    @Autowired
    private UpdateService service;

    public UpdateController() {
        System.out.println(this.getClass().getSimpleName() + " Created");
    }

    @RequestMapping(value = "/update.do", method = RequestMethod.POST)
    public ModelAndView userUpdateController(StudentDTO dto, HttpServletRequest req) {
        System.out.println("User update Controller started. ");
        boolean isUpdated = service.userUpdateService(dto);
        if (isUpdated) {
            return new ModelAndView("/Home.jsp", "message", "Profile Updated Successfully!");
        } else {
            return new ModelAndView("/Edit.jsp", "message", "Error updating profile.");
        }
    }
}
