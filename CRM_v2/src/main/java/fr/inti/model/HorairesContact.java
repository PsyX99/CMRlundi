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
	public class HorairesContact {
		
	    @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
		private int id_horaires_contact;
	    
	    private String heure_debut;
	    
	    private String heure_fin;
	    
	    private String journee;
	    
	    private String saison;
	    
	    @OneToMany(mappedBy="horaires_contact",cascade=CascadeType.ALL)// cascade pour la propagation des op�rations
	    private List<Particulier> liste_particulier;
	    
	    @OneToMany(mappedBy="horaires_contact",cascade=CascadeType.ALL)// cascade pour la propagation des op�rations
	    private List<Entreprise> liste_entreprise;
	    
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
		public List<Particulier> getListe_particulier() {
			return liste_particulier;
		}
		public void setListe_particulier(List<Particulier> liste_particulier) {
			this.liste_particulier = liste_particulier;
		}
		public List<Entreprise> getListe_entreprise() {
			return liste_entreprise;
		}
		public void setListe_entreprise(List<Entreprise> liste_entreprise) {
			this.liste_entreprise = liste_entreprise;
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

		public HorairesContact() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		public HorairesContact(String heure_debut, String heure_fin,
				String journee, String saison) {
			super();
			this.heure_debut = heure_debut;
			this.heure_fin = heure_fin;
			this.journee = journee;
			this.saison = saison;
		}
		public HorairesContact(int id_horaires_contact, String heure_debut,
				String heure_fin, String journee, String saison) {
			super();
			this.id_horaires_contact = id_horaires_contact;
			this.heure_debut = heure_debut;
			this.heure_fin = heure_fin;
			this.journee = journee;
			this.saison = saison;
		}
		@Override
		public String toString() {
			return "Horaires_contact [id_horaires_contact="
					+ id_horaires_contact + ", heure_debut=" + heure_debut
					+ ", heure_fin=" + heure_fin + "]";
		}
	    
}
