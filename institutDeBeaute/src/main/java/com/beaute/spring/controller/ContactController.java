package com.beaute.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.beaute.spring.entity.Contact;
import com.beaute.spring.service.IContactService;


@RestController
public class ContactController {
	
	@Autowired
	IContactService contactService;

	
	// http://localhost:8081/SpringMVC/servlet/add-contact
			@PostMapping("/add-contact")
			@ResponseBody
			public Contact addContact(@RequestBody Contact c) {
				Contact contact = contactService.addContact(c);
			return contact;
			}
			// http://localhost:8081/SpringMVC/servlet/update-contact
			@PutMapping("/update-contact")
			@ResponseBody
			public Contact updateContact(@RequestBody Contact c) {
				Contact contact = contactService.updateContact(c);
			return contact;
			}
			
			//http://localhost:8081/SpringMVC/servlet/retrieve-all-contacts
			@GetMapping("/retrieve-all-contacts")
			@ResponseBody
			public List<Contact> getContacts() {
			List<Contact> contact = contactService.retrieveAllContacts();
			return  contact;
			}
			//http://localhost:8081/SpringMVC/servlet/delete-contact/{id}
			@DeleteMapping("/delete-contact/{id}")
			public String deleteContact(@PathVariable("id") Long id){
				contactService.deleteContactById(id);
				return "Contact deleted";
			}
	
	
}
