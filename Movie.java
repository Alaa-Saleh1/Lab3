package Main;

import java.util.ArrayList;

public class Movie extends Media{
    private int duration;


    Movie(String title, String auteur, String ISBN, double price, int duration){
        super(title,auteur,ISBN,price);
        this.duration=duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void watch(User user){
        user.setPurchaseMedia(this);
    }

    public ArrayList<Movie> recommendsSimilarMovies(ArrayList<Movie> movieCatalog){

        ArrayList<Movie> similarMovies =new ArrayList<>();
        for (Movie movie : movieCatalog){
            if(movie.getAuteur().equals(this.getAuteur())){
                similarMovies.add(movie);
            }
        }
        return similarMovies;
    }

    @Override
    public String getMediaType() {
        return (duration >= 120)?"Long Movie":"Movie";
    }

    @Override
    public String toString() {
        return super.toString()+"\nDuration : "+getDuration();
    }


}
