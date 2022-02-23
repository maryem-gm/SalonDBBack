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

import com.beaute.spring.entity.Offre;
import com.beaute.spring.service.IOffreService;



@RestController
public class OffreController {
	
	
	

	@Autowired
	IOffreService offreService;
	
	
	// http://localhost:8081/SpringMVC/servlet/add-offre
		@PostMapping("/add-offre")
		@ResponseBody
		public Offre addOffre(@RequestBody Offre o) {
			Offre offre = offreService.addOffre(o);
		return offre;
		}
		// http://localhost:8081/SpringMVC/servlet/update-offre
		@PutMapping("/update-offre")
		@ResponseBody
		public Offre updateOffre(@RequestBody Offre o) {
			Offre offre = offreService.updateOffre(o);
		return offre;
		}
		
		//http://localhost:8081/SpringMVC/servlet/retrieve-all-offres
		@GetMapping("/retrieve-all-offres")
		@ResponseBody
		public List<Offre> getOffres() {
		List<Offre> offre = offreService.retrieveAllOffres();
		return  offre;
		}
		//http://localhost:8081/SpringMVC/servlet/delete-offre/{id}
		@DeleteMapping("/delete-offre/{id}")
		public String deleteOffre(@PathVariable("id") Long id){
			offreService.deleteOffreById(id);
			return "Offre deleted";
		}
		// http://localhost:8084/SpringMVC/servlet/retrieve-offre/{id}
				@GetMapping("/retrieve-offre/{id}")
				@ResponseBody
				public Offre getOffreById(@PathVariable("id") Long id) {
				Offre offre = offreService.retrieveOffreById(id);
				return  offre;
				}
}
