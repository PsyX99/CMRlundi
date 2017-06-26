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

@Entity
@Table(name="fiche_client")
public class FicheClient {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_fiche_client;
	
	private String type;
	
	private Date date_decouverte;
	
	private int prob_aboutissement;
	
	private double ca_previsionnel;
	
	private Date date_parution;
	
	private Date date_limite_reponse;
	
	
	 @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	 @JoinTable(name="facture_fiche_jointure",
	 joinColumns=@JoinColumn(name="id_produit"),
	 inverseJoinColumns=@JoinColumn(name="id_fiche_client"))
	 private List<Produit> liste_produit;
	 
	 
	 @ManyToOne
	 @JoinColumn(name="id_equipe", referencedColumnName="id_equipe")
	 private EquipeCom equipe_com;
	
	public FicheClient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FicheClient(int id_fiche_client, String type, Date date_decouverte,
			int prob_aboutissement, double ca_previsionnel, Date date_parution,
			Date date_limite_reponse) {
		super();
		this.id_fiche_client = id_fiche_client;
		this.type = type;
		this.date_decouverte = date_decouverte;
		this.prob_aboutissement = prob_aboutissement;
		this.ca_previsionnel = ca_previsionnel;
		this.date_parution = date_parution;
		this.date_limite_reponse = date_limite_reponse;
	}

	public FicheClient(String type, Date date_decouverte,
			int prob_aboutissement, double ca_previsionnel, Date date_parution,
			Date date_limite_reponse) {
		super();
		this.type = type;
		this.date_decouverte = date_decouverte;
		this.prob_aboutissement = prob_aboutissement;
		this.ca_previsionnel = ca_previsionnel;
		this.date_parution = date_parution;
		this.date_limite_reponse = date_limite_reponse;
	}

	public int getId_fiche_client() {
		return id_fiche_client;
	}

	public void setId_fiche_client(int id_fiche_client) {
		this.id_fiche_client = id_fiche_client;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getDate_decouverte() {
		return date_decouverte;
	}

	public void setDate_decouverte(Date date_decouverte) {
		this.date_decouverte = date_decouverte;
	}

	public int getProb_aboutissement() {
		return prob_aboutissement;
	}

	public void setProb_aboutissement(int prob_aboutissement) {
		this.prob_aboutissement = prob_aboutissement;
	}

	public double getCa_previsionnel() {
		return ca_previsionnel;
	}

	public void setCa_previsionnel(double ca_previsionnel) {
		this.ca_previsionnel = ca_previsionnel;
	}

	public Date getDate_parution() {
		return date_parution;
	}

	public void setDate_parution(Date date_parution) {
		this.date_parution = date_parution;
	}

	public Date getDate_limite_reponse() {
		return date_limite_reponse;
	}

	public void setDate_limite_reponse(Date date_limite_reponse) {
		this.date_limite_reponse = date_limite_reponse;
	}


	public List<Produit> getListe_produit() {
		return liste_produit;
	}

	public void setListe_produit(List<Produit> liste_produit) {
		this.liste_produit = liste_produit;
	}

	public EquipeCom getEquipe_com() {
		return equipe_com;
	}

	public void setEquipe_com(EquipeCom equipe_com) {
		this.equipe_com = equipe_com;
	}


	
	
	
}
