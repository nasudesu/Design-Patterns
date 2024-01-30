package Composite;

public abstract class KoneenOsa implements Komponentti {
    public String Nimi;
    public double Hinta;
    public KoneenOsa(String nimi, double hinta){
        this.Hinta = hinta;
        this.Nimi = nimi;
    };

    public String toString(){
        return "Osa: " + this.Nimi + " Hinta: " + this.Hinta;
    }
}
