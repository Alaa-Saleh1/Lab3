package Main;

import java.util.ArrayList;

public class User {
    private String username;
    private String email;
    private ArrayList<Media> purchaseMedia ;
    private ArrayList<Media> shoppingCart;


    User(String username, String email){
        this.username=username;
        this.email=email;
        this.purchaseMedia=new ArrayList<>();
        this.shoppingCart=new ArrayList<>();

    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void addToCart(Media media){
        shoppingCart.add(media);
    }

    public void removeFromCart(Media media){
        shoppingCart.remove(media);
    }

    public void setPurchaseMedia(Media media) {
        purchaseMedia.add(media);
    }

    public void checkout(){
        for (Media media: shoppingCart){
            if(media instanceof Book){
                Book book = (Book)media;
                book.purchase(this);
            }else if(media instanceof Movie){
                Movie movie=(Movie) media;
                movie.watch(this);
            }else if(media instanceof Music){
                Music music=(Music) media;
                music.listen(this);
            }
        }
        purchaseMedia.addAll(shoppingCart);
    }




}
