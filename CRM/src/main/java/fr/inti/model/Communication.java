package fr.inti.model;

import java.util.Date;

public class Communication {

	private Date date;
	private Date heure;
	private String sens;
	private String moyen_com;
	private String objet;
	
	
	
//Getters and Setters	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getHeure() {
		return heure;
	}
	public void setHeure(Date heure) {
		this.heure = heure;
	}
	public String getSens() {
		return sens;
	}
	public void setSens(String sens) {
		this.sens = sens;
	}
	public String getMoyen_com() {
		return moyen_com;
	}
	public void setMoyen_com(String moyen_com) {
		this.moyen_com = moyen_com;
	}
	public String getObjet() {
		return objet;
	}
	public void setObjet(String objet) {
		this.objet = objet;
	}
	
	
	// Constructeurs
	
	public Communication(Date date, Date heure, String sens, String moyen_com,
			String objet) {
		super();
		this.date = date;
		this.heure = heure;
		this.sens = sens;
		this.moyen_com = moyen_com;
		this.objet = objet;
	}
	public Communication() {
		super();
	}
	
// Methode toString
	
	@Override
	public String toString() {
		return "Communication [date=" + date + ", heure=" + heure + ", sens="
				+ sens + ", moyen_com=" + moyen_com + ", objet=" + objet + "]";
	}
	
	

	
}
