package hobby;

public class Main {
    public static void main(String[] args) {
        // Create Book objects with different property values
        Book book1 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 1997);
        Book book2 = new Book("A Brief History Of Time", "Stephen Hawking", 1988);

        // Output full descriptions of the books
        System.out.println("Description of the book 1 :");
        book1.printBookDescription();

        System.out.println("\nDescription of the book 2 :");
        book2.printBookDescription();
    }
}
