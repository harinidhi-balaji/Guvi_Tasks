//Book

import java.util.Scanner;

class Book{
    private int bookId;
    private String title;
    private String author;
    private boolean isAvailable;

    //Constructor to initialize book attributes
    public Book(int bookId, String title, String author, boolean isAvailable){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    //Getters & Setters
    public int getBookId(){
        return bookId;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public boolean isAvailable(){
        return isAvailable;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setAvailable(boolean available){
        isAvailable = available;
    }
    public String toString(){
        return "Book: " + bookId + ", Title: " + title + ", Author: " + author + ", Available: " + isAvailable;
    }
}

//Library
class Library{
    private Book[] books;
    private int count;

    //Initialize Library with a fixed size
    public Library(){
        books = new Book[5]; //Max 5 books
        count = 0;
    }

    //Method to add book
    public void addBook(Book book){
        if(count < books.length){
            books[count] = book;
            count++;
        }else{
            System.out.println("Library is full!");
        }
    }

    //Method to remove book
    public void removeBook(int bookId){
        boolean found = false;
        for(int i=0; i<count; i++){
            if(books[i].getBookId() == bookId){
                books[i] = books[count-1];
                books[count-1] = null;
                count--;
                found = true;
                System.out.println("Book removed.");
                break;
            }
        }
        if(!found){
            System.out.println("Book not found.");
        }
    }

    //Display all books
    public void displayBooks(){
        for(int i=0; i<count; i++){
            System.out.println(books[i]);
        }
    }
}

public class BookManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner (System.in);
        while(true){ //Menu and user input handling
            System.out.println("\n1.Add Book \n2.Remove Book \n3.Display Books \n4.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Book ID, title, author, availability(true/false): ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume next line
                    String title = sc.nextLine();
                    String author = sc.nextLine();
                    boolean available = sc.nextBoolean();
                    Book b = new Book(id, title, author, available);
                    library.addBook(b);
                    break;

                case 2:
                    System.out.println("Enter Book ID to remove: ");
                    int removeId = sc.nextInt();
                    library.removeBook(removeId);
                    break;

                case 3:
                    library.displayBooks();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;
            
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
