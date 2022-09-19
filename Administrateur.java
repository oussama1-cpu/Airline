package Airline;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class Administrateur extends Utilisateur{
	 public List<Vol> vols;
	 
	 public int size;
	
	 
	 public Administrateur() {
	  vols = new ArrayList<>();
	 }
	  int j,NVol, c,i=0,NumVol;
      double prix;
      int passcode;
      String mdp;
      String Source, destination, date,org,dest,ar;
	 static Scanner sc = new Scanner(System.in);
	 public void AjouterVol() {
	      System.out.println("Combiens de vols vous allez créer ? ");
	      j=sc.nextInt();
	      for (i=0;i<j;i++) {
	        System.out.println("Enter le numéro de vol");
	        NVol = sc.nextInt();
	        sc.nextLine();
	        System.out.println("Enter l'escale de depart");
	        Source = sc.nextLine();
	        System.out.println("Enter l'escale de l'arrivée ");
	        destination = sc.nextLine();
	        System.out.println("Entrer la date de depart");
	        date = sc.nextLine();
	        System.out.println("Entrer la date d'arrivée");
	        ar = sc.nextLine();
	        System.out.println("Enter la capacité de l'avion");
	        c = sc.nextInt();
	        System.out.println("Entrer le prix de ticket");
	        prix = sc.nextDouble();
	        Vol F = new Vol(NVol, Source, destination, date, c, prix,ar);
	        vols.add(F);
	        System.out.println("Vol crée:");
	        System.out.println(F);
	      }
	    }
	 public void verif0(String org,String dest) {
		 int size, seats;
	        boolean test = true;
	        String o, d;
	        size = vols.size();
	        for (int i = 0; i < size; i++) {
	            o = vols.get(i).getSource();
	            d = vols.get(i).getDestination();
	            seats = vols.get(i).getNbPlaceDispo();
	            if ((o.equals(org) == true) && (d.equals(dest) == true) && seats > 0) {
	                if (test == true) {
	                    System.out.println("la liste des vols disponibles:");
	                   test = false;
	                }
	                System.out.println(vols.get(i));
	            }
	        }
	        if (test== true) {
	            System.out.println("Pas de vols disponibles");
	        }



	 }
	 public Vol getInfos(int NumVol) {
		 int size = vols.size();
	        for (int i = 0; i < size; i++) {
	            if (vols.get(i).getNumVol() == NumVol) {
	            	return vols.get(i);
	            }

	        }
	        return null;
	 }   
	 public void SupprimerVol() {
		 int Numsupp,n;
		 size = vols.size();
		 System.out.println("Entrer le numero de vol à supprimer");
		 Numsupp=sc.nextInt();
		
		 for (int i = 0; i < size; i++) {
		 n=vols.get(i).getNumVol();
	
	 if(Numsupp==n) {
		vols.remove(i);
		System.out.println("Vol Numero " +Numsupp +" est supprimé");
		

	 }
	 else  System.out.println("numéro de vol non trouvable");

}
	
		 
	 }
	@Override
	public void idetification() {
	System.out.println("Entrer votre PASSCODE");
	passcode=sc.nextInt();
	sc.nextLine();
	System.out.println("Entrer vote mot de passe");
	mdp=sc.nextLine();
		
	}
}
	 

