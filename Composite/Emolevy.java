package Composite;

import java.util.ArrayList;
import java.util.List;

public class Emolevy implements Komponentti{

    List<Komponentti> komponentit = new ArrayList<>();

    public Emolevy(){

    };

    public double laskeHinta() {
        return 0;
    }
}
