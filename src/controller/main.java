package controller;

import java.util.ArrayList;

import model.bll.PersonneManager;
import model.bo.Annuaire;
import model.bo.Personne;

public class main {

	/**
	 * @param args
	 */
	@SuppressWarnings("null")
	public static void main(String[] args) {
		Annuaire annuaireClass = new Annuaire();
		ArrayList<Personne> annuaire = annuaireClass.getAnnuaire();
		PersonneManager personneManager = new PersonneManager();
		annuaire = null;
		
		Personne personne1 = new Personne("Olivier", "Billant", "0606060606", 34);
		System.out.println(personne1.toString());
		Personne personne2 = new Personne("Clement", "Duval", "0707070707", 34);
		Personne personne3 = new Personne("Antoine", "Guillou", "0808080808", 33);
		Personne personne4 = new Personne("Phileas", "Peron", "090909090909", 14);
		
//		personneManager.ajouterContact(personne1, annuaire);
//		personneManager.ajouterContact(personne2, annuaire);
//		personneManager.ajouterContact(personne3, annuaire);
//		personneManager.afficherTousContact(annuaire);
		
		ArrayList<Personne> annuaireTest = null;
		annuaireTest.add(personne1);
		System.out.println(annuaireTest.toString());
		
	}

}
