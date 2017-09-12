package com.shop.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shop.entity.Customers;
//import com.gears.entity.Gears;

@Repository
public class Customerdaoimpl implements CustomerDAO {
	
	@Autowired
	SessionFactory sf ;
	
	
	public void adduser(Customers customer)
	{
		
		try {
	Session sec = sf.openSession();	
	Transaction trans= sec.beginTransaction();
	sec.save(customer);	
	trans.commit();
	sec.flush();
	sec.close();
	}

		catch(Exception ex)
		{
			System.out.println("error"+ex);
		}
}
}
