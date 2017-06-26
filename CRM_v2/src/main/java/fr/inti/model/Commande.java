package fr.inti.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="commande")
public class Commande {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int num_commande;


	private Date date;


	private Date date_livraison;


	private String conditions_livraison;


	private String modalites_paiement;


	private int duree_validite;


	private String statut;


	private Date date_reception;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="facture_commande_jointure",
	joinColumns=
	@JoinColumn(name="num_facture"),
	inverseJoinColumns=@JoinColumn(name="num_commande"))
	private List<Facture> liste_facture;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="produit_commande_jointure",
	joinColumns=
	@JoinColumn(name="id_produit"),
	inverseJoinColumns=@JoinColumn(name="num_commande"))
	private List<Produit> liste_produit;

	@ManyToOne
	@JoinColumn(name="particulier_id", referencedColumnName="id_Client") // r�f�renc� par l'id_contact
	private Particulier particulier;

	@ManyToOne
	@JoinColumn(name="entreprise_id", referencedColumnName="id_Client") // r�f�renc� par l'id_contact
	private Entreprise entreprise;


	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Commande(Date date, Date date_livraison,
			String conditions_livraison, String modalites_paiement,
			int duree_validite, String statut, Date date_reception) {
		super();
		this.date = date;
		this.date_livraison = date_livraison;
		this.conditions_livraison = conditions_livraison;
		this.modalites_paiement = modalites_paiement;
		this.duree_validite = duree_validite;
		this.statut = statut;
		this.date_reception = date_reception;
	}


	public Commande(int num_commande, Date date, Date date_livraison,
			String conditions_livraison, String modalites_paiement,
			int duree_validite, String statut, Date date_reception) {
		super();
		this.num_commande = num_commande;
		this.date = date;
		this.date_livraison = date_livraison;
		this.conditions_livraison = conditions_livraison;
		this.modalites_paiement = modalites_paiement;
		this.duree_validite = duree_validite;
		this.statut = statut;
		this.date_reception = date_reception;
	}


	public int getNum_commande() {
		return num_commande;
	}


	public void setNum_commande(int num_commande) {
		this.num_commande = num_commande;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public Date getDate_livraison() {
		return date_livraison;
	}


	public void setDate_livraison(Date date_livraison) {
		this.date_livraison = date_livraison;
	}


	public String getConditions_livraison() {
		return conditions_livraison;
	}


	public void setConditions_livraison(String conditions_livraison) {
		this.conditions_livraison = conditions_livraison;
	}


	public String getModalites_paiement() {
		return modalites_paiement;
	}


	public void setModalites_paiement(String modalites_paiement) {
		this.modalites_paiement = modalites_paiement;
	}


	public int getDuree_validite() {
		return duree_validite;
	}


	public void setDuree_validite(int duree_validite) {
		this.duree_validite = duree_validite;
	}


	public String getStatut() {
		return statut;
	}


	public void setStatut(String statut) {
		this.statut = statut;
	}


	public Date getDate_reception() {
		return date_reception;
	}


	public void setDate_reception(Date date_reception) {
		this.date_reception = date_reception;
	}


	public List<Facture> getListe_facture() {
		return liste_facture;
	}


	public void setListe_facture(List<Facture> liste_facture) {
		this.liste_facture = liste_facture;
	}


	public List<Produit> getListe_produit() {
		return liste_produit;
	}


	public void setListe_produit(List<Produit> liste_produit) {
		this.liste_produit = liste_produit;
	}


	public Particulier getParticulier() {
		return particulier;
	}


	public void setParticulier(Particulier particulier) {
		this.particulier = particulier;
	}


	public Entreprise getEntreprise() {
		return entreprise;
	}


	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}









}
