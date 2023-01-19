package task3;

public class Book {
    String author;
    String bookName;
    String bookType;

    public Book(String author, String bookName, String bookType) {
        this.author = author;
        this.bookName = bookName;
        this.bookType = bookType;
    }


    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", bookName='" + bookName + '\'' +
                ", bookType='" + bookType + '\'' +
                '}';
    }
}

@ FunctionalInterface
    interface   Show {
    void print();
}
class Main{
    public static void main(String[] args) {
        Book book = new Book("Shakespeare","Otello","tragedy");
        Show printBook = () -> System.out.println(book );
        printBook.print() ;
    }
}