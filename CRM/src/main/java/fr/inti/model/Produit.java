package fr.inti.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/*
 * ScrumMaster
 */

@Entity
@Table(name="produit")
public class Produit {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_produit;

	private String libelle;
	private String type;
	private String unite_mesure;
	private double toux_TVA;
	private String fournisseur;
	private String marque;
	private String model;
	private int quantite_Stock;

	@OneToMany(mappedBy = "produit", cascade = CascadeType.ALL)
	private List<Histo_tarification> liste_histo_tarification = new ArrayList<Histo_tarification>();

	@ManyToMany(mappedBy = "liste_produit", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Proposition_commerciale> liste_proposition_commerciale;

	// Pour la personne qui fait proposition commercial :

	// @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	// @JoinTable(name="table de jointure",
	// joinColumns=@JoinColumn(name="Id_propal"),
	// inverseJoinColumns=@JoinColumn(name="Id_produit"))
	//
	// private List<Produit> listProduit;

	@ManyToMany(mappedBy = "liste_produit", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Fiche_client> liste_fiche_client;

	// Pour la personne qui fait fiche client :

	// @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	// @JoinTable(name="table de jointure",
	// joinColumns=@JoinColumn(name="Id_fiche_client"),
	// inverseJoinColumns=@JoinColumn(name="Id_produit"))
	//
	// private List<Produit> listProduit;

	@ManyToMany(mappedBy = "liste_produit", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Commande> liste_commande;

	// Pour la personne qui fait fiche client :

	// @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	// @JoinTable(name="table de jointure",
	// joinColumns=@JoinColumn(name="Num_commande"),
	// inverseJoinColumns=@JoinColumn(name="Id_produit"))
	//
	// private List<Produit> listProduit;

	@OneToMany(mappedBy = "produit", cascade = CascadeType.ALL)
	private List<Campagne> liste_campagne = new ArrayList<Campagne>();

	public Produit() {
		super();
	}

	public Produit(String libelle, String type, String unite_mesure,
			double toux_TVA, String fournisseur, String marque, String model,
			int quantite_Stock) {
		super();
		libelle = libelle;
		type = type;
		unite_mesure = unite_mesure;
		toux_TVA = toux_TVA;
		fournisseur = fournisseur;
		marque = marque;
		model = model;
		quantite_Stock = quantite_Stock;
	}

	public Produit(int id_produit, String libelle, String type,
			String unite_mesure, double toux_TVA, String fournisseur,
			String marque, String model, int quantite_Stock) {
		super();
		id_produit = id_produit;
		libelle = libelle;
		type = type;
		unite_mesure = unite_mesure;
		toux_TVA = toux_TVA;
		fournisseur = fournisseur;
		marque = marque;
		model = model;
		quantite_Stock = quantite_Stock;
	}

	public int getId_produit() {
		return id_produit;
	}

	public void setId_produit(int id_produit) {
		id_produit = id_produit;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		libelle = libelle;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		type = type;
	}

	public String getUnite_mesure() {
		return unite_mesure;
	}

	public void setUnite_mesure(String unite_mesure) {
		unite_mesure = unite_mesure;
	}

	public double getToux_TVA() {
		return toux_TVA;
	}

	public void setToux_TVA(double toux_TVA) {
		toux_TVA = toux_TVA;
	}

	public String getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(String fournisseur) {
		fournisseur = fournisseur;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		marque = marque;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		model = model;
	}

	public int getQuantite_Stock() {
		return quantite_Stock;
	}

	public void setQuantite_Stock(int quantite_Stock) {
		quantite_Stock = quantite_Stock;
	}

	public List<Histo_tarification> getListe_histo_tarification() {
		return liste_histo_tarification;
	}

	public void setListe_histo_tarification(
			List<Histo_tarification> liste_histo_tarification) {
		this.liste_histo_tarification = liste_histo_tarification;
	}

	public List<Proposition_commerciale> getListe_proposition_commerciale() {
		return liste_proposition_commerciale;
	}

	public void setListe_proposition_commerciale(
			List<Proposition_commerciale> liste_proposition_commerciale) {
		this.liste_proposition_commerciale = liste_proposition_commerciale;
	}

	public List<Fiche_client> getListe_fiche_client() {
		return liste_fiche_client;
	}

	public void setListe_fiche_client(List<Fiche_client> liste_fiche_client) {
		this.liste_fiche_client = liste_fiche_client;
	}

	public List<Commande> getListe_commande() {
		return liste_commande;
	}

	public void setListe_commande(List<Commande> liste_commande) {
		this.liste_commande = liste_commande;
	}

	public List<Campagne> getListe_campagne() {
		return liste_campagne;
	}

	public void setListe_campagne(List<Campagne> liste_campagne) {
		this.liste_campagne = liste_campagne;
	}

	

}
