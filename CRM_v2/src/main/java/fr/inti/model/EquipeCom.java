package fr.inti.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table (name="equipe_com")
public class EquipeCom implements Serializable{

private static final long serialVersionUID = 1L;	
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id_equipe;

@OneToMany(mappedBy = "equipe_com", cascade=CascadeType.ALL)
private List<Commercial> liste_commercial;
	
@OneToOne
@JoinColumn(name = "id_commercial", referencedColumnName="id_commercial")
private RespCommercial resp_commercial;

@OneToMany(mappedBy = "equipe_com", cascade=CascadeType.ALL)
private List<FicheClient> liste_fiche_client;

@OneToMany(mappedBy = "equipe_com", cascade=CascadeType.ALL)
private List<Proposition_commerciale> liste_proposition_commerciale;

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

public RespCommercial getResp_commercial() {
	return resp_commercial;
}

public void setResp_commercial(RespCommercial resp_commercial) {
	this.resp_commercial = resp_commercial;
}

public List<FicheClient> getListe_fiche_client() {
	return liste_fiche_client;
}

public void setListe_fiche_client(List<FicheClient> liste_fiche_client) {
	this.liste_fiche_client = liste_fiche_client;
}

public List<Proposition_commerciale> getListe_proposition_commerciale() {
	return liste_proposition_commerciale;
}

public void setListe_proposition_commerciale(
		List<Proposition_commerciale> liste_proposition_commerciale) {
	this.liste_proposition_commerciale = liste_proposition_commerciale;
}

// Constructeurs
public EquipeCom(int id_equipe) {
	super();
	this.id_equipe = id_equipe;
}

public EquipeCom() {
	super();
}

// Methode toString

@Override
public String toString() {
	return "Equipe_com [id_equipe=" + id_equipe + "]";
}
}