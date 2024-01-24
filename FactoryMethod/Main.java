package FactoryMethod;

import FactoryMethod.Otukset.Opettaja;
import FactoryMethod.Otukset.Oppilas;
import FactoryMethod.Otukset.Siivooja;

public class Main {

    public static void main(String[] args) {

        AterioivaOtus opettaja = new Opettaja();
        opettaja.aterioi();
        System.out.println();

        AterioivaOtus oppilas = new Oppilas();
        oppilas.aterioi();
        System.out.println();

        AterioivaOtus siivooja = new Siivooja();
        siivooja.aterioi();
        siivooja.createJuoma();
    }
}
