package InterviewQ.Collection_Set;

public class Book {
    int bookId ;
    String bookName ;
    String bookAuthName;
    String bookPublisherName;
    int bookQty;


    Book(int id, String name, String author, String publisher, int quantity){

        this.bookId = id;
        this.bookName = name;
        this.bookAuthName = author;
        this.bookPublisherName = publisher;
        this.bookQty = quantity;
    }

}
