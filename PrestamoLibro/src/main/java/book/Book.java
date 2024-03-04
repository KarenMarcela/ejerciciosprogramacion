package book;
public class Book {
    
    //Propiedades
    String title;
    int quantity;
    int id;
    String genre;
    String loanDate;
    String returnDate;
    boolean available;

    public Book(String title, int quantity, int id, String genre) {
        this.title = title;
        this.quantity = quantity;
        this.id = id;
        this.genre = genre;
        this.available=true;
    }
    
    public void lendBook(){
        this.available=false;
    }
    void returnBook(){
        this.available=true;
    }

    public boolean isAvailable() {
        return available;
    }
    
    
    
    
}

