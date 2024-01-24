package FactoryMethod.Otukset;

import FactoryMethod.AterioivaOtus;
import FactoryMethod.Juoma;
import FactoryMethod.Juomat.Kahvi;

public class Siivooja extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Kahvi();
    }
}
