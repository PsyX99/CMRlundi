package fr.inti.model;



import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="proposition_commerciale")
public class Proposition_commerciale {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_propal;
	
	@Temporal(TemporalType.DATE)
	private Date date;

	@Temporal(TemporalType.DATE)
	private Date date_livraison;
	
	private String condition_livraison;
	
	private String modalites_paiement;

	private int duree_valide;
	
	private String statut;
	
	
	 @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	 @JoinTable(name="produit_proposition_jointure",
	 joinColumns=@JoinColumn(name="id_produit"),
	 inverseJoinColumns=@JoinColumn(name="id_propal"))
	 private List<Produit> liste_produit;
	 
	 @ManyToOne
	 @JoinColumn(name="id_equipe", referencedColumnName="id_equipe")
	 private Equipe_com equipe_com;
	
	
	public Proposition_commerciale() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Proposition_commerciale(int id_propal, Date date,
			Date date_livraison, String condition_livraison,
			String modalites_paiement, int duree_valide, String statut) {
		super();
		this.id_propal = id_propal;
		this.date = date;
		this.date_livraison = date_livraison;
		this.condition_livraison = condition_livraison;
		this.modalites_paiement = modalites_paiement;
		this.duree_valide = duree_valide;
		this.statut = statut;
	}


	public Proposition_commerciale(Date date, Date date_livraison,
			String condition_livraison, String modalites_paiement,
			int duree_valide, String statut) {
		super();
		this.date = date;
		this.date_livraison = date_livraison;
		this.condition_livraison = condition_livraison;
		this.modalites_paiement = modalites_paiement;
		this.duree_valide = duree_valide;
		this.statut = statut;
	}


	public int getId_propal() {
		return id_propal;
	}


	public void setId_propal(int id_propal) {
		this.id_propal = id_propal;
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


	public String getCondition_livraison() {
		return condition_livraison;
	}


	public void setCondition_livraison(String condition_livraison) {
		this.condition_livraison = condition_livraison;
	}


	public String getModalites_paiement() {
		return modalites_paiement;
	}


	public void setModalites_paiement(String modalites_paiement) {
		this.modalites_paiement = modalites_paiement;
	}


	public int getDuree_valide() {
		return duree_valide;
	}


	public void setDuree_valide(int duree_valide) {
		this.duree_valide = duree_valide;
	}


	public String getStatut() {
		return statut;
	}


	public void setStatut(String statut) {
		this.statut = statut;
	}


	public List<Produit> getListe_produit() {
		return liste_produit;
	}


	public void setListe_produit(List<Produit> liste_produit) {
		this.liste_produit = liste_produit;
	}


	public Equipe_com getEquipe_com() {
		return equipe_com;
	}


	public void setEquipe_com(Equipe_com equipe_com) {
		this.equipe_com = equipe_com;
	}




	
	
}
