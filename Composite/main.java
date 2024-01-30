package Composite;

public class main {
    public static void main(String[] args) {


        KoneenOsa emolevy = new Emolevy("Emolevy", 50);
        System.out.println(emolevy);
        System.out.println(emolevy.laskeHinta());
        KoneenOsa kotelo = new Kotelo("Kotelo", 70);
        System.out.println(kotelo);
        System.out.println(kotelo.laskeHinta());
    }
}
