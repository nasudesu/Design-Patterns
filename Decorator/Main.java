package Decorator;

public class Main {

    public static void main(String[] args) {
        IPizzaTayte pizza = new Juusto(new Kinkku(new PizzaPohja("Pohja", 5.0)));
        pizza.lisaaTayte();
        System.out.println("Hinta: " + pizza.haeHinta());
        System.out.println("--------------------");
        IPizzaTayte pizza2 = new Kinkku(new Tomaatti(new PizzaPohja("Pohja", 5.0)));
        pizza2.lisaaTayte();
        System.out.println("Hinta: " + pizza2.haeHinta());
        System.out.println("--------------------");
        IPizzaTayte pizza3 = new Juusto(new Sieni(new PizzaPohja("Pohja", 5.0)));
        pizza3.lisaaTayte();
        System.out.println("Hinta: " + pizza3.haeHinta());
    }
}
