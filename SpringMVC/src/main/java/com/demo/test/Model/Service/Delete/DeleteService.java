
package com.demo.test.Model.Service.Delete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.test.DTO.Registration.StudentDTO;
import com.demo.test.Model.DAO.Delete.DeleteDAO;

@Service
public class DeleteService {

    @Autowired
    private DeleteDAO dao;

    public DeleteService() {
        System.out.println(this.getClass().getSimpleName() + " Created");
    }

    public boolean userDeleteService(StudentDTO dto) {
        System.out.println("User delete Service started");
        return dao.userDeleteDAO(dto);
    }
}
