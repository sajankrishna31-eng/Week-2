class Book {
    String title;
    String author;
    double price;
}

public class BookDetails {
    public static void main(String[] args) {
        Book b = new Book();
        b.title = "Java Programming";
        b.author = "Herbert Schildt";
        b.price = 599.50;

        System.out.println("Book Details:");
        System.out.println("Title  : " + b.title);
        System.out.println("Author : " + b.author);
        System.out.println("Price  : ₹" + b.price);
    }
}