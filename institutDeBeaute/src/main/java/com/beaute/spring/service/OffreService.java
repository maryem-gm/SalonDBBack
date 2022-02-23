package com.beaute.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beaute.spring.entity.Offre;
import com.beaute.spring.repository.OffreRepository;


@Service
public class OffreService implements IOffreService{

	
	@Autowired
	 OffreRepository offreRepository;
	
	private static final Logger l = LogManager.getLogger(OffreService.class);
	
	public static Logger getL() {
		return l;
	}
	
	@Override
	public Offre addOffre(Offre offre){
		return offreRepository.save(offre);
		
}
	@Override
	public Offre updateOffre(Offre offre){
		return offreRepository.save(offre);
		
}
	
	@Override
	public List<Offre> retrieveAllOffres() {
		
		 return (List<Offre>) offreRepository.findAll();
	}
	@Override
	public void deleteOffreById(Long id){
		offreRepository.deleteById(id);
	}
	
	@Override
 	public int  getNbrClients(Long idOffre) {
		int nbClients=0;
 		System.out.println("Present");
		nbClients= offreRepository.getNbrClients(idOffre);
		return nbClients;
 	}
	@Override
	public Offre retrieveOffreById(Long id){
		return offreRepository.findById(id).get();
	}
	
	
		}
	
	
	
	
	
	
	

