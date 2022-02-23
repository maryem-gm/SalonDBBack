package com.beaute.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beaute.spring.entity.Contact;
import com.beaute.spring.entity.Reservation;
import com.beaute.spring.repository.ContactRepository;
import com.beaute.spring.repository.ReservationRepository;

@Service
public class ContactService implements IContactService{

	@Autowired
	 ContactRepository contactRepository;
	
private static final Logger l = LogManager.getLogger(ContactService.class);
	
	public static Logger getL() {
		return l;
	}
	
	@Override
	public Contact addContact(Contact contact){
		return contactRepository.save(contact);
		
}
	@Override
	public Contact updateContact(Contact contact){
		return contactRepository.save(contact);
		
}
	
	@Override
	public List<Contact> retrieveAllContacts() {
		
		 return (List<Contact>) contactRepository.findAll();
	}
	@Override
	public void deleteContactById(Long id){
		contactRepository.deleteById(id);
	}
	
	
	
}
