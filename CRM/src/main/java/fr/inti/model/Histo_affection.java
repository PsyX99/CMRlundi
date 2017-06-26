package fr.inti.model;

import java.util.Date;

public class Histo_affection {
	private Date date_debut;
	private Date date_fin;
	private int num_ordre;
	public Date getDate_debut() {
		return date_debut;
	}
	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}
	public Date getDate_fin() {
		return date_fin;
	}
	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}
	public int getNum_ordre() {
		return num_ordre;
	}
	public void setNum_ordre(int num_ordre) {
		this.num_ordre = num_ordre;
	}
	public Histo_affection(Date date_debut, Date date_fin, int num_ordre) {
		super();
		this.date_debut = date_debut;
		this.date_fin = date_fin;
		this.num_ordre = num_ordre;
	}
	public Histo_affection() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Histo_affection [date_debut=" + date_debut + ", date_fin="
				+ date_fin + ", num_ordre=" + num_ordre + "]";
	}

}
