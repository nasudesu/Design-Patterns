package FactoryMethod.Otukset;

import FactoryMethod.AterioivaOtus;
import FactoryMethod.Juoma;
import FactoryMethod.Juomat.Maito;

public class Oppilas extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Maito();
    };

}
