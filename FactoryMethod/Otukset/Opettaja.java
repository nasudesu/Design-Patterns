package FactoryMethod.Otukset;

import FactoryMethod.AterioivaOtus;
import FactoryMethod.Juoma;
import FactoryMethod.Juomat.Vesi;

public class Opettaja extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Vesi();
    };

}
