package com.demo.test.Model.DAO.Update;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.test.DTO.Registration.StudentDTO;

@Repository
public class UpdateDAO {

    @Autowired
    private SessionFactory fact;

    public UpdateDAO() {
        System.out.println(this.getClass().getSimpleName() + " Created");
    }

    public boolean userUpdateDAO(StudentDTO dto) {
        System.out.println("User update DAO started. ");
        Session session = fact.openSession();
        try {
            session.beginTransaction();
            session.update(dto);
            session.getTransaction().commit();
            System.out.println("User update DAO ended. ");
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
            return false;
        } finally {
            session.close();
        }
    }
}
