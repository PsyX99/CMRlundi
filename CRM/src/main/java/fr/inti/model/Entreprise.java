package fr.inti.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private List<Coord_elec> liste_coord_elec;
	@OneToMany(mappedBy = "entreprise", cascade=CascadeType.ALL)
	private List<Coord_tel> liste_coord_tel;


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
	

}
