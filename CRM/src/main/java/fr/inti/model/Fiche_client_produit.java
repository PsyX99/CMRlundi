package fr.inti.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "fiche_client_produit")
public class Fiche_client_produit implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_fiche_client_produit;
	
	@OneToOne
	private Fiche_client fiche_client;
	
	@Column(name="quantite")
	private int quantite;

	public int getId_Fiche_client_produit() {
		return id_fiche_client_produit;
	}

	public void setId_Fiche_client_produit(int id_Fiche_client_produit) {
		this.id_fiche_client_produit = id_Fiche_client_produit;
	}

	public Fiche_client getFiche_client() {
		return fiche_client;
	}

	public void setFiche_client(Fiche_client fiche_client) {
		this.fiche_client = fiche_client;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		quantite = quantite;
	}

	public Fiche_client_produit(int id_Fiche_client_produit,
			Fiche_client fiche_client, int quantite) {
		super();
		this.id_fiche_client_produit = id_Fiche_client_produit;
		this.fiche_client = fiche_client;
		quantite = quantite;
	}

	public Fiche_client_produit(Fiche_client fiche_client, int quantite) {
		super();
		this.fiche_client = fiche_client;
		quantite = quantite;
	}

	public Fiche_client_produit() 
	{
	}
}
