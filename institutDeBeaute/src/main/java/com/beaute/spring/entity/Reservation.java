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
@Table(name="T_Reservation")

public class Reservation implements Serializable {
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="NOM")
	private String nom;
	@Column(name="PRENOM")
	private String prenom;
	@Column(name="EMAIL")
	private String email;
	@Column(name="NUMTEL")
	private String numTel;
	@Temporal(TemporalType.DATE)
	private Date dateRDV;
	
	@JsonIgnore
	@ManyToOne
	private Salon salon;
	
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
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumTel() {
		return numTel;
	}
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
	public Date getDateRDV() {
		return dateRDV;
	}
	public void setDateRDV(Date dateRDV) {
		this.dateRDV = dateRDV;
	}
	
	@Override
	public String toString() {
		return "Reservation [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", numTel="
				+ numTel + ", dateRDV=" + dateRDV + "]";
	}
	
	

}
