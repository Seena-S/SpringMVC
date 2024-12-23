package com.demo.test.Model.DAO.Registration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.test.DTO.Registration.StudentDTO;

@Repository
public class RegistrationDAO {
	
	@Autowired
	private SessionFactory fact;
	public RegistrationDAO() {
		System.out.println(this.getClass().getSimpleName()+" Created");
	}
	public void userRegistrationDAO(StudentDTO sdto) {
		System.out.println("user Registration DAO started");
		Session session=fact.openSession();
		Transaction tx=session.beginTransaction();
		session.save(sdto);
		tx.commit();
		System.out.println("user Registration DAO ended");
	}

}
