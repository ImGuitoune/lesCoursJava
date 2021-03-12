package test1;

public class Animal {

	protected int age;
	protected String nom;
	protected String race;

	

	/*constructor*/ public Animal(int age, String nom, String race) {
		super();
		this.age = age;
		this.nom = nom;
		this.race = race;
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
	
	
	
}
