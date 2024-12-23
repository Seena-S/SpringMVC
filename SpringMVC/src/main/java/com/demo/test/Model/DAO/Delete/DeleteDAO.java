package com.demo.test.Model.DAO.Delete;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.test.DTO.Registration.StudentDTO;

@Repository
public class DeleteDAO {

    @Autowired
    private SessionFactory fact;

    public DeleteDAO() {
        System.out.println(this.getClass().getSimpleName() + " Created");
    }

    public boolean userDeleteDAO(StudentDTO dto) {
        System.out.println("User delete DAO started. ");
        Session session = fact.openSession();
        try {
            session.beginTransaction();
            StudentDTO student = (StudentDTO) session.get(StudentDTO.class, dto.getSid());
            if (student != null) {
                session.delete(student);
                session.getTransaction().commit();
                System.out.println("User delete DAO ended. ");
                return true;
            }
            return false;
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
            return false;
        } finally {
            session.close();
        }
    }
}
