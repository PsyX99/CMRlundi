package fr.inti.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table (name="equipe_campagne")
public class EquipeCampagne implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_equipe;

	@OneToMany(mappedBy = "equipe_campagne", cascade=CascadeType.ALL)
	private List<Commercial> liste_commercial;

	@OneToMany(mappedBy = "equipe_campagne", cascade=CascadeType.ALL)
	private List<CampagneReg> liste_campagne_reg;
	
	@OneToMany(mappedBy = "equipe_campagne", cascade=CascadeType.ALL)
	private List<CampagneOccas> liste_campagne_occas;
	
	@OneToMany(mappedBy = "equipe_campagne", cascade=CascadeType.ALL)
	private List<Questionnaire> liste_questionnaire;

	// Getter and Setter

	public int getId_equipe() {
		return id_equipe;
	}

	public void setId_equipe(int id_equipe) {
		this.id_equipe = id_equipe;
	}

	public List<Commercial> getListe_commercial() {
		return liste_commercial;
	}

	public void setListe_commercial(List<Commercial> liste_commercial) {
		this.liste_commercial = liste_commercial;
	}

	public List<CampagneReg> getListe_campagne_reg() {
		return liste_campagne_reg;
	}

	public void setListe_campagne_reg(List<CampagneReg> liste_campagne_reg) {
		this.liste_campagne_reg = liste_campagne_reg;
	}

	public List<CampagneOccas> getListe_campagne_occas() {
		return liste_campagne_occas;
	}

	public void setListe_campagne_occas(List<CampagneOccas> liste_campagne_occas) {
		this.liste_campagne_occas = liste_campagne_occas;
	}

	public List<Questionnaire> getListe_questionnaire() {
		return liste_questionnaire;
	}

	public void setListe_questionnaire(List<Questionnaire> liste_questionnaire) {
		this.liste_questionnaire = liste_questionnaire;
	}

	public EquipeCampagne(int id_equipe) {
		super();
		this.id_equipe = id_equipe;
	}

	public EquipeCampagne() {
		super();
	}

	// Methode toString

	@Override
	public String toString() {
		return "Equipe_campagne [id_equipe=" + id_equipe + ", liste_commercial="
				+ liste_commercial + "]";
	}

}
