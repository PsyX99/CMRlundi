package fr.inti.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table (name="commercial")
public class Commercial implements Serializable{
	
private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id_commercial;

private String nom;
private String prenom;
private String fonction;
private Date date_recrutement;
private double salaire_base;
private double taux_commission;

@OneToMany(mappedBy = "commercial", cascade=CascadeType.ALL)
private List<Client> liste_client;

@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "id_equipe", referencedColumnName="id_equipe")
private Equipe_com equipe_com;

@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "id_equipe", referencedColumnName="id_equipe")
private Equipe_campagne equipe_campagne;

@OneToOne
@JoinColumn(name = "id_contact", referencedColumnName="id_contact")
private Contact contact;


// Getter and Setter

public int getId_commercial() {
	return id_commercial;
}

public void setId_commercial(int id_commercial) {
	this.id_commercial = id_commercial;
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

public String getFonction() {
	return fonction;
}

public void setFonction(String fonction) {
	this.fonction = fonction;
}

public Date getDate_recrutement() {
	return date_recrutement;
}

public void setDate_recrutement(Date date_recrutement) {
	this.date_recrutement = date_recrutement;
}

public double getSalaire_base() {
	return salaire_base;
}

public void setSalaire_base(double salaire_base) {
	this.salaire_base = salaire_base;
}

public double getTaux_commission() {
	return taux_commission;
}

public void setTaux_commission(double taux_commission) {
	this.taux_commission = taux_commission;
}

public List<Client> getListe_client() {
	return liste_client;
}

public void setListe_client(List<Client> liste_client) {
	this.liste_client = liste_client;
}

public Equipe_com getEquipe_com() {
	return equipe_com;
}

public void setEquipe_com(Equipe_com equipe_com) {
	this.equipe_com = equipe_com;
}


public Equipe_campagne getEquipe_campagne() {
	return equipe_campagne;
}

public void setEquipe_campagne(Equipe_campagne equipe_campagne) {
	this.equipe_campagne = equipe_campagne;
}

public Contact getContact() {
	return contact;
}

public void setContact(Contact contact) {
	this.contact = contact;
}

//Constructeurs

public Commercial(int id_commercial, String nom, String prenom,
		String fonction, Date date_recrutement, double salaire_base,
		double taux_commission) {
	super();
	this.id_commercial = id_commercial;
	this.nom = nom;
	this.prenom = prenom;
	this.fonction = fonction;
	this.date_recrutement = date_recrutement;
	this.salaire_base = salaire_base;
	this.taux_commission = taux_commission;
}

public Commercial(String nom, String prenom, String fonction,
		Date date_recrutement, double salaire_base, double taux_commission) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.fonction = fonction;
	this.date_recrutement = date_recrutement;
	this.salaire_base = salaire_base;
	this.taux_commission = taux_commission;
}

public Commercial() {
	super();
}


// Methode toString
@Override
public String toString() {
	return "Commercial [id_commercial=" + id_commercial + ", nom=" + nom
			+ ", prenom=" + prenom + ", fonction=" + fonction
			+ ", date_recrutement=" + date_recrutement + ", salaire_base="
			+ salaire_base + ", taux_commission=" + taux_commission
			+ ", equipe_com=" + equipe_com + ", equipe_campagne="
			+ equipe_campagne + "]";
}

}
