package com.eduardoportfolio.jdbc.test;

import java.util.List;

import com.eduardoportfolio.jdbc.dao.ContactDao;
import com.eduardoportfolio.jdbc.model.Contact;

public class ListTest {

	public static void main(String[] args) {
		
		ContactDao dao = new ContactDao();
		
		List<Contact> contacts = dao.getList();
		
		for (Contact contact : contacts) {
			System.out.println("Nome: "+ contact.getName());
			System.out.println("Email: "+ contact.getEmail());
			System.out.println("Address: "+ contact.getAddress());
			System.out.println("Date of birth: "+ contact.getBirthDate().getTime()+ "\n");
		}

	}

}
