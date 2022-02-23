package com.beaute.spring.service;

import java.util.List;

import com.beaute.spring.entity.Tarif;

public interface ITarifService {

	Tarif addTarif(Tarif tarif);
	Tarif updateTarif(Tarif tarif);
	List<Tarif> retrieveAllTarifs();
	void deleteTarifById(Long id);
	Tarif retrieveTarifById(Long id);
}
