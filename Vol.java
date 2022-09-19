package Airline;

public class Vol {

	private int NumVol;
    private String Source;
    private String destination;
    private String Depart;
    private String Arrivée;
    private int Capacité;
    private int NbPlaceDispo;
    private double Prix;

    public Vol(int fn, String o, String ds, String dp, int c, double op,String ar) {
        if (ds.equals(o) == true) {
            throw new IllegalArgumentException("destination and origin are the same");
        }
        this.NumVol = fn;
        this.Source = o;
        this. destination = ds;
        this.Depart = dp;
        this.Capacité = c;
        this.NbPlaceDispo = c;
        this.Prix = op;
        this.Arrivée=ar;
    }

    
	
    public double getPrix() {
        return  Prix;
    }

    public String getSource() {
        return Source;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepart() {
        return Depart;
    }
    public String getArrivée() {
        return Arrivée;
    }
    public int getNumVol() {
        return NumVol;
    }

    public int getNbPlaceDispo() {
        return NbPlaceDispo;
    }

    public int getCapacité() {
        return Capacité;
    }

    public void setPrix(double p) {
        Prix = p;
    }

    public void setSource(String o) {
        Source = o;
    }

    public void setDestination(String d) {
        destination = d;
    }

    public void setDepart(String d) {
        Depart = d;
    }

    public void setNumVol(int fn) {
        NumVol = fn;
    }

    public void setNbPlaceDispo(int s) {
    	NbPlaceDispo = s;
    }

    public void setCapacité(int c) {
        Capacité = c;
    }

    @Override
    public String toString() {
    	return("Vol " + NumVol +"  Escale depart " + Source +"  Escale arrivée " +destination +"\nDate de depart " + Depart
    			+" Date d'arrivée " +Arrivée +"\nPrix " + Prix + "$"
    			);
       
    }

}





