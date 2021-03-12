package test1;

import java.util.ArrayList;
import java.util.List;

public class Etudiant {

		private String nom;
		private String prenom;
		private int age;
		private String classe;

		private List<Chien> chiens;
		
		List<Chien> chenil = new ArrayList<Chien>();
		private ArrayList<Object> chats;

	
		
		
/*constructor*/		public Etudiant(String nom, String prenom,int age, String classe ) {
			this.nom =nom;
			this.prenom =prenom;
			this.age =age;
			this.classe =classe;

			this.chiens = new ArrayList<>();
			this.chats = new ArrayList<>();

		}



public void sePresenter() {
	 int nbrChat = 0;
	 for(int i = 0; i < chats.size(); i++){    
	   nbrChat = nbrChat +1;
	 } 
	
	
	
	System.out.println(" Bonjour, je m'appelle " + " " + nom + " " + prenom + " j'ai " + age + " ans, et je suis en  " + classe + " , et j'ai " + nbrChat + " Chats, les voici :" );
	
	 for(int i = 0; i < chiens.size(); i++){    
	        chiens.get(i).sePresenter();
	        } 
	 
	 
	 /*for(int j = 0; j < chats.size(); j++){    
	       ((chat) chats.get(j)).sePresenter();
	        }*/
	 for(int k = 0; k < chats.size(); k++){    
	       ((chat) chats.get(k)).miauler();
	        } 
}
public void ajouterChien(Chien p_chien) {
    chiens.add(p_chien);
}

/*public void retirerChien(Chien p_chien) {
    chiens.remove(p_chien);
}*/



public void retirerChien(int numeroChien) {
	chiens.remove(numeroChien);
	
}

public void ajouterChat(chat p_chat) {
    chats.add(p_chat);
}

public void retirerChat(int numeroChat) {
	chats.remove(numeroChat);
	
}


}	
