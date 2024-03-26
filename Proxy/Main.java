package Proxy;

public class Main {
    public static void main(String[] args) {
        Image proxyGallery = new ProxyGallery();
        proxyGallery.showData("dog");
        proxyGallery.showData("cat");
        proxyGallery.showData("bird");
        proxyGallery.showData("fish");
        proxyGallery.showData("dog");
    }
}
