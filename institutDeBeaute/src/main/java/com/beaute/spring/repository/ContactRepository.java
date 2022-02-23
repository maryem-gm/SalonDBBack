package com.beaute.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beaute.spring.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact,Long> {

}
