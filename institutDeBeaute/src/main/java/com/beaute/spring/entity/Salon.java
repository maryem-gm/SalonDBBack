package com.beaute.spring.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="T_Salon")
public class Salon implements Serializable {
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="NOM")
	private String nom;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JsonIgnore
	 private List<Offre> offres;
	
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JsonIgnore
	 private List<Reservation> reservations;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Salon() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Salon [id=" + id + ", nom=" + nom + "]";
	}

	
}
