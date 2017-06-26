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
public class Equipe_com implements Serializable{

private static final long serialVersionUID = 1L;	
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id_equipe;

@OneToMany(mappedBy = "equipe_com", cascade=CascadeType.ALL)
private List<Commercial> listeCo;
	
@OneToOne
@JoinColumn(name = "id_commercial", referencedColumnName="id_commercial")
private Resp_commercial resp_commercial;

@OneToMany(mappedBy = "equipe_com", cascade=CascadeType.ALL)
private List<Fiche_client> liste_fiche_client;

@OneToMany(mappedBy = "equipe_com", cascade=CascadeType.ALL)
private List<Proposition_commerciale> liste_proposition_commerciale;

// Getter and Setter

public int getId_equipe() {
	return id_equipe;
}

public void setId_equipe(int id_equipe) {
	this.id_equipe = id_equipe;
}

public List<Commercial> getListeCo() {
	return listeCo;
}

public void setListeCo(List<Commercial> listeCo) {
	this.listeCo = listeCo;
}

public Resp_commercial getResp_commercial() {
	return resp_commercial;
}

public void setResp_commercial(Resp_commercial resp_commercial) {
	this.resp_commercial = resp_commercial;
}

public List<Fiche_client> getListe_fiche_client() {
	return liste_fiche_client;
}

public void setListe_fiche_client(List<Fiche_client> liste_fiche_client) {
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
public Equipe_com(int id_equipe) {
	super();
	this.id_equipe = id_equipe;
}

public Equipe_com() {
	super();
}

// Methode toString

@Override
public String toString() {
	return "Equipe_com [id_equipe=" + id_equipe + ", listeCo=" + listeCo
			+ ", resp_commercial=" + resp_commercial + "]";
}
}