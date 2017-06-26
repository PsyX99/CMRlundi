package fr.inti.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Qualifier;

@Entity
@Table(name="particulier")
@Qualifier(value="particulierBean")
public class Particulier extends Client{
	private int num_CIN;
	private String nom;
	private String prenom;
	private Date date_naissance;
	private int nb_enfants;
	private String situ_familial;
	private String cat_sociopro;
	private int age;
	
	@OneToMany(mappedBy="particulier",cascade=CascadeType.ALL)// cascade pour la propagation des op�rations
	private List<CoordPostales> liste_coord_postales;
	
	@OneToMany(mappedBy="particulier",cascade=CascadeType.ALL)// cascade pour la propagation des op�rations
	private List<Contact> liste_contact;
	
	@OneToMany(mappedBy="particulier",cascade=CascadeType.ALL)// cascade pour la propagation des op�rations
	private List<Commande> liste_commande;
	
	@ManyToOne
	@JoinColumn(name="id_horaires_contact",referencedColumnName="id_horaires_contact")
	private HorairesContact horaires_contact;
	
	@ManyToOne
	@JoinColumn(name="id_commercial",referencedColumnName="id_commercial")
	private Commercial commercial;
	
	public int getNum_CIN() {
		return num_CIN;
	}
	public void setNum_CIN(int num_CIN) {
		this.num_CIN = num_CIN;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDate_naissance() {
		return date_naissance;
	}
	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}
	public int getNb_enfants() {
		return nb_enfants;
	}
	public void setNb_enfants(int nb_enfants) {
		this.nb_enfants = nb_enfants;
	}
	public String getSitu_familial() {
		return situ_familial;
	}
	public void setSitu_familial(String situ_familial) {
		this.situ_familial = situ_familial;
	}
	public String getCat_sociopro() {
		return cat_sociopro;
	}
	public void setCat_sociopro(String cat_sociopro) {
		this.cat_sociopro = cat_sociopro;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;}
	
	public List<CoordPostales> getListe_coord_postales() {
		return liste_coord_postales;
	}
	public void setListe_coord_postales(List<CoordPostales> liste_coord_postales) {
		this.liste_coord_postales = liste_coord_postales;
	}
	public List<Contact> getListe_contact() {
		return liste_contact;
	}
	public void setListe_contact(List<Contact> liste_contact) {
		this.liste_contact = liste_contact;
	}
	public List<Commande> getListe_commande() {
		return liste_commande;
	}
	public void setListe_commande(List<Commande> liste_commande) {
		this.liste_commande = liste_commande;
	}
	public HorairesContact getHoraires_contact() {
		return horaires_contact;
	}
	public void setHoraires_contact(HorairesContact horaires_contact) {
		this.horaires_contact = horaires_contact;
	}
	public Commercial getCommercial() {
		return commercial;
	}
	public void setCommercial(Commercial commercial) {
		this.commercial = commercial;
	}
	public Particulier(String moyen_com_prefere, int famille_Client,
			int niveau_Client) {
		super(moyen_com_prefere, famille_Client, niveau_Client);
	}
	
	public Particulier(String moyen_com_prefere, int famille_Client,
			int niveau_Client,int num_CIN, String nom, String prenom,
			Date date_naissance, int nb_enfants, String situ_familial,
			String cat_sociopro, int age) {
		super(moyen_com_prefere, famille_Client, niveau_Client);
		this.num_CIN = num_CIN;
		this.nom = nom;
		this.prenom = prenom;
		this.date_naissance = date_naissance;
		this.nb_enfants = nb_enfants;
		this.situ_familial = situ_familial;
		this.cat_sociopro = cat_sociopro;
		this.age = age;
	}
	public Particulier() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Particulier [num_CIN=" + num_CIN + ", nom=" + nom + ", prenom="
				+ prenom + ", date_naissance=" + date_naissance
				+ ", nb_enfants=" + nb_enfants + ", situ_familial="
				+ situ_familial + ", cat_sociopro=" + cat_sociopro + ", age="
				+ age + "]";
	}
	



	

}
