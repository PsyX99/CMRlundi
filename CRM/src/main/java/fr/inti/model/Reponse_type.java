package fr.inti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="reponse_type")
public class Reponse_type {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_reponse;
	private String intitule_reponse;
	
	@ManyToOne
	@JoinColumn(name="id_question",referencedColumnName="id_question")
	private Question question;
	
	public Reponse_type() {
		super();
	}
	
	public Reponse_type(String intitule_reponse) {
		super();
		this.intitule_reponse = intitule_reponse;
	}

	public Reponse_type(int id_reponse, String intitule_reponse) {
		super();
		this.id_reponse = id_reponse;
		this.intitule_reponse = intitule_reponse;
	}

	public int getId_reponse() {
		return id_reponse;
	}

	public void setId_reponse(int id_reponse) {
		this.id_reponse = id_reponse;
	}

	public String getIntitule_reponse() {
		return intitule_reponse;
	}

	public void setIntitule_reponse(String intitule_reponse) {
		this.intitule_reponse = intitule_reponse;
	}
	
	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "Reponse_type [id_reponse=" + id_reponse + ", intitule_reponse="
				+ intitule_reponse + "]";
	}
	
	
	
	
}
