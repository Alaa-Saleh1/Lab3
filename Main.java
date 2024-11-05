package Main;

public class Main {
    public static void main(String[] args) {

        Store store = new Store();

        User user1 = new User("Alaa", "alaa@gmail.com");
        store.addUser(user1);
        User user2 = new User("Saleh", "saleh@gmail.com");
        store.addUser(user2);

        store.displayUser();


        Book book1 = new Book ("Rich dad poor dad", "Robert T.Kiyosaki", "B1", 10.99, 20);
        Book book2 = new Book ("Letting Go: ", "David R. Hawkins", "B2",26.50,10);

        Movie movie1 = new Movie("Inside Out", "Pete Docter", "M1", 16.00, 95);
        Movie movie2 = new Movie("Soul", "Pete Docter", "M2", 15.99, 120);


        Music music1 = new Music("musicone", "lola", "Mu1", 9.50,"als");
        Music music2 = new Music("musictwo", "asma", "Mu2", 14.0,"als");

        Novel novel1 = new Novel("Pride and Prejudice", "Jane Austen", "No1", 9.99, 5, "Romance");
        Novel novel2 = new Novel("Les Miserables", "Victor Hugo", "No2", 26.55, 5, "Classics");

        AcademicBook academicBook1 = new AcademicBook("Math", "Ahmed", "AB1", 35.00, 4, "Math");
        AcademicBook academicBook2 = new AcademicBook("Science", "sara", "AB2", 40.50, 3, "Science");

        store.addMedia(book1);
        store.addMedia(book2);
        store.addMedia(movie1);
        store.addMedia(movie2);
        store.addMedia(music1);
        store.addMedia(music2);
        store.addMedia(novel1);
        store.addMedia(novel2);
        store.addMedia(academicBook1);
        store.addMedia(academicBook2);


        store.displayMedia();

        user1.addToCart(book1);
        user1.addToCart(book2);
        user1.addToCart(novel1);
        user1.addToCart(music1);
        user1.addToCart(movie1);

        System.out.println("\nUser's Cart Checkout:");
        user1.checkout();



        Review review1 = new Review("Alaa", 5.0, "Great books");
        book1.addReviews(review1);

        Review review2 = new Review("Alaa", 3.5, "Good");
        book2.addReviews(review2);


        System.out.print("\nAverage Rating of " + book1.getTitle() + " : " + book1.getAverageRating()+" , ");
        System.out.println(book1.getMediaType());

        System.out.println("\n_______________");

        System.out.print("\nAverage Rating of " + book2.getTitle() + ": " + book2.getAverageRating()+" , ");
        System.out.println(book2.getMediaType());

        System.out.println("\n_______________");

        System.out.println(store.searchBook("Rich dad poor dad"));


    }
}