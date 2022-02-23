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

import com.beaute.spring.entity.Reservation;
import com.beaute.spring.service.IReservationService;

@RestController
public class ReservationController {

	@Autowired
	IReservationService reservationService;
	
	
	
	// http://localhost:8081/SpringMVC/servlet/add-reservation
			@PostMapping("/add-reservation")
			@ResponseBody
			public Reservation addReservation(@RequestBody Reservation r) {
				Reservation reservation = reservationService.addReservation(r);
			return reservation;
			}
			// http://localhost:8081/SpringMVC/servlet/update-reservation
			@PutMapping("/update-reservation")
			@ResponseBody
			public Reservation updateReservation(@RequestBody Reservation r) {
				Reservation reservation = reservationService.updateReservation(r);
			return reservation;
			}
			
			//http://localhost:8081/SpringMVC/servlet/retrieve-all-offres
			@GetMapping("/retrieve-all-reservation")
			@ResponseBody
			public List<Reservation> getReservations() {
			List<Reservation> reservation = reservationService.retrieveAllReservation();
			return  reservation;
			}
			//http://localhost:8081/SpringMVC/servlet/delete-reservation/{id}
			@DeleteMapping("/delete-reservation/{id}")
			public String deleteReservation(@PathVariable("id") Long id){
				reservationService.deleteReservationById(id);
				return "Reservation deleted";
			}
	
	
	
	
	
}
