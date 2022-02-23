package com.beaute.spring.service;

import java.util.List;

import com.beaute.spring.entity.Reservation;

public interface IReservationService {
	Reservation addReservation(Reservation reservation);
	List<Reservation> retrieveAllReservation();
	void deleteReservationById(Long id);
	Reservation updateReservation(Reservation reservation);
}
