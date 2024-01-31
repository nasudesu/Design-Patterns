package Composite;

public abstract class KoneenOsa implements Komponentti {
    protected String Nimi;
    protected double Hinta;
    public KoneenOsa(String nimi, double hinta){
        this.Hinta = hinta;
        this.Nimi = nimi;
    };

    public String toString(){
        return "Osa: " + this.Nimi + " Hinta: " + this.Hinta;
    }
}
