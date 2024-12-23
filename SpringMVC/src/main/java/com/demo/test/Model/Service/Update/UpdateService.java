package com.demo.test.Model.Service.Update;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.test.DTO.Registration.StudentDTO;
import com.demo.test.Model.DAO.Update.UpdateDAO;

@Service
public class UpdateService {

    @Autowired
    private UpdateDAO dao;

    public UpdateService() {
        System.out.println(this.getClass().getSimpleName() + " Created");
    }

    public boolean userUpdateService(StudentDTO dto) {
        System.out.println("User update Service started");
        return dao.userUpdateDAO(dto);
    }
}
