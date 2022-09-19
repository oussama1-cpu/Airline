package Airline;

public class Vol {

	private int NumVol;
    private String Source;
    private String destination;
    private String Depart;
    private String Arriv�e;
    private int Capacit�;
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
        this.Capacit� = c;
        this.NbPlaceDispo = c;
        this.Prix = op;
        this.Arriv�e=ar;
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
    public String getArriv�e() {
        return Arriv�e;
    }
    public int getNumVol() {
        return NumVol;
    }

    public int getNbPlaceDispo() {
        return NbPlaceDispo;
    }

    public int getCapacit�() {
        return Capacit�;
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

    public void setCapacit�(int c) {
        Capacit� = c;
    }

    @Override
    public String toString() {
    	return("Vol " + NumVol +"  Escale depart " + Source +"  Escale arriv�e " +destination +"\nDate de depart " + Depart
    			+" Date d'arriv�e " +Arriv�e +"\nPrix " + Prix + "$"
    			);
       
    }

}





