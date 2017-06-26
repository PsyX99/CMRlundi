package fr.inti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "coord_elec")
public class Coord_elec {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_email;

	private String adresse;
	private String type;
	
	@ManyToOne
    @JoinColumn(name="contact_id", referencedColumnName="id_contact") // r�f�renc� par l'id_contact
	private Contact contact;
	
	@ManyToOne
    @JoinColumn(name="entreprise_id", referencedColumnName="id_fiscal") // r�f�renc� par l'id_contact
	private Entreprise entreprise;

	// +++++++++++++++ GETS ++++++++++++++++

	public int getId_email() {
		return id_email;
	}

	public void setId_email(int id_email) {
		this.id_email = id_email;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	// +++++++++++++++ CONSTRUCTEURS +++++++++++++++++

	public Coord_elec(int id_email, String adresse, String type) {
		super();
		this.id_email = id_email;
		this.adresse = adresse;
		this.type = type;
	}

	public Coord_elec(String adresse, String type) {
		super();
		this.adresse = adresse;
		this.type = type;
	}

	public Coord_elec() {
		super();
		// TODO Auto-generated constructor stub
	}

}
