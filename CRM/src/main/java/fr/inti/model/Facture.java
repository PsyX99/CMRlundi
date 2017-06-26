package fr.inti.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="facture")
public class Facture {


	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int num_facture;
	
	private Date date_paiement;
	
	
	private int nb_relances;
	
	
	private Date date_emission;
	
	
	private double montant_TTC;
	
	
	private int delai_paiement;

	
	@ManyToMany(mappedBy="facture", cascade = CascadeType.ALL)
	 private List<Commande> liste_commande;
	
	public Facture() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Facture(Date date_paiement, int nb_relances, Date date_emission,
			double montant_TTC, int delai_paiement) {
		super();
		this.date_paiement = date_paiement;
		this.nb_relances = nb_relances;
		this.date_emission = date_emission;
		this.montant_TTC = montant_TTC;
		this.delai_paiement = delai_paiement;
	}

	public Facture(int num_facture, Date date_paiement, int nb_relances,
			Date date_emission, double montant_TTC, int delai_paiement) {
		super();
		this.num_facture = num_facture;
		this.date_paiement = date_paiement;
		this.nb_relances = nb_relances;
		this.date_emission = date_emission;
		this.montant_TTC = montant_TTC;
		this.delai_paiement = delai_paiement;
	}

	public int getNum_facture() {
		return num_facture;
	}

	public void setNum_facture(int num_facture) {
		this.num_facture = num_facture;
	}

	public Date getDate_paiement() {
		return date_paiement;
	}

	public void setDate_paiement(Date date_paiement) {
		this.date_paiement = date_paiement;
	}

	public int getNb_relances() {
		return nb_relances;
	}

	public void setNb_relances(int nb_relances) {
		this.nb_relances = nb_relances;
	}

	public Date getDate_emission() {
		return date_emission;
	}

	public void setDate_emission(Date date_emission) {
		this.date_emission = date_emission;
	}

	public double getMontant_TTC() {
		return montant_TTC;
	}

	public void setMontant_TTC(double montant_TTC) {
		this.montant_TTC = montant_TTC;
	}

	public int getDelai_paiement() {
		return delai_paiement;
	}

	public void setDelai_paiement(int delai_paiement) {
		this.delai_paiement = delai_paiement;
	}

	public List<Commande> getListe_commande() {
		return liste_commande;
	}

	public void setListe_commande(List<Commande> liste_commande) {
		this.liste_commande = liste_commande;
	}

	

	

	
}

