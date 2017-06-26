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
@Table(name = "commande_produit")
public class Commande_produit implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_commande_produit;
	
	@Column(name="Quantite")
	private int quantite;
	
	@Column(name="Taux_reduction")
	private double taux_reduction;


	public int getId_commande_produit() {
		return id_commande_produit;
	}

	public void setId_commande_produit(int id_commande_produit) {
		this.id_commande_produit = id_commande_produit;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int Quantite) {
		this.quantite = Quantite;
	}

	public double getTaux_reduction() {
		return taux_reduction;
	}

	public void setTaux_reduction(double Taux_reduction) 
	{
		this.taux_reduction = Taux_reduction;
	}

	public Commande_produit(int id_commande_produit, int Quantite,
			double Taux_reduction) {
		super();
		this.id_commande_produit = id_commande_produit;
		quantite = Quantite;
		taux_reduction = Taux_reduction;
	}

	public Commande_produit(int Quantite, double Taux_reduction) {
		super();
		quantite = Quantite;
		taux_reduction = Taux_reduction;
	}

	public Commande_produit() 
	{
		
	}
}
