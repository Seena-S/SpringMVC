package com.demo.test.Model.DAO.Login;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.test.DTO.Login.LoginDTO;
import com.demo.test.DTO.Registration.StudentDTO;
@Repository
public class LoginDAO {
	
	@Autowired
	private SessionFactory fact;
	
	public LoginDAO() {
		System.out.println(this.getClass().getSimpleName()+" Created");
	}
    public StudentDTO userLoginDAO(LoginDTO dto) {
		System.out.println("User login DAO started. ");
		Session session=fact.openSession();
		Query qry=session.createQuery("from StudentDTO dto where dto.semailid='"+dto.getSemail()+"' and dto.spwd= '"+dto.getSpwd()+"'");
		StudentDTO fromdb= (StudentDTO) qry.uniqueResult();//retrieves a single StudentDTO object from the database (if a match is found)
		System.out.println(fromdb);
		System.out.println("User login DAO ended. ");
		return fromdb;
	}


}
