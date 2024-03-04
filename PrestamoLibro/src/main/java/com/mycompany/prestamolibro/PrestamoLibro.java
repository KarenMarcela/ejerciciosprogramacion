
package com.mycompany.prestamolibro;
import book.Book;

public class PrestamoLibro {

    public static void main(String[] args) {
        Book book1=new Book("Harry Potter",5,25,"Fantasía");
        Book book2=new Book("El nombre del viento",2,27,"Fantasía");
        
        //Presto el libro
        book1.lendBook();
        System.out.println(book1.isAvailable());
        System.out.println(book2.isAvailable());
    }
}
