import java.util.Scanner;

class Book {
   String name;
   String author;
   double price;
   int numPages;

    public Book(String name, String author, double price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }


    public String toString() {
        return "Book Name: " + name + ", Author: " + author + ", Price: ₹" + price + ", Pages: " + numPages;
    }
}

public class BookStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of books: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Book[] books = new Book[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Book " + (i + 1) + ":");

            System.out.print("Enter book name: ");
            String name = sc.nextLine();

            System.out.print("Enter author name: ");
            String author = sc.nextLine();

            System.out.print("Enter price: ");
            double price = sc.nextDouble();

            System.out.print("Enter number of pages: ");
            int numPages = sc.nextInt();
            sc.nextLine(); 
          
            books[i] = new Book(name, author, price, numPages);
        }

   
        System.out.println("\nBook Details:");
        for (int i = 0; i < n; i++) {
            System.out.println(books[i]);
        }
System.out.println("Name: Kashvi Agarwal");
System.out.println("USN: 1BM23CS142");
        sc.close();
    }
}
