package com.beaute.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beaute.spring.entity.Offre;
import com.beaute.spring.entity.Tarif;
import com.beaute.spring.repository.TarifRepository;

@Service

public class TarifService implements ITarifService {
	
	@Autowired
	 TarifRepository tarifRepository;
	
	private static final Logger l = LogManager.getLogger(TarifService.class);
	
	public static Logger getL() {
		return l;
	}
	
	@Override
	public Tarif addTarif(Tarif tarif){
		return tarifRepository.save(tarif);
		
}
	@Override
	public Tarif updateTarif(Tarif tarif){
		return tarifRepository.save(tarif);
		
}
	
	@Override
	public List<Tarif> retrieveAllTarifs() {
		
		 return (List<Tarif>) tarifRepository.findAll();
	}
	@Override
	public void deleteTarifById(Long id){
		tarifRepository.deleteById(id);
	}
	
	@Override
	public Tarif retrieveTarifById(Long id){
		return tarifRepository.findById(id).get();
	}
	

}
