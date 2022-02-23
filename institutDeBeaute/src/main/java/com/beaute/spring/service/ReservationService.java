package com.beaute.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beaute.spring.entity.Reservation;
import com.beaute.spring.repository.ReservationRepository;

@Service
public class ReservationService implements IReservationService {
	@Autowired
	 ReservationRepository reservationRepository;
	
	private static final Logger l = LogManager.getLogger(ReservationService.class);
	
	public static Logger getL() {
		return l;
	}
	
	@Override
	public Reservation addReservation(Reservation reservation){
		return reservationRepository.save(reservation);
		
}
	@Override
	public Reservation updateReservation(Reservation reservation){
		return reservationRepository.save(reservation);
		
}
	
	@Override
	public List<Reservation> retrieveAllReservation() {
		
		 return (List<Reservation>) reservationRepository.findAll();
	}
	@Override
	public void deleteReservationById(Long id){
		reservationRepository.deleteById(id);
	}
	
	
	

}
