package model.dal;

import java.util.ArrayList;

import model.bo.Personne; 
public interface PersonneDAO {

	public void insert(Personne personne, ArrayList<Personne> annuaire);
	public void showAll(ArrayList<Personne> annuaire);
	public void showById(int id, ArrayList<Personne> annuaire);
	public void delete(int id, ArrayList<Personne> annuaire);
	public void update(Personne personne);
	
}
