
package com.mycompany.prestamolibro;
import book.Book;
import java.util.Scanner;

public class PrestamoLibro {
    
    static boolean isBookAvailable(Book[] array, String title) {
        boolean bookStatus = false;
        for (Book book : array) {
            if (book.getTitle().toLowerCase().equals(title)) {
                bookStatus = book.isAvailable();
                break;
            }
        }
        return bookStatus;
    
    }
    
    public static void main(String[] args) {
        
        Book book1=new Book("harrypotter",5,25,"Fantasía");
        Book book2=new Book("elnombredelviento",2,27,"Fantasía");
        Book[] books = {book1, book2};
        
        Scanner scanner=new Scanner(System.in);
        int option=1;
        do{
            System.out.println("Ingrese el còdigo de la opciòn que desea realizar : ");
            System.out.println("1.Agregar un nuevo libro ");
            System.out.println("2.Buscar libro ");
            System.out.println("3.Prestar libro ");
            System.out.println("4.Devolver libro ");
            System.out.println("5.Salir ");
            option=scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("bien");
                    break;
                case 2:
                    System.out.println("Ingrese el tìtulo del libro a buscar sin añadir espacios entre las palabras");
                    String titleBook = scanner.next().toLowerCase();
                    System.out.println(isBookAvailable(books, titleBook));
                    break;
                case 3:
                    System.out.println("bien");
                    break;
                case 4:
                    System.out.println("bien");
                    break;
                case 5:
                    
                    System.out.println("Gracias por utilizar nuestro servicio");
                    option=6;
                    break;
                default:
                    System.out.println("Error, ingrese un codigo vàlido");
                    option=1;

        }
        }while(option>=1 && option<=5);
        
        
        
        //Presto el libro
        book1.lendBook();
        System.out.println("The book Harry Potter is available? ");
        System.out.println(book1.isAvailable());
        System.out.println("The book El nombre del viento is available? ");
        System.out.println(book2.isAvailable());
    }
}
