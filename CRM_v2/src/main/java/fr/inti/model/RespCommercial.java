package fr.inti.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="resp_commercial")
public class RespCommercial extends Commercial implements Serializable {

private static final long serialVersionUID = 1L;

private double prime_encadrement;


@OneToOne(mappedBy = "resp_commercial")
private EquipeCom equipe_com;


// Getter and Setter

public double getPrime_encadrement() {
	return prime_encadrement;
}


public void setPrime_encadrement(double prime_encadrement) {
	this.prime_encadrement = prime_encadrement;
}


public EquipeCom getEquipe_com() {
	return equipe_com;
}


public void setEquipe_com(EquipeCom equipe_com) {
	this.equipe_com = equipe_com;
}

// Constructeurs

public RespCommercial(int id_commercial, String nom, String prenom,
		String fonction, Date date_recrutement, double salaire_base,
		double taux_commission, double prime_encadrement) {
	super(id_commercial, nom, prenom, fonction, date_recrutement, salaire_base,
			taux_commission);
	this.prime_encadrement = prime_encadrement;
}


public RespCommercial(int id_commercial, String nom, String prenom,
		String fonction, Date date_recrutement, double salaire_base,
		double taux_commission) {
	super(id_commercial, nom, prenom, fonction, date_recrutement, salaire_base,
			taux_commission);
}

public RespCommercial() {
	super();
}

//Methode toString
@Override
public String toString() {
	return "Resp_commercial [prime_encadrement=" + prime_encadrement
			+ ", equipe_com=" + equipe_com + "]";
}

}
