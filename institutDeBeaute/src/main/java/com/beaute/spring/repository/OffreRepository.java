package com.beaute.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.beaute.spring.entity.Offre;

public interface OffreRepository extends JpaRepository<Offre,Long> {
	@Query(value = "SELECT COUNT(*) FROM t_client_offre_parent o  where offre_client_id= :offreId", nativeQuery = true)
	int getNbrClients(@Param("offreId") long offreId);
}
