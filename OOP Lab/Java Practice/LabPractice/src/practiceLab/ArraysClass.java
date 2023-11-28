package practiceLab;
import java.util.Scanner;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class BookDetails extends Book {
    private double price;
    private int stock;

    public BookDetails(String title, String author, double price, int stock) {
        super(title, author);
        this.price = price;
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void updateStock(int quantity) {
        stock += quantity;
    }
}

public class ArraysClass {

	public static void main(String[] args) {
        BookDetails[] books = new BookDetails[3];
        books[0] = new BookDetails("Book1", "Author1", 25.99, 10);
        books[1] = new BookDetails("Book2", "Author2", 19.99, 15);
        books[2] = new BookDetails("Book3", "Author1", 29.99, 5);

        Scanner scanner = new Scanner(System.in);

        // Initialize members
        for (BookDetails book : books) {
            System.out.println("Book Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Price: $" + book.getPrice());
            System.out.println("Stock: " + book.getStock());
            System.out.println();
        }

        // Query availability of a book by author name
        System.out.print("Enter author name to check availability: ");
        String queryAuthor = scanner.nextLine();
        for (BookDetails book : books) {
            if (book.getAuthor().equals(queryAuthor)) {
                System.out.println("Book Title: " + book.getTitle());
                System.out.println("Available Stock: " + book.getStock());
            }
        }

        // Update stock of a book on purchase and sale
        System.out.print("Enter book title to update stock: ");
        String bookTitle = scanner.nextLine();
        System.out.print("Enter quantity to update (positive for purchase, negative for sale): ");
        int quantity = scanner.nextInt();

        for (BookDetails book : books) {
            if (book.getTitle().equals(bookTitle)) {
                book.updateStock(quantity);
                System.out.println("Stock updated for " + book.getTitle());
                System.out.println("New Stock: " + book.getStock());
            }
        }
	}

}
