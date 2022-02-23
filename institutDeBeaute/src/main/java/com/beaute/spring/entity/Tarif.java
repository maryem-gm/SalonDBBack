package com.beaute.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_Tarif")

public class Tarif implements Serializable{

private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="LIBELLE")
	private String libelle;
	@Column(name="TYPE")
	private String type;
	@Column(name="PRIX")
	private String prix;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
		public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
		public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPrix() {
		return prix;
	}
	public void setPrix(String prix) {
		this.prix = prix;
	}
	
	@Override
	public String toString() {
		return "Tarif [id=" + id + ", libellé=" + libelle + ", type=" + type + ", prix=" + prix + "]";
	}
	
	public Tarif(long id, String libelle, String type, String prix) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.type = type;
		this.prix = prix;
	}
	public Tarif() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
