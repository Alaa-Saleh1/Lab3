package Main;

import java.util.ArrayList;

public class Music extends Media{
    private String artist ;




    Music(String title, String auteur, String ISBN, double price, String artist){
        super(title,auteur,ISBN,price);
        this.artist=artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void listen(User user) {
        user.setPurchaseMedia(this);
    }

    public ArrayList<Music> generatePlaylist(ArrayList<Music>musicCatalog){
        ArrayList<Music> playlist=new ArrayList<>();
        for (Music songs: musicCatalog) {
            if (songs.getAuteur().equals(this.artist)) {
                playlist.add(songs);
            }
        }
        return playlist;
    }


    @Override
    public String getMediaType() {
        return (super.getPrice()>=10)? "Premium Music":"Music";
    }

    @Override//
    public String toString() {
        return super.toString()+"\nArtist : "+getArtist();
    }
}
