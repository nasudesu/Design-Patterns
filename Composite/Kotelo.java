package Composite;

import java.util.ArrayList;
import java.util.List;

public class Kotelo implements Komponentti {

    List<Komponentti> komponentit = new ArrayList<>();

    protected double Hinta;

    protected String Nimi;

    public Kotelo(String nimi, double hinta){
        this.Hinta = hinta;
        this.Nimi = nimi;
    };

    public void lisaaKomponentti(Komponentti k){
        komponentit.add(k);
    }

    public double laskeHinta() {
        for (int i = 0; i < komponentit.size(); i++) {
            this.Hinta += komponentit.get(i).laskeHinta();
        }
        return this.Hinta;
    }
}
