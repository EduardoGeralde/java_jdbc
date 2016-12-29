package com.eduardoportfolio.jdbc.test;

import java.util.Calendar;

import com.eduardoportfolio.jdbc.dao.ContactDao;
import com.eduardoportfolio.jdbc.model.Contact;

public class InsertionTest {

	public static void main(String[] args) {
		
		//data to record
		Contact contact = new Contact();
		contact.setName("Eduardo Geralde");
		contact.setEmail("eduardo_geralde@hotmail.com");
		contact.setAddress("Sunshine Boulevard, 458 - North Coast");
		contact.setBirthDate(Calendar.getInstance());
		
		//record in this connection
		ContactDao dao = new ContactDao();
		
		//method to add
		dao.add(contact);
		
		System.out.println("Data recorded !");
	}

}
