package doroshevich.by;

public class Main {

    public static void main(String[] args) {
        Book arr[] = {
                new Book("Harry Potter", 15, true),
                new Book("Romeo and Julliet", 18, false),
                new Book("Karlson", 10, true),
                new Book("Sherlock", 12, true),
        };
        for(Book a : arr){
            System.out.println(a);
        }
    }
}
