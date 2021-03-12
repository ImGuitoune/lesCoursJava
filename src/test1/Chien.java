package test1;

public class Chien {

		public int getTaille() {
		return taille;
	}


	public void setTaille(int taille) {
		this.taille = taille;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getRace() {
		return race;
	}


	public void setRace(String race) {
		this.race = race;
	}
	
	
	
	
	


		private int taille;
		private int age;
		private String nom;
		private String race;
		@SuppressWarnings("unused")
		private String genre;


/*constructor*/		public Chien(int taille, int age, String nom, String race, String genre) {
			this.taille =taille;
			this.age =age;
			this.nom =nom;
			this.race =race;
			this.genre=genre;

		}


public void sePresenter() {
	System.out.println(" ouaf, je m'appelle " + " " + nom + " " + " je fait " + " " + taille + " cm, j'ai "
			+ age + " ans, et je suis un "  + race );
}	

		public String toString() {
			return nom + " " + race;
		}
}


