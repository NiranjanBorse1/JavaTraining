package java_basics;

public class TestLibrary {

    public static void main(String[] args) {

        Book b1 = new Book("The Alchemist");
        Book b2 = new Book("Kite Runner");

        Member m1 = new Member("Niranjan");
        Member m2 = new Member("Atharva");

        System.out.println("Initial Status:");
        b1.status();
        m1.status();

        // Issue book to member
        System.out.println("\nIssuing Book:");
        m1.borrowBook(b1);

        // Print status
        System.out.println("\nAfter Issue:");
        b1.status();
        m1.status();

        // Return book from member
        System.out.println("\nReturning Book:");
        m1.returnBook();

        System.out.println("\nAfter Return:");
        b1.status();
        m1.status();
    }
}
