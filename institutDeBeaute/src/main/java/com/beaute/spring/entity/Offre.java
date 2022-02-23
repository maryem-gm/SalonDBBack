package com.beaute.spring.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="T_Offre")

public class Offre implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="PRIX")
	private String prix;
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateFin;
	@Column(name="DESCRIPTION")
	private String description;
	
	@JsonIgnore
	@ManyToOne
	private Salon salon;
	
	
	
	public Offre(String description) {
		super();
		this.description = description;
	}
	

	
	
	
	
	public Offre(long id, String prix, Date dateDebut, Date dateFin, String description) {
		super();
		this.id = id;
		this.prix = prix;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.description = description;
	}






	public Offre() {
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPrix() {
		return prix;
	}
	public void setPrix(String prix) {
		this.prix = prix;
	}
	
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}}