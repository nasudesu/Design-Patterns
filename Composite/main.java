package Composite;

public class main {
    public static void main(String[] args) {

        Komponentti gpu = new GPU("GPU",500);
        Komponentti cpu = new CPU("CPU", 300);
        Komponentti ram = new RAM("RAM", 100);
        Komponentti emolevy = new Emolevy("Emolevy", 50);
        Komponentti kotelo = new Kotelo("Kotelo", 70);

        System.out.println(kotelo.laskeHinta());
        System.out.println(emolevy.laskeHinta());

        emolevy.lisaaKomponentti(cpu);
        emolevy.lisaaKomponentti(ram);
        emolevy.lisaaKomponentti(gpu);
        kotelo.lisaaKomponentti(emolevy);

        System.out.println(kotelo.laskeHinta());

    }
}
