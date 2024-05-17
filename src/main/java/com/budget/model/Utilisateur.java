package com.budget.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Utilisateur")
public class Utilisateur {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Utilisateur")
	private String utilisateur;

	public Utilisateur() {
		super();
	}

	public Utilisateur(String utilisateur) {
		super();
		this.utilisateur = utilisateur;
	}

	public String getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(String utilisateur) {
		this.utilisateur = utilisateur;
	}
}