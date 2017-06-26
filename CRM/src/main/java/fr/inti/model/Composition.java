package fr.inti.model;

import javax.persistence.Entity;

@Entity
public class Composition {

	private int quantite;

	public Composition() {
		super();
	}

	public Composition(int quantite) {
		super();
		quantite = quantite;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		quantite = quantite;
	}

}
