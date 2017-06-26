package fr.inti.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.List;;
@MappedSuperclass
@Entity
@Table(name ="client")
public class Client {
	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int id_Client;
    private String moyen_com_prefere;
    private int famille_Client;
    private int niveau_Client;
    
    @OneToMany(mappedBy="client",cascade=CascadeType.ALL)// cascade pour la propagation des op�rations
	private List<Coord_postales> liste_coord_postales;
	
	@OneToMany(mappedBy="client",cascade=CascadeType.ALL)// cascade pour la propagation des op�rations
	private List<Contact> liste_contact;
	
	@OneToMany(mappedBy="client",cascade=CascadeType.ALL)// cascade pour la propagation des op�rations
	private List<Commande> liste_commande;
	
	@ManyToOne
	@JoinColumn(name="id_horaires_contact",referencedColumnName="id_horaires_contact")
	private Horaires_contact horaires_contact;
	
	@ManyToOne
	@JoinColumn(name="id_commercial",referencedColumnName="id_commercial")
	private Commercial commercial;
	
	public int getId_Client() {
		return id_Client;
	}
	public void setId_Client(int id_Client) {
		this.id_Client = id_Client;
	}
	public String getMoyen_com_prefere() {
		return moyen_com_prefere;
	}
	public void setMoyen_com_prefere(String moyen_com_prefere) {
		this.moyen_com_prefere = moyen_com_prefere;
	}
	public int getFamille_Client() {
		return famille_Client;
	}
	public void setFamille_Client(int famille_Client) {
		this.famille_Client = famille_Client;
	}
	public int getNiveau_Client() {
		return niveau_Client;
	}
	public void setNiveau_Client(int niveau_Client) {
		this.niveau_Client = niveau_Client;
	}
	public List<Coord_postales> getListe_Coord_postales() {
		return liste_coord_postales;
	}
	public void setListe_Coord_postales(List<Coord_postales> liste_Coord_postales) {
		this.liste_coord_postales = liste_Coord_postales;
	}
	public List<Contact> getListe_Contact() {
		return liste_contact;
	}
	public void setListe_Contact(List<Contact> liste_Contact) {
		this.liste_contact = liste_Contact;
	}
	public List<Commande> getListe_Commande() {
		return liste_commande;
	}
	public void setListe_Commande(List<Commande> liste_Commande) {
		this.liste_commande = liste_Commande;
	}
	public Horaires_contact getHoraires_contact() {
		return horaires_contact;
	}
	public void setHoraires_contact(Horaires_contact horaires_contact) {
		this.horaires_contact = horaires_contact;
	}
	public Commercial getCommercial() {
		return commercial;
	}
	public void setCommercial(Commercial commercial) {
		this.commercial = commercial;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(String moyen_com_prefere, int famille_Client,
			int niveau_Client, List<Coord_postales> liste_Coord_postales,
			List<Contact> liste_Contact, List<Commande> liste_Commande,
			Horaires_contact horaires_contact, Commercial commercial) {
		super();
		this.moyen_com_prefere = moyen_com_prefere;
		this.famille_Client = famille_Client;
		this.niveau_Client = niveau_Client;
		this.liste_coord_postales = liste_Coord_postales;
		this.liste_contact = liste_Contact;
		this.liste_commande = liste_Commande;
		this.horaires_contact = horaires_contact;
		this.commercial = commercial;
	}
	
	public Client(String moyen_com_prefere, int famille_Client,
			int niveau_Client) {
		super();
		this.moyen_com_prefere = moyen_com_prefere;
		this.famille_Client = famille_Client;
		this.niveau_Client = niveau_Client;
	}
	@Override
	public String toString() {
		return "Client [id_Client=" + id_Client + ", moyen_com_prefere="
				+ moyen_com_prefere + ", famille_Client=" + famille_Client
				+ ", niveau_Client=" + niveau_Client + "]";
	}
	
   }