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
public class Equipe_campagne implements Serializable{

private static final long serialVersionUID = 1L;
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id_equipe;

@OneToMany(mappedBy = "equipe_campagne", cascade=CascadeType.ALL)
private List<Commercial> liste_commercial;

@OneToMany(mappedBy = "equipe_campagne", cascade=CascadeType.ALL)
private List<Campagne> liste_campagne;

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

public List<Campagne> getListe_campagne() {
	return liste_campagne;
}

public void setListe_campagne(List<Campagne> liste_campagne) {
	this.liste_campagne = liste_campagne;
}


// Constructeurs

public Equipe_campagne(int id_equipe) {
	super();
	this.id_equipe = id_equipe;
}

public Equipe_campagne() {
	super();
}

// Methode toString

@Override
public String toString() {
	return "Equipe_campagne [id_equipe=" + id_equipe + ", liste_commercial="
			+ liste_commercial + "]";
}

}
