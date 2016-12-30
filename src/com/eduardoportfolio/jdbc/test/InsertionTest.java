package com.eduardoportfolio.jdbc.test;

import java.util.Calendar;

import com.eduardoportfolio.jdbc.dao.ContactDao;
import com.eduardoportfolio.jdbc.model.Contact;

public class InsertionTest {

	public static void main(String[] args) {
		
		//data to record
		Contact contact = new Contact();
		contact.setName("Paulo Augusto");
		contact.setEmail("paulo_augusto@hotmail.com");
		contact.setAddress("Sunrise Street, 3453 - DownTown");
		contact.setBirthDate(Calendar.getInstance());
		
		//record in this connection
		ContactDao dao = new ContactDao();
		
		//method to add
		dao.add(contact);
		
		System.out.println("Data recorded !");
	}

}
