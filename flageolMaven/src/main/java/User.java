

import java.util.Scanner;

public class User {
	String a;
	String b;
	Scanner sc = new Scanner(System.in);
	Personne p=new Personne();
	Calcul c=new Calcul();
	//Choix option
	int getCas() {
		System.out.println("Faite un choix parmi ces options");
		menu();
		String str = sc.nextLine();	
		int rep = Integer.parseInt(str);
		return rep;
	}
Double getresultat() {

	String str = sc.nextLine();	
	Double rep = Double.parseDouble(str);
	return rep;
	}

	boolean compare(Double r, Double q) {
		
		return c.compa(r, q);
				
	}
	public void getID() {
		System.out.println("Donnez votre Nom, Prénom et age");
		String nom=sc.nextLine();
		String prenom=sc.nextLine();
		String agestr=sc.nextLine();
		int age = Integer.parseInt(agestr);
	p.setNom(nom);
	p.setPrenom(prenom);
	p.setAge(age);
	}
	public void menu() {
		if(p.getAge()<=10) {
			System.out.println("1. Addition");
			System.out.println("2. Soustraction");
			System.out.println("3. Division");
			System.out.println("4. Multiplication");
		}
		else {
			System.out.println("1. Addition");
			System.out.println("2. Soustraction");
			System.out.println("3. Division");
			System.out.println("4. Multiplication");
			System.out.println("5. Carre");
			System.out.println("6. Racine carre");
			System.out.println("7. Comparaison Exponentiel");
			System.out.println("8. inversion Positive et Negative");
			System.out.println("9. Sinus");
			System.out.println("10. Cosinus");
			System.out.println("11. Tangent");
			
			System.out.println("0. Appuyez sur entrer pour quitter");
			
		}
	
	}
	
	

}
