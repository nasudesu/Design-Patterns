package Proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyGallery implements Image{
    private final List<String> galleryList = new ArrayList<>();
    private final Image gallery = new Gallery();
    @Override
    public void showData(String category) {
        if(galleryList.contains(category)){
            System.out.println("Image already exists");
        }else{
            galleryList.add(category);
            gallery.showData(category);
        }
    }
}
