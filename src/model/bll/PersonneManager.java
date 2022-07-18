package model.bll;

import java.util.ArrayList;

import model.bo.Personne;
import model.dal.PersonneDAO;
import model.dal.PersonneDaoFactory;

public class PersonneManager {
private PersonneDAO personneDAO = PersonneDaoFactory.getPersonneDAO();

	public void ajouterContact(Personne personne, ArrayList<Personne> annuaire) {
		personneDAO.insert(personne, annuaire);
	}
	public void afficherTousContact(ArrayList<Personne> annuaire) {
		personneDAO.showAll(annuaire);
	}
	public void afficherUnContact(int id, ArrayList<Personne> annuaire) {
		personneDAO.showById(id, annuaire);
		
	}
	public void effacerUnContact(int id, ArrayList<Personne> annuaire) {
		personneDAO.delete(id, annuaire);
	}
	public void mettreAJour(Personne personne) {
		personneDAO.update(personne);
	}
	
}
