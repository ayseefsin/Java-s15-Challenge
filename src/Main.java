import com.aysin.libarary.Author;
import com.aysin.libarary.Book;
import com.aysin.libarary.Books;
import com.aysin.libarary.Romans;
import com.aysin.libarary.enums.Status;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Book crimeAndPunishment = new Book()
        Author a1 =new Author("Dostoyevski", new Books(new LinkedList<>(){}),"Author");

        System.out.println("yazar: " +a1);
        Romans CrimeAndPunishment = new Romans(1,"Fyodor Dostoyevsky","Crime and Punishment",
                99.99, Status.NEW,12);


    }
}