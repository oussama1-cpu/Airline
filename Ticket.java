package Airline;




	public class Ticket {

	    private Vol vol;
	 Passager P =new Passager();
	    private double prix;
	    private String Nom,Prenom;
	    

	    public Ticket(Vol v,String nom,String prenom) {
	      Nom=nom;
	      Prenom=prenom;
	      vol = v;
	       
	       


	    }

	    @Override
	    public String toString() {
	    	
	        return (Nom + Prenom +"\nVOL  " + vol.getNumVol()
	        +"\nEscale depart " + vol.getSource() + " Escale arrivé  " + vol.getDestination()
	        +"\nDate de depart" + vol.getDepart() +" Date d'arrivée " +vol.getArrivée()
	          +"\nPrix de ticket: " + vol.getPrix() + "$");
	       
	    }

	    public Vol getVol() {
	        return vol;
	    }
	    public void setVol(Vol v) {
	       vol=v;
	    }
	   
	   
       public double getPrix() {
	        return prix;
	    }
	    public void setPrix(double P) {
	        prix=P;
	    }
	    
	  
	    
	    
	    
	}


