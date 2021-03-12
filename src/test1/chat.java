package test1;

public class chat extends Animal {

@SuppressWarnings("unused")
private String couleur;
	
	public chat(int age, String nom, String race,String couleur) {
		super( age, nom, race);
		this.couleur=couleur;
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
	
	


	
	public void sePresenter() {
		System.out.println(" miaou je m'appelle " + nom + " je suis un " + race + " et j'ai " + age + " an(s)." );
	}
	
	public void miauler() {
	System.out.println(" miaou je suis un chat");
	}
}