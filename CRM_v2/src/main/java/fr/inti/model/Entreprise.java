package fr.inti.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "entreprise")
public class Entreprise extends Client{

	private int id_fiscal;
	private String raison_sociale;
	private Date date_creation;
	private int nb_employes;
	private String forme_juridique;
	private long capital;

	@OneToMany(mappedBy = "entreprise", cascade=CascadeType.ALL)
	private List<CoordElec> liste_coord_elec;
	@OneToMany(mappedBy = "entreprise", cascade=CascadeType.ALL)
	private List<CoordTel> liste_coord_tel;
	
	@OneToMany(mappedBy="entreprise",cascade=CascadeType.ALL)// cascade pour la propagation des op�rations
	private List<CoordPostales> liste_coord_postales;
	
	@OneToMany(mappedBy="entreprise",cascade=CascadeType.ALL)// cascade pour la propagation des op�rations
	private List<Contact> liste_contact;
	
	@OneToMany(mappedBy="entreprise",cascade=CascadeType.ALL)// cascade pour la propagation des op�rations
	private List<Commande> liste_commande;
	
	@ManyToOne
	@JoinColumn(name="id_horaires_contact",referencedColumnName="id_horaires_contact")
	private HorairesContact horaires_contact;
	
	@ManyToOne
	@JoinColumn(name="id_commercial",referencedColumnName="id_commercial")
	private Commercial commercial;


	//+++++++++++++++ CONSTRUCTEURS ++++++++++++++++++++++

	public Entreprise(int id_fiscal, String raison_sociale, Date date_creation,
			int nb_employes, String forme_juridique, long capital) {
		super();
		this.id_fiscal = id_fiscal;
		this.raison_sociale = raison_sociale;
		this.date_creation = date_creation;
		this.nb_employes = nb_employes;
		this.forme_juridique = forme_juridique;
		this.capital = capital;
	}


	public Entreprise(String raison_sociale, Date date_creation,
			int nb_employes, String forme_juridique, long capital) {
		super();
		this.raison_sociale = raison_sociale;
		this.date_creation = date_creation;
		this.nb_employes = nb_employes;
		this.forme_juridique = forme_juridique;
		this.capital = capital;
	}


	public Entreprise() {
		super();
	}


	//++++++++++++++ GETTERS AND SETTERS +++++++++++++++++







	public int getId_fiscal() {
		return id_fiscal;
	}

	public void setId_fiscal(int id_fiscal) {
		this.id_fiscal = id_fiscal;
	}
	public String getRaison_sociale() {
		return raison_sociale;
	}
	public void setRaison_sociale(String raison_sociale) {
		this.raison_sociale = raison_sociale;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	public int getNb_employes() {
		return nb_employes;
	}
	public void setNb_employes(int nb_employes) {
		this.nb_employes = nb_employes;
	}
	public String getForme_juridique() {
		return forme_juridique;
	}
	public void setForme_juridique(String forme_juridique) {
		this.forme_juridique = forme_juridique;
	}
	public long getCapital() {
		return capital;
	}
	public void setCapital(long capital) {
		this.capital = capital;
	}


	public List<CoordElec> getListe_coord_elec() {
		return liste_coord_elec;
	}


	public void setListe_coord_elec(List<CoordElec> liste_coord_elec) {
		this.liste_coord_elec = liste_coord_elec;
	}


	public List<CoordTel> getListe_coord_tel() {
		return liste_coord_tel;
	}


	public void setListe_coord_tel(List<CoordTel> liste_coord_tel) {
		this.liste_coord_tel = liste_coord_tel;
	}


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
	

}
