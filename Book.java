package Main;

import java.util.ArrayList;

public class Book extends Media{
    private int stock ;
    private ArrayList<Review> reviews;


    Book(String title, String auteur, String ISBN, double price, int stock){
        super(title,auteur,ISBN,price);
        this.stock=stock;
        this.reviews=new ArrayList<>();
    }


    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void addReviews(Review review){
        reviews.add(review);
    }

    public double getAverageRating(){
        if (reviews.isEmpty()){
            return 0;
        }
        double totalRating =0 ;
        for (Review review : reviews){
            totalRating += review.getRating();
        }
        return totalRating/reviews.size();
    }

    public void purchase(User user){
        if (stock>0) {
            user.setPurchaseMedia(this);
            stock--;
        } else System.out.println("Out Of Stock.");

    }

    public void restock(int quantity){
        stock+=quantity;
        System.out.println(getTitle()+" has been restocked. New quantity: "+stock);
    }


    public boolean isBestSeller(){
        return getAverageRating()>=4.5;
    }
    @Override
    public String getMediaType() {

        return (isBestSeller())?"Bestselling Book":"Book";
    }

    @Override
    public String toString() {
        return super.toString()+"\nStock : "+getStock()+"\nAverage Rating : "+getAverageRating();
    }
}
