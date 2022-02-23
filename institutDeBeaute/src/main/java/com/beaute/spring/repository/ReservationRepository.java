package com.beaute.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beaute.spring.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {

}
