package model.dal;

import java.util.ArrayList;

import model.bo.Personne; 
public class PersonneDAO {

	public void add(Personne personne, ArrayList<Personne> annuaire) {
		annuaire.add(personne);
	}
	public void showAll(ArrayList<Personne> annuaire) {
		for (Personne personne : annuaire) {
			System.out.println(personne);
		}
	}
	public void showById(int id) {}
	public void delete(int id) {}
	public void update(Personne personne) {}
	
}
