package com.beaute.spring.service;

import java.util.List;

import com.beaute.spring.entity.Contact;

public interface IContactService {
	
	Contact addContact(Contact contact);
	List<Contact> retrieveAllContacts();
	void deleteContactById(Long id);
	Contact updateContact(Contact contact);

}
