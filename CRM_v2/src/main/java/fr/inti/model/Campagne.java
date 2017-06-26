package fr.inti.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Campagne {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_campagne;
	private String type;
	private String objectif_com;
	private String lieu;
	private String type_clients;
	private String forme_annonce;
	private String message;
	private String status;

	
	public Campagne() {
		super();
	}
	
	public Campagne(String type, String objectif_com,
			String lieu, String type_clients, String forme_annonce,
			String message, String status) {
		super();
		this.type = type;
		this.objectif_com = objectif_com;
		this.lieu = lieu;
		this.type_clients = type_clients;
		this.forme_annonce = forme_annonce;
		this.message = message;
		this.status = status;
	}
	
	public Campagne(int id_campagne, String type, String objectif_com,
			String lieu, String type_clients, String forme_annonce,
			String message, String status) {
		super();
		this.id_campagne = id_campagne;
		this.type = type;
		this.objectif_com = objectif_com;
		this.lieu = lieu;
		this.type_clients = type_clients;
		this.forme_annonce = forme_annonce;
		this.message = message;
		this.status = status;
	}
	
	public int getId_campagne() {
		return id_campagne;
	}

	public void setId_campagne(int id_campagne) {
		this.id_campagne = id_campagne;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getObjectif_com() {
		return objectif_com;
	}

	public void setObjectif_com(String objectif_com) {
		this.objectif_com = objectif_com;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public String getType_clients() {
		return type_clients;
	}

	public void setType_clients(String type_clients) {
		this.type_clients = type_clients;
	}

	public String getForme_annonce() {
		return forme_annonce;
	}

	public void setForme_annonce(String forme_annonce) {
		this.forme_annonce = forme_annonce;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Campagne [id_campagne=" + id_campagne + ", type=" + type
				+ ", objectif_com=" + objectif_com + ", lieu=" + lieu
				+ ", type_clients=" + type_clients + ", forme_annonce="
				+ forme_annonce + ", message=" + message + ", status=" + status
				+ "]";
	}
}
