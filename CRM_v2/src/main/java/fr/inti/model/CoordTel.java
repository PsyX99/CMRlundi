package fr.inti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "coord_tel")

public class CoordTel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_num_tel;
	private String numero;
	private String type;
	private String nature;
	private String categorie;
	private int priorite;
	
	@ManyToOne
	@JoinColumn(name="entreprise_id", referencedColumnName="id_fiscal") // r�f�renc� par l'id_fiscal
	private Entreprise entreprise;
	
	@ManyToOne
	@JoinColumn(name="contact_id", referencedColumnName="id_contact") // r�f�renc� par l'id_contact
	private Contact contact;
	
	
	//+++++++++++++++++++ GETS++++++++++++++++++++
	
	public int getId_num_tel() {
		return id_num_tel;
	}
	public void setId_num_tel(int id_num_tel) {
		this.id_num_tel = id_num_tel;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNature() {
		return nature;
	}
	public void setNature(String nature) {
		this.nature = nature;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public int getPriorite() {
		return priorite;
	}
	public void setPriorite(int priorite) {
		this.priorite = priorite;
	}
	
	
	//+++++++++++++++ CONSTRUCTEURS +++++++++++++++++++++
	
	
	public CoordTel(int id_num_tel, String numero, String type, String nature,
			String categorie, int priorite) {
		super();
		this.id_num_tel = id_num_tel;
		this.numero = numero;
		this.type = type;
		this.nature = nature;
		this.categorie = categorie;
		this.priorite = priorite;
	}
	public CoordTel(String numero, String type, String nature,
			String categorie, int priorite) {
		super();
		this.numero = numero;
		this.type = type;
		this.nature = nature;
		this.categorie = categorie;
		this.priorite = priorite;
	}
	public CoordTel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
