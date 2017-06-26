package fr.inti.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


	@Entity
	@Table(name ="horaires_contact")
	public class Horaires_contact {
		
	    @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
		private int id_horaires_contact;
	    
	    private String heure_debut;
	    
	    private String heure_fin;
	    
	    private String journee;
	    
	    private String saison;
	    
	    @OneToMany(mappedBy="horaires_contact",cascade=CascadeType.ALL)// cascade pour la propagation des op�rations
	    private List<Client> liste_client;
	    
		public int getId_horaires_contact() {
			return id_horaires_contact;
		}
		public void setId_horaires_contact(int id_horaires_contact) {
			this.id_horaires_contact = id_horaires_contact;
		}
		public String getHeure_debut() {
			return heure_debut;
		}
		public void setHeure_debut(String heure_debut) {
			this.heure_debut = heure_debut;
		}
		public String getHeure_fin() {
			return heure_fin;
		}
		public void setHeure_fin(String heure_fin) {
			this.heure_fin = heure_fin;
		}
		public List<Client> getListe_Client() {
			return liste_client;
		}
		public void setListe_Client(List<Client> liste_Client) {
			this.liste_client = liste_Client;
		}	
		public String getJournee() {
			return journee;
		}
		public void setJournee(String journee) {
			this.journee = journee;
		}
		public String getSaison() {
			return saison;
		}
		public void setSaison(String saison) {
			this.saison = saison;
		}
		public List<Client> getListe_client() {
			return liste_client;
		}
		public void setListe_client(List<Client> liste_client) {
			this.liste_client = liste_client;
		}

		public Horaires_contact() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		public Horaires_contact(String heure_debut, String heure_fin,
				String journee, String saison, List<Client> liste_client) {
			super();
			this.heure_debut = heure_debut;
			this.heure_fin = heure_fin;
			this.journee = journee;
			this.saison = saison;
			this.liste_client = liste_client;
		}
		public Horaires_contact(int id_horaires_contact, String heure_debut,
				String heure_fin, String journee, String saison,
				List<Client> liste_client) {
			super();
			this.id_horaires_contact = id_horaires_contact;
			this.heure_debut = heure_debut;
			this.heure_fin = heure_fin;
			this.journee = journee;
			this.saison = saison;
			this.liste_client = liste_client;
		}
		@Override
		public String toString() {
			return "Horaires_contact [id_horaires_contact="
					+ id_horaires_contact + ", heure_debut=" + heure_debut
					+ ", heure_fin=" + heure_fin + ", liste_Client="
					+ liste_client + "]";
		}
	    
}
