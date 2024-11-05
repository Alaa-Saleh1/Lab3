package Main;

import java.util.ArrayList;

public class Store {
    private ArrayList<Media> media;
    private ArrayList<User> users;


    Store(){
        this.media = new ArrayList<>();
        this.users= new ArrayList<>();

    }

    public void addUser(User user){
        users.add(user);
    }

    public void displayUser(){
        System.out.println("\n# Register users: \n");
        for (User user: users){
            System.out.println(user.getUsername());
            System.out.println("_______________");
        }
    }
    public void addMedia(Media media1) {
        media.add(media1);
    }


    public void displayMedia(){
        System.out.println("\n# Available Media: \n");
        for (Media media1: media){
            System.out.println(media1.toString());
            System.out.println("_______________");
        }
    }

    public String searchBook(String title){
        for (Media media1: media){
            if(media1 instanceof Book && media1.getTitle().equalsIgnoreCase(title)) {
                return "Found book: "+title;
            }
        }
        return "Book not found.";

    }

}
