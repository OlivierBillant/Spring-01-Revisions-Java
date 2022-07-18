package model.bll;

import java.util.ArrayList;

import model.bo.Personne;
import model.dal.PersonneDAO;

public class PersonneManager {
private PersonneDAO personneDAO = new PersonneDAO();

	public void ajouterContact(Personne personne, ArrayList<Personne> annuaire) {
		personneDAO.add(personne, annuaire);
	}
	public void afficherTousContact(ArrayList<Personne> annuaire) {
		personneDAO.showAll(annuaire);
	}
	public void afficherUnContact(int id) {
		personneDAO.showById(id);
		
	}
	public void effacerUnContact(int id) {
		personneDAO.delete(id);
	}
	public void mettreAJour(Personne personne) {
		personneDAO.update(personne);
	}
	
}
