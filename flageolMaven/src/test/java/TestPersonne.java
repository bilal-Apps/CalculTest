

import org.junit.Test;

import junit.framework.TestCase;


public class TestPersonne extends TestCase{

	@Test
	public void test() {
		//Vérification de la confirmité des types.
				String nom="DIOP";
				/** Si par exemple on donne à la variable 
				  nom une valeur de type int alors
				on recoit l'ereur due à un type inadéquat**/
				String prenom="Issa";
				int age=13;
				Personne.Niveau niv= Personne.Niveau.NiveauDEtude1;
				Personne p=new Personne(nom,prenom,age,niv);
				assertEquals(p.getNom().getClass().getSimpleName(),"String");
				assertEquals(p.getPrenom().getClass().getSimpleName(),"String");
				assertEquals(13,age);
				assertEquals(p.getNiveau().getClass().getSimpleName(),"Niveau");
	}

}
