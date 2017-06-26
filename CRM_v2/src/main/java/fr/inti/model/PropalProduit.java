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
@Table(name = "propal_produit")
public class PropalProduit implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_propal_produit;
	
	@Column(name="quantite")
	private int quantite;
	
	@Column(name="taux_reduction")
	private double taux_reduction;

	@OneToOne
	private Produit produit;
	
	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public int getId_Propal_produit() {
		return id_propal_produit;
	}

	public void setId_Propal_produit(int id_Propal_produit) {
		this.id_propal_produit = id_Propal_produit;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int Quantite) {
		quantite = Quantite;
	}

	public double getTaux_reduction() {
		return taux_reduction;
	}

	public void setTaux_reduction(double Taux_reduction) {
		taux_reduction = Taux_reduction;
	}

	public PropalProduit(int id_Propal_produit, int Quantite,
			double Taux_reduction, Produit produit) {
		super();
		this.id_propal_produit = id_Propal_produit;
		quantite = Quantite;
		taux_reduction = Taux_reduction;
		this.produit = produit;
	}

	public PropalProduit(int Quantite, double Taux_reduction, Produit produit) {
		super();
		quantite = Quantite;
		taux_reduction = Taux_reduction;
		this.produit = produit;
	}

	public PropalProduit() 
	{
	}
}
