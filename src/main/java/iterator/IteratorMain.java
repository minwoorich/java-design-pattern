package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorMain {
    public static void main(String[] args) {
//        BookShelf books = new BookShelf(5);
        List<Book> books = new ArrayList<>();

//        books.appendBook(new Book("c의 정석"));
//        books.appendBook(new Book("파이썬의 정석"));
//        books.appendBook(new Book("SQL의 정석"));
//        books.appendBook(new Book("자바의정석"));

        books.add(new Book("무서운게 딱좋아"));
        books.add(new Book("재밌는게 딱좋아"));
        books.add(new Book("슬픈게 딱좋아"));
        books.add(new Book("딱좋은게 딱좋아"));

        Iterator<Book> it = books.iterator();

        for (Book book : books) {
            System.out.println(book.getName());
        }
    }
}
