package fr.inti.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



/*
 * ScrumMaster
 */

@Entity
@Table(name="histo_tarification")
public class HistoTarification {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_tarification;

	/*
	 * Pas clair si String ou autre chose
	 */
	// private String Formule_com;

	/*
	 * Local georgian import�
	 */
	private Date date_debut;
	private Date date_fin;

	@ManyToOne
	@JoinColumn(name = "Id_produit", referencedColumnName = "id_produit")
	private Produit produit;

	public HistoTarification() {
		super();
	}

	public HistoTarification(Date date_debut, Date date_fin) {
		super();
		this.date_debut = date_debut;
		this.date_fin = date_fin;
	}



	public HistoTarification(int id_tarification, Date date_debut,
			Date date_fin) {
		super();
		this.id_tarification = id_tarification;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
	}

	public int getId_tarification() {
		return id_tarification;
	}

	public void setId_tarification(int id_tarification) {
		this.id_tarification = id_tarification;
	}

	public Date getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}

	public Date getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

}
