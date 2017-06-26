package fr.inti.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "contact")
public class Contact {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_contact;
	
	private String nom_contact;
	private String prenom_contact;
	private String fonction;
	
	@OneToMany(mappedBy = "contact", cascade=CascadeType.ALL)
	private List<Coord_elec> liste_coord_elec;
	
	@OneToMany(mappedBy = "contact", cascade=CascadeType.ALL)
	private List<Coord_tel> liste_coord_tel;
	
	@ManyToOne
    @JoinColumn(name="client_id", referencedColumnName="id_Client") // r�f�renc� par l'id_contact
	private Client client;
	
	@OneToOne(mappedBy="contact")
	private Commercial commercial;
	
	//++++++++++++++++ GETS ++++++++++++++++++++
	
	
	public int getId_contact() {
		return id_contact;
	}
	public void setId_contact(int id_contact) {
		this.id_contact = id_contact;
	}
	public String getNom_contact() {
		return nom_contact;
	}
	public void setNom_contact(String nom_contact) {
		this.nom_contact = nom_contact;
	}
	public String getPrenom_contact() {
		return prenom_contact;
	}
	public void setPrenom_contact(String prenom_contact) {
		this.prenom_contact = prenom_contact;
	}
	public String getFonction() {
		return fonction;
	}
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	public List<Coord_elec> getListe_coord_elec() {
		return liste_coord_elec;
	}
	public void setListe_coord_elec(List<Coord_elec> liste_coord_elec) {
		this.liste_coord_elec = liste_coord_elec;
	}
	public List<Coord_tel> getListe_coord_tel() {
		return liste_coord_tel;
	}
	public void setListe_coord_tel(List<Coord_tel> liste_coord_tel) {
		this.liste_coord_tel = liste_coord_tel;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Commercial getCommercial() {
		return commercial;
	}
	public void setCommercial(Commercial commercial) {
		this.commercial = commercial;
	}
	
	//++++++++++++++++ CONSTRUCTEURS +++++++++++++++++++++++
	
	
	
	public Contact(int id_contact, String nom_contact, String prenom_contact,
			String fonction) {
		super();
		this.id_contact = id_contact;
		this.nom_contact = nom_contact;
		this.prenom_contact = prenom_contact;
		this.fonction = fonction;
	}
	public Contact(String nom_contact, String prenom_contact, String fonction) {
		super();
		this.nom_contact = nom_contact;
		this.prenom_contact = prenom_contact;
		this.fonction = fonction;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
