package test1;

import java.util.ArrayList;
import java.util.List;



public class Main {
	public static void main(String[] args) {
		Chien revus = new Chien(10, " Chien", "r�vus", " Fox Terrier", 8);
		Chien maxoue = new Chien(100, " gros Chien", "Maxence", "Berger Allemand", 18);
		Chien ziikro = new Chien(100000, " vieux Chien", "Ziikro", "Gros chien", 20);
		Etudiant jimmy = new Etudiant("DOUSSAIN", " Jimmy", 19, "BTS SIO1");
		Etudiant guitoune = new Etudiant("BOSC", "Guillaume", 19, "BTS SIO1");
		Etudiant mathilde = new Etudiant("ROPTIN", "Mathilde", 19, "BTS TC1");
		classe btssio1 = new classe("BTS SIO1");
		classe btstc1 = new classe("BTS TC1");
		
		chat peanut = new chat(1, "peanut", "norvegien", null);		
		chat ramses = new chat(1, "ramses", "maine coon", null);
		/*jimmy.sePresenter();*/
		/*List<Etudiant> sio = new ArrayList<Etudiant>();
		sio.add(jimmy);
		sio.add(guitoune);
		sio.add(mathilde);			
		sio.remove(mathilde);*/		
		btssio1.addEtudiant(guitoune);
		btssio1.addEtudiant(jimmy);
		btssio1.addEtudiant(mathilde);
		btstc1.addEtudiant(mathilde);
		
		btssio1.removeEtudiant(2);

		List<Chien> chenil = new ArrayList<Chien>();
		chenil.add(revus);
		chenil.add(maxoue);
		chenil.add(ziikro);
        guitoune.ajouterChien(maxoue);
        guitoune.ajouterChien(ziikro);
        jimmy.ajouterChien(revus);
        jimmy.ajouterChien(ziikro);
        jimmy.ajouterChien(maxoue);
        
        
        guitoune.ajouterChat(peanut);
        guitoune.ajouterChat(ramses);
        mathilde.ajouterChat(ramses);

		/*for ( int i=0; i< chenil.size(); i++) {
			chenil.get(i).sePresenter();
		}*/
		/*for ( int j=0; j< sio.size(); j++) {
			sio.get(j).sePresenter();						
		}*/
        guitoune.retirerChien(0);
        jimmy.retirerChien(1);
        guitoune.sePresenter();
        
      
        					/* btssio1.presenterClasse();*/
		
		//System.out.println(chenil);
	}}


