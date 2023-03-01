package math;

import static org.junit.Assert.*;

import org.hamcrest.core.Is;
import org.junit.Test;

import math.Personne.Niveau;

public class TestCalcul {

	@Test
	public void test() {
		
	//Nous testons le type des variables.
		String nom="DIOP";
		/** Si par exemple on donne à la variable nom une valeur de type int alors
		on recoit l'ereur due à un type inadéquat**/
		String prenom="Issa";
		int age=12;
		Niveau niv=Niveau.NiveauDEtude1;
		Personne p=new Personne(nom,prenom,age,niv);
		assertEquals(nom.getClass().getSimpleName(),"String");
		assertEquals(prenom.getClass().getSimpleName(),"String");
		assertEquals(13,age);
		assertEquals(niv.getClass().getSimpleName(),"Niveau");
	}

}
