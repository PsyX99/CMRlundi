package fr.inti.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Client {
	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int id_Client;
    private String moyen_com_prefere;
    private int famille_Client;
    private int niveau_Client;
	
	public int getId_Client() {
		return id_Client;
	}
	public void setId_Client(int id_Client) {
		this.id_Client = id_Client;
	}
	public String getMoyen_com_prefere() {
		return moyen_com_prefere;
	}
	public void setMoyen_com_prefere(String moyen_com_prefere) {
		this.moyen_com_prefere = moyen_com_prefere;
	}
	public int getFamille_Client() {
		return famille_Client;
	}
	public void setFamille_Client(int famille_Client) {
		this.famille_Client = famille_Client;
	}
	public int getNiveau_Client() {
		return niveau_Client;
	}
	public void setNiveau_Client(int niveau_Client) {
		this.niveau_Client = niveau_Client;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(String moyen_com_prefere, int famille_Client,
			int niveau_Client) {
		super();
		this.moyen_com_prefere = moyen_com_prefere;
		this.famille_Client = famille_Client;
		this.niveau_Client = niveau_Client;
	}
	
	@Override
	public String toString() {
		return "Client [id_Client=" + id_Client + ", moyen_com_prefere="
				+ moyen_com_prefere + ", famille_Client=" + famille_Client
				+ ", niveau_Client=" + niveau_Client + "]";
	}
	
   }