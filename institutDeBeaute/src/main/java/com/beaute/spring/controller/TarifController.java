package com.beaute.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.beaute.spring.entity.Offre;
import com.beaute.spring.entity.Tarif;
import com.beaute.spring.service.ITarifService;


@CrossOrigin("*")
@RestController

public class TarifController {
	
	@Autowired
	ITarifService tarifService;
	
	
	// http://localhost:8081/add-tarif
		@PostMapping("/add-tarif")
		@ResponseBody
		public Tarif addTarif(@RequestBody Tarif t) {
			Tarif tarif = tarifService.addTarif(t);
		return tarif;
		}
		// http://localhost:8081/update-tarif
		@PutMapping("/update-tarif")
		@ResponseBody
		public Tarif updateTarif(@RequestBody Tarif t) {
			Tarif tarif = tarifService.updateTarif(t);
		return tarif;
		}
		
		//http://localhost:8081/retrieve-all-tarifs
		@GetMapping("/retrieve-all-tarifs")
		@ResponseBody
		public List<Tarif> getTarifs() {
			return tarifService.retrieveAllTarifs();

		}
		//http://localhost:8081/delete-tarif/{id}
		@DeleteMapping("/delete-tarif/{id}")
		public String deleteTarif(@PathVariable("id") Long id){
			tarifService.deleteTarifById(id);
			return "tarif deleted";
		}
		@GetMapping("/retrieve-tarif/{id}")
		@ResponseBody
		public Tarif getTarifById(@PathVariable("id") Long id) {
		Tarif tarif = tarifService.retrieveTarifById(id);
		return  tarif;
		}

}
