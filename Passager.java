package Airline;

import java.util.Scanner;

public class Passager extends Utilisateur {
	
	
	String Nom,Prenom,age;
	int Npassport;
	String source,destination;
	int NumeroVOL;
	String dest,org, Nomut,mdp;
	
	 static Scanner sc = new Scanner(System.in);
	
	 public void VerifVolDispo() {
		
		 System.out.println("Enter l'escale de depart");
		 org = sc.nextLine();
		 
         System.out.println("Enter l'escale d'arrivée");
         dest = sc.nextLine();

	    }
	 public void ObtenirInfos() {
		 System.out.println("Entrer le numéro de vol");
		 NumeroVOL=sc.nextInt(); }
	 
	 public void Reservation() {
		 System.out.println("Entrer le numero de vol à reserver");
		 NumeroVOL=sc.nextInt();
		 sc.nextLine();
		 System.out.println("Entrer votre Nom :");
		 Nom=sc.nextLine();
		 System.out.println("Entrer votre prenom :");
		 Prenom=sc.nextLine();
		 System.out.println("Entrez votre age :");
		 age=sc.nextLine();
		 System.out.println("Entrer votre numero de passport");
		 Npassport=sc.nextInt();
		 
	 }
	 
	 public String getOrg(){return org;

	 }
	 public String getDest(){return dest;

	 }
	 public int getNumeroVOL() {return NumeroVOL;}

public String getNom() {
	return Nom;
}
public String getPrenom() {
	return Prenom;
}
@Override
public void idetification() {
	
	System.out.println("Entrer votre nom d'utilisation");
	Nomut=sc.nextLine();
	System.out.println("Entrer votre mot de passe");
	mdp=sc.nextLine();
	}
}

