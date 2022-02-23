package com.beaute.spring.service;

import java.util.List;

import com.beaute.spring.entity.Offre;

public interface IOffreService {

	Offre addOffre(Offre offre);
	List<Offre> retrieveAllOffres();
	void deleteOffreById(Long id);
	Offre updateOffre(Offre offre);
	int getNbrClients(Long idOffre);
	Offre retrieveOffreById(Long id);

}
