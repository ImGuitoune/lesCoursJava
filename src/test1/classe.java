package test1;

import java.util.ArrayList;
import java.util.List;

public class classe {

	private String libelle;
	private List<Etudiant> etudiants;
	List<Etudiant> laclasse = new ArrayList<Etudiant>();


	/*constructor*/ public classe(String libelle) {
	this.libelle =libelle;
	this.etudiants = new ArrayList<Etudiant>();
}

	

	List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void getEtudiant(int index) {
	    laclasse.get(index);
	}
public void addEtudiant(Etudiant p_etu) {
    laclasse.add(p_etu);
}

public void removeEtudiant(int lenum) {
    laclasse.remove(lenum);
}


public void presenterClasse() {
	System.out.println("Voici la classe de " + libelle + " , avec : " + laclasse );
	
	 for(int k = 0; k < laclasse.size(); k++){    
	        laclasse.get(k).sePresenter();
	 } 
}



}