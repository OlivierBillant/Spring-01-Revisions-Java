package model.bo;

import java.util.ArrayList;

import model.bo.Personne;

public class Annuaire {
	private ArrayList<Personne> annuaire;

	public Annuaire(ArrayList<Personne> annuaire) {
		super();
		this.annuaire = annuaire;
	}

	public Annuaire() {
		super();
	}

	public ArrayList<Personne> getAnnuaire() {
		return annuaire;
	}

	public void setAnnuaire(ArrayList<Personne> annuaire) {
		this.annuaire = annuaire;
	}

}
