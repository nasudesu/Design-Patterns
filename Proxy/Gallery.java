package Proxy;

public class Gallery implements Image{

    @Override
    public void showData(String category) {
        System.out.println(category + " Image");
    }
}
