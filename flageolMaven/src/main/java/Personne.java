

public class Personne {
	
	    private  String nom;
	    private  String prenom;
	    private  int age;
	    private  Niveau niveau;
	    

	    public String getNom() {
			return nom;
		}
	    public Personne() {
	    	
	    }


// On peut essayer de donner des valeurs de types différentes à celles prévues

		public void setNom(String nom) {
			this.nom = nom;
		}




		public String getPrenom() {
			return prenom;
		}




		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}




		public int getAge() {
			return age;
		}




		public void setAge(int age) {
			this.age = age;
		}




		public Niveau getNiveau() {
			return niveau;
		}




		public void setNiveau(Niveau niveau) {
			this.niveau = niveau;
		}




		public Personne(String nom, String prenom,int age, Niveau niveau) {
	        this. nom= nom;
	        this.prenom = prenom;
	        this.age=age;
	        this.niveau=niveau;
	    }
	    public enum Niveau{
	    	NiveauDEtude1,
	    	NiveauDEtude2,
	    	NiveauDEtude3,
	    }
	   

	   

	    public String toString() {
	        return nom + " " + prenom + " "+age + " "+niveau + " ";
	    }

}
