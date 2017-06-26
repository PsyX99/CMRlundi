package fr.inti.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="questionnaire")
public class Questionnaire extends Campagne{
	private String type_questionnaire;
	
	@OneToMany(mappedBy="questionnaire",cascade=CascadeType.ALL)// cascade pour la propagation des op�rations
	private List<Question> liste_question;
	
	@ManyToOne
	@JoinColumn(name="id_produit",referencedColumnName="id_produit")
	private Produit produit;
	
	@ManyToOne
	@JoinColumn(name="id_equipe",referencedColumnName="id_equipe")
	private EquipeCampagne equipe_campagne;
	
	
	public Questionnaire() {
		super();
	}

	public Questionnaire(int id_campagne, String type, String objectif_com,
			String lieu, String type_clients, String forme_annonce,
			String message, String status, String type_questionnaire) {
		super(id_campagne, type, objectif_com, lieu, type_clients, forme_annonce,
				message, status);
		this.type_questionnaire = type_questionnaire;
	}

	public Questionnaire(String type, String objectif_com, String lieu,
			String type_clients, String forme_annonce, String message,
			String status, String type_questionnaire) {
		super(type, objectif_com, lieu, type_clients, forme_annonce, message, status);
		this.type_questionnaire = type_questionnaire;
	}
	
	public String getType_questionnaire() {
		return type_questionnaire;
	}

	public void setType_questionnaire(String type_questionnaire) {
		this.type_questionnaire = type_questionnaire;
	}
	
	
	public List<Question> getListe_question() {
		return liste_question;
	}

	public void setListe_question(List<Question> liste) {
		this.liste_question = liste;
	}
	

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public EquipeCampagne getEquipe_campagne() {
		return equipe_campagne;
	}

	public void setEquipe_campagne(EquipeCampagne equipe_campagne) {
		this.equipe_campagne = equipe_campagne;
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
		return "Questionnaire [type_questionnaire=" + type_questionnaire + "]";
	}
}
