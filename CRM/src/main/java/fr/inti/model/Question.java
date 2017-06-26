package fr.inti.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="question")
public class Question {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_question;
	private String label;
	
	@OneToMany(mappedBy="question",cascade=CascadeType.ALL)// cascade pour la propagation des op�rations
	private List<Reponse_type> liste_reponse_type;
	
	@ManyToOne
	@JoinColumn(name="id_campagne",referencedColumnName="id_campagne")
	private Questionnaire questionnaire;
	
	public Question() {
		super();
	}
	
	public Question(String label) {
		super();
		this.label = label;
	}
	
	public Question(int id_question, String label) {
		super();
		this.id_question = id_question;
		this.label = label;
	}
	
	public int getId_question() {
		return id_question;
	}
	public void setId_question(int id_question) {
		this.id_question = id_question;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	
	public List<Reponse_type> getListe() {
		return liste_reponse_type;
	}

	public void setListe(List<Reponse_type> liste) {
		this.liste_reponse_type = liste;
	}

	public Questionnaire getQuestionnaire() {
		return questionnaire;
	}

	public void setQuestionnaire(Questionnaire questionnaire) {
		this.questionnaire = questionnaire;
	}

	@Override
	public String toString() {
		return "Question [id_question=" + id_question + ", label=" + label
				+ "]";
	}
}
