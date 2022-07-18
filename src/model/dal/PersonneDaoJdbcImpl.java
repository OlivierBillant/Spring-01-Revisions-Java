package model.dal;

import java.util.ArrayList;

import model.bo.Annuaire;
import model.bo.Personne;

public class PersonneDaoJdbcImpl implements PersonneDAO{

	public void insert(Personne personne, ArrayList<Personne> annuaire) {
		annuaire.add(personne);
	}

	public void showAll(ArrayList<Personne> annuaire) {
		for (Personne personne : annuaire) {
			System.out.println(personne);
		}
	}

	public void showById(int id, ArrayList<Personne> annuaire) {
		System.out.println(annuaire.get(id));
	}

	public void delete(int id, ArrayList<Personne> annuaire) {
		annuaire.remove(id);
	}

	public void update(Personne personne) {
	}


}
