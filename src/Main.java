import com.aysin.libarary.*;
import com.aysin.libarary.enums.Status;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("*********************************************");
        Author ataturk = new Author("Kemal Atatürk", new ArrayList<>(),"author");
        Book nutuk = new Romans(7,ataturk,"Nutuk",99.95,Status.NEW,21,LocalDate.of(2024,1,15));
        Book geometri = new Science(23,ataturk,"Geometri",49.90,Status.OVERUSED,32);
        Library.books.add(nutuk);
        System.out.println("Library's books: " + Library.books);
        Author dostoyevski = new Author("Dostoyevski", new ArrayList<>(), "Author");
        Book crimeAndPunishment = new Romans(1,dostoyevski,"Crime and Punishment",19.90,Status.NEW,12, LocalDate.of(2022, 5, 15) );
        Library.books.add(crimeAndPunishment);
        System.out.println("Library's books: " + Library.books);
        Library.books.add(geometri);
        System.out.println("Library's books: " + Library.books);
        Reader aysin = new Reader("aysin", new ArrayList<>(), "Reader");
        crimeAndPunishment.setPrice(100);
        System.out.println("Crime and Punishment price updateeed" +crimeAndPunishment.display());
        System.out.println(geometri.getClass());
        Book.addBook(geometri);
        System.out.println("science books: "+ Science.scienceBooks);
        aysin.borrowBook(geometri);
        aysin.purchaseBook(geometri);
        aysin.purchaseBook(geometri);
        aysin.borrowBook(geometri);
        aysin.returnBook(geometri);
        aysin.borrowBook(geometri);
        aysin.purchaseBook(geometri);

    }
}