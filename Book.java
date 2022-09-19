package Airline;

import java.util.Scanner;



public class Book {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Vol V;
	
		
		Administrateur AM = new Administrateur();
		Passager P = new Passager();
		int x,y,z;
		
		boolean test = false,test0=false;
		 while (test != true) {
			 System.out.println("1-Vous etes Administrateur ");
	        	System.out.println("2-Vous etes Passager  ");
	        	x=sc.nextInt();
	        	if(x==1) {System.out.println("Bievenue dans MyBooking");
	        	AM.idetification();
	        	System.out.println("Entrer 1 pour Ajouter des vols");
	        	System.out.println("Entrer 2 pour Supprimer des vols");
	        	System.out.println("Entrer 3 pour quitter");
	        	y=sc.nextInt();
	        	switch(y) {
	        	case 1:  AM.AjouterVol();break; 
	        	case 2:  AM.SupprimerVol();break;
	        	 case 3:System.out.println("Vous avez quitter");
	                    break;
	                default:
	                    System.out.println("vous avez entre une valeur invalide");
	                    break;

	        	}
	        	}
	        	else if (x==2) { 
	        	System.out.println("Bienvenue dans MyBooking");
	        	AM.idetification();
	        	while (test0 != true) {
	        	System.out.println("Entrer 1 pour verifier les vols disponibles");
	            System.out.println("Entrer 2 pour obtenir des informations sur un vol");
	            System.out.println("Entrer 3 pour reserver ");
	           z=sc.nextInt();
	           switch(z) {
	           case 1:P.VerifVolDispo();
	        	AM.verif0(P.getOrg(), P.getDest());
	        	break;
	           case 2: P.ObtenirInfos();
	            V = AM.getInfos(P.getNumeroVOL());
	        	 if (V == null) {
	                 System.out.println("Vol " + P.getNumeroVOL() + " n'existe pas");
	             } else {
	            	 System.out.println("Informations Obtenues " + P.getNumeroVOL() + ":");
	                 System.out.println(V);
	             }
	             break;
	           case 3 :
	        	   P.Reservation();
	               V=AM.getInfos(P.getNumeroVOL());
	               if(V==null) {
	               	System.out.println("Vol " +P.getNumeroVOL() +" n'existe pas");
	               }
	               else {
	               	Ticket ticket =new Ticket(V,P.getNom(),P.getPrenom());
	               	System.out.println("Ticket " +ticket);
	               	}
	               	break;
	           default:
                   System.out.println("vous avez entre une valeur invalide");
                   break;
	           }
	        		
	        	}
		
        	
        }
		 }
	}
}
	
       

	


