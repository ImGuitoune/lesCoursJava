package test1;

import java.util.ArrayList;
import java.util.List;

public class Etudiant {

		private String nom;
		private String prenom;
		private int age;
		private String classe;
		private List<Animal> animaux;


	
		
		
/*constructor*/		public Etudiant(String nom, String prenom,int age, String classe ) {
			this.nom =nom;
			this.prenom =prenom;
			this.age =age;
			this.classe =classe;


			this.animaux = new ArrayList<>();

		}



public void sePresenter() {
	
	 int nbrAnimaux = 0;
	 for(int i = 0; i < animaux.size(); i++){    
	   nbrAnimaux = nbrAnimaux +1;
	 } 
		
	System.out.println(" Bonjour, je m'appelle " + " " + nom + " " + prenom + " j'ai " + age + " ans, et je suis en  " + classe + " , et j'ai " + nbrAnimaux + " Chats, les voici :" );
	
	 for(int i = 0; i < animaux.size(); i++){    
	        animaux.get(i).sePresenter();
	        } 
	
}


public void ajouterAnimal(Animal p_animal) {
    animaux.add(p_animal);
}

public void retirerAnimal(Animal p_animal) {
	animaux.remove(p_animal);
	
}





}	
