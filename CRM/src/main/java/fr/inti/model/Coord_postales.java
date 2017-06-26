package fr.inti.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "coord_postales")
public class Coord_postales implements Serializable
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_coord_postales;
	
	@Column(name="numero")
	private int numero;
	
	@Column(name="rue")
	private String rue;
	
	@Column(name="type")
	private String type ;
	
	@Column(name="code_postal")
	private int code_postal ;
	
	@Column(name="ville")
	private String ville ;
	
	@Column(name="region")
	private String region ;
	
	@Column(name="pays")
	private String pays ;
	
	public int getId_Coord_postales() {
		return id_coord_postales;
	}

	public void setId_Coord_postales(int id_coord_postales) {
		this.id_coord_postales = id_coord_postales;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int Numero) {
		numero = Numero;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String Rue) {
		rue = Rue;
	}

	public String getType() {
		return type;
	}

	public void setType(String Type) {
		type = Type;
	}

	public int getCode_postal() {
		return code_postal;
	}

	public void setCode_postal(int Code_postal) {
		code_postal = Code_postal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String Ville) {
		ville = Ville;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String Region) {
		region = Region;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String Pays) {
		pays = Pays;
	}

	public Coord_postales(int id_coord_postales, int Numero, String Rue,
			String Type, int Code_postal, String Ville, String Region,
			String Pays) {
		super();
		this.id_coord_postales = id_coord_postales;
		numero = Numero;
		rue = Rue;
		this.type = Type;
		code_postal = Code_postal;
		ville = Ville;
		region = Region;
		pays = Pays;
	}

	public Coord_postales(int Numero, String Rue, String Type,
			int Code_postal, String Ville, String Region, String Pays) {
		super();
		numero = Numero;
		rue = Rue;
		this.type = Type;
		code_postal = Code_postal;
		ville = Ville;
		region = Region;
		pays = Pays;
	}

	public Coord_postales() 
	{
		
	}
	
	@Override
	public String toString() 
	{
		return "Coord_postales [Numero=" + numero + ", Rue=" + rue + ", Type="
				+ type + ", Code_postal=" + code_postal + ", Ville=" + ville
				+ ", Region=" + region + ", Pays=" + pays + "]";
	}
	
	//Cette m�thde permet d'�crire les coordon�es postales uniquement en majuscule.
	public String MAJ_coord_postales(Coord_postales coord_postale)
	{
		String MAJ_coord_postale = new String();
		
		MAJ_coord_postale = coord_postale.getNumero() + " " +
							coord_postale.getRue() + " " +
							coord_postale.getType() + " " +
							coord_postale.getCode_postal() + " " +
							coord_postale.getVille() + " " +
							coord_postale.getRegion() +  " " +
							coord_postale.getPays();
		
		MAJ_coord_postale.toUpperCase();
		
		return MAJ_coord_postale;
	}
}
