package test1;

public class Chien extends Animal {

	@SuppressWarnings("unused")
	private String couleur;
	@SuppressWarnings("unused")
	private int taille;
	
	public Chien(int age, String nom, String race,String couleur, int taille) {
		super( age, nom, race);
		this.couleur=couleur;
		this.taille=taille;
	}
		
	
	
	
	





/*public void sePresenter() {
	System.out.println(" ouaf, je m'appelle " + " " + nom + " " + " je fait " + " " + taille + " cm, j'ai "
			+ age + " ans, et je suis un "  + race );
}	

		public String toString() {
			return nom + " " + race;
		}*/
}


