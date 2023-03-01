package math;

import java.util.Scanner;

import math.Calcul;

public class Operation {
	String a,b;
	Scanner sc=new Scanner(System.in);
	Calcul c = new Calcul();
	Personne p=new Personne();
	User u=new User();
	int score = 0;
	
	
	void operation(int option) {
		int compteur=0;
		switch(option)
		{
			case 0:
				System.out.println("Merci et a bientot !");
				break;
			case 1:
				System.out.println("ADDITION");
				System.out.println("Valeur 1 ?");
				a = sc.nextLine();
				System.out.println("Valeur 2 ?");
				b = sc.nextLine();
				try {
					
					Double	resultat=c.addition(Double.parseDouble(a), Double.parseDouble(b));
					System.out.println("D'aprés vous quel sera le résultat ? ");
					Double p=u.getresultat();
					boolean pred=u.compare(resultat, p);
					System.out.println(pred);
					System.out.println("3333333333333"+compteur);
					if (pred==true) {
						score++;
						compteur=1;
					}
					if (compteur==1) {
						System.out.println("Bravo !, le résulat est : "+ resultat);
					}
					else
					System.out.println("Echec le résulat est : "+resultat);
					
				} catch (Exception e) {
					System.out.println("Vous avez due faire une erreur dans la saisie de vos valeurs"); 
				}
				System.out.println("Appuyez sur entrer pour retourner au menu");
				break;
				
			case 2:
				System.out.println("SOUSTRACTION");
				System.out.println("Valeur 1 ?");
				a = sc.nextLine();
				System.out.println("Valeur 2 ?");
				b = sc.nextLine();
				try {
					
							Double resultat=c.soustraction(Double.parseDouble(a), Double.parseDouble(b));
							System.out.println("D'aprés vous quel sera le résultat ? ");
							Double p=u.getresultat();
							boolean pred=u.compare(resultat, p);
							if (pred==true) {
								score++;
								compteur=1;
							}
							if (compteur!=0) {
								System.out.println("Bravo !, le résulat est : "+ resultat);
							}
							else
							System.out.println("Echec le résulat est : "+resultat);
							
						} catch (Exception e) {
							System.out.println("Vous avez due faire une erreur dans la saisie de vos valeurs"); 
						}
						System.out.println("Appuyez sur entrer pour retourner au menu");
						break;
						
				
			case 3:
				System.out.println("DIVISION");
				System.out.println("Valeur 1 ?");
				a = sc.nextLine();
				System.out.println("Valeur 2 ?");
				b = sc.nextLine();
				try {
					Double resultat=c.division(Double.parseDouble(a), Double.parseDouble(b));
					System.out.println("D'aprés vous quel sera le résultat ? ");
					Double p=u.getresultat();
					boolean pred=u.compare(resultat, p);
					if (pred==true) {
						score++;
						compteur=1;
					}
					if (compteur!=0) {
						System.out.println("Bravo !, le résulat est : "+ resultat);
					}
					else
					System.out.println("Echec le résulat est : "+resultat);
					
				} catch (Exception e) {
					System.out.println("Vous avez due faire une erreur dans la saisie de vos valeurs"); 
				}
				System.out.println("Appuyez sur entrer pour retourner au menu");
				break;
				
			case 4:
				System.out.println("MULTIPLIER");
				System.out.println("Valeur 1 ?");
				a = sc.nextLine();
				System.out.println("Valeur 2 ?");
				b = sc.nextLine();
				try {
					Double resultat=c.multiplication(Double.parseDouble(a), Double.parseDouble(b));		
					System.out.println("D'aprés vous quel sera le résultat ? ");
					Double p=u.getresultat();
					boolean pred=u.compare(resultat, p);
					if (pred==true) {
						score++;
						compteur=1;
					}
					if (compteur!=0) {
						System.out.println("Bravo !, le résulat est : "+ resultat);
					}
					else
					System.out.println("Echec le résulat est : "+resultat);
					
				} catch (Exception e) {
					System.out.println("Vous avez due faire une erreur dans la saisie de vos valeurs"); 
				}
				System.out.println("Appuyez sur entrer pour retourner au menu");
				break;
				
			case 5:
				System.out.println("Carre");
				System.out.println("Valeur 1 ?");
				a = sc.nextLine();
				try {
					Double resultat=c.square(Double.parseDouble(a));
					System.out.println("D'aprés vous quel sera le résultat ? ");
					Double p=u.getresultat();
					boolean pred=u.compare(resultat, p);
					if (pred==true) {
						score++;
						compteur=1;
					}
					if (compteur!=0) {
						System.out.println("Bravo !, le résulat est : "+ resultat);
					}
					else
					System.out.println("Echec le résulat est : "+resultat);
					
				} catch (ArithmeticException e) {
				    System.out.println("Impossible d'effectuer ce calcul");
				} 		
				catch (Exception e) {
					System.out.println("Vous avez due faire une erreur dans la saisie de vos valeurs"); 
				
				} 
			case 6:
				System.out.println("RACINE Carre");
				System.out.println("Valeur 1 ?");
				a = sc.nextLine();
				try {
					Double resultat=c.squareRoot(Double.parseDouble(a));
					System.out.println("D'aprés vous quel sera le résultat ? ");
					Double p=u.getresultat();
					boolean pred=u.compare(resultat, p);
					if (pred==true) {
						score++;
						compteur=1;
					}
					if (compteur!=0) {
						System.out.println("Bravo !, le résulat est : "+ resultat);
					}
					else
					System.out.println("Echec le résulat est : "+resultat);
					
				} catch (ArithmeticException e) {
				    System.out.println("Impossible d'effectuer ce calcul");
				} 		
				catch (Exception e) {
					System.out.println("Vous avez due faire une erreur dans la saisie de vos valeurs"); 
				
				} 
			case 7:
				System.out.println("Comparaison Exponentiel");
				System.out.println("Valeur 1 ?");
				a = sc.nextLine();
				try {
					Double resultat=c.variableExponentiation(Double.parseDouble(a),Double.parseDouble(b));
					System.out.println("D'aprés vous quel sera le résultat ? ");
					Double p=u.getresultat();
					boolean pred=u.compare(resultat, p);
					if (pred==true) {
						score++;
						compteur=1;
					}
					if (compteur!=0) {
						System.out.println("Bravo !, le résulat est : "+ resultat);
					}
					else
					System.out.println("Echec le résulat est : "+resultat);
					
				} catch (ArithmeticException e) {
				    System.out.println("Impossible d'effectuer ce calcul");
				} 		
				catch (Exception e) {
					System.out.println("Vous avez due faire une erreur dans la saisie de vos valeurs"); 
				
				} 
			case 8:
				System.out.println("inversion Positive et Negative");
				System.out.println("Valeur 1 ?");
				a = sc.nextLine();
				try {
					Double resultat=c.invertPositiveAndNegative(Double.parseDouble(a));
					System.out.println("D'aprés vous quel sera le résultat ? ");
					Double p=u.getresultat();
					boolean pred=u.compare(resultat, p);
					if (pred==true) {
						score++;
						compteur=1;
					}
					if (compteur!=0) {
						System.out.println("Bravo !, le résulat est : "+ resultat);
					}
					else
					System.out.println("Echec le résulat est : "+resultat);
					
				} catch (ArithmeticException e) {
				    System.out.println("Impossible d'effectuer ce calcul");
				} 		
				catch (Exception e) {
					System.out.println("Vous avez due faire une erreur dans la saisie de vos valeurs"); 
				
				} 
			case 9:
				System.out.println("Sinus");
				System.out.println("Valeur 1 ?");
				a = sc.nextLine();
				try {
					Double resultat=c.sine(Double.parseDouble(a));
					System.out.println("D'aprés vous quel sera le résultat ? ");
					Double p=u.getresultat();
					boolean pred=u.compare(resultat, p);
					if (pred==true) {
						score++;
						compteur=1;
					}
					if (compteur!=0) {
						System.out.println("Bravo !, le résulat est : "+ resultat);
					}
					else
					System.out.println("Echec le résulat est : "+resultat);
					
				} catch (ArithmeticException e) {
				    System.out.println("Impossible d'effectuer ce calcul");
				} 		
				catch (Exception e) {
					System.out.println("Vous avez due faire une erreur dans la saisie de vos valeurs"); 
				
				} 
			case 10:
				System.out.println("Cosinus");
				System.out.println("Valeur 1 ?");
				a = sc.nextLine();
				try {
					Double resultat=c.cosine(Double.parseDouble(a));
					System.out.println("D'aprés vous quel sera le résultat ? ");
					Double p=u.getresultat();
					boolean pred=u.compare(resultat, p);
					if (pred==true) {
						score++;
						compteur=1;
					}
					if (compteur!=0) {
						System.out.println("Bravo !, le résulat est : "+ resultat);
					}
					else
					System.out.println("Echec le résulat est : "+resultat);
					
				} catch (ArithmeticException e) {
				    System.out.println("Impossible d'effectuer ce calcul");
				} 		
				catch (Exception e) {
					System.out.println("Vous avez due faire une erreur dans la saisie de vos valeurs"); 
				
				} 
			case 11:
				System.out.println("Tangent");
				System.out.println("Valeur 1 ?");
				a = sc.nextLine();
				try {
					Double resultat=c.tangent(Double.parseDouble(a));
					System.out.println("D'aprés vous quel sera le résultat ? ");
					Double p=u.getresultat();
					boolean pred=u.compare(resultat, p);
					if (pred==true) {
						score++;
						compteur=1;
					}
					if (compteur!=0) {
						System.out.println("Bravo !, le résulat est : "+ resultat);
					}
					else
					System.out.println("Echec le résulat est : "+resultat);
					
				} catch (ArithmeticException e) {
				    System.out.println("Impossible d'effectuer ce calcul");
				} 		
				catch (Exception e) {
					System.out.println("Vous avez due faire une erreur dans la saisie de vos valeurs"); 
				
				} 
		}
		sc.nextLine();
	}

}
