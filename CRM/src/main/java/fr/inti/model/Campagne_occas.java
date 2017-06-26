package fr.inti.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="campagne_occas")
public class Campagne_occas extends Campagne{
	
	private Date date_debut;
	private Date date_fin;
	
	public Campagne_occas() {
		super();
	}
	
	public Campagne_occas(String type, String objectif_com, String lieu,
			String type_clients, String forme_annonce, String message,
			String status, Date date_debut, Date date_fin) {
		super(type, objectif_com, lieu, type_clients, forme_annonce, message, status);
		this.date_debut = date_debut;
		this.date_fin = date_fin;
	}
	
	public Campagne_occas(int id_campagne, String type, String objectif_com,
			String lieu, String type_clients, String forme_annonce,
			String message, String status, Date date_debut, Date date_fin) {
		super(id_campagne, type, objectif_com, lieu, type_clients, forme_annonce,
				message, status);
		this.date_debut = date_debut;
		this.date_fin = date_fin;
	}

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
	@Override
	public int getId_campagne() {
		// TODO Auto-generated method stub
		return super.getId_campagne();
	}
	@Override
	public void setId_campagne(int id_campagne) {
		// TODO Auto-generated method stub
		super.setId_campagne(id_campagne);
	}
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return super.getType();
	}
	@Override
	public void setType(String type) {
		// TODO Auto-generated method stub
		super.setType(type);
	}
	@Override
	public String getObjectif_com() {
		// TODO Auto-generated method stub
		return super.getObjectif_com();
	}
	@Override
	public void setObjectif_com(String objectif_com) {
		// TODO Auto-generated method stub
		super.setObjectif_com(objectif_com);
	}
	@Override
	public String getLieu() {
		// TODO Auto-generated method stub
		return super.getLieu();
	}
	@Override
	public void setLieu(String lieu) {
		// TODO Auto-generated method stub
		super.setLieu(lieu);
	}
	@Override
	public String getType_clients() {
		// TODO Auto-generated method stub
		return super.getType_clients();
	}
	@Override
	public void setType_clients(String type_clients) {
		// TODO Auto-generated method stub
		super.setType_clients(type_clients);
	}
	@Override
	public String getForme_annonce() {
		// TODO Auto-generated method stub
		return super.getForme_annonce();
	}
	@Override
	public void setForme_annonce(String forme_annonce) {
		// TODO Auto-generated method stub
		super.setForme_annonce(forme_annonce);
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}
	@Override
	public void setMessage(String message) {
		// TODO Auto-generated method stub
		super.setMessage(message);
	}
	@Override
	public String getStatus() {
		// TODO Auto-generated method stub
		return super.getStatus();
	}
	@Override
	public void setStatus(String status) {
		// TODO Auto-generated method stub
		super.setStatus(status);
	}
	@Override
	public String toString() {
		return "Campagne_occas [date_debut=" + date_debut + ", date_fin="
				+ date_fin + "]";
	}
}
