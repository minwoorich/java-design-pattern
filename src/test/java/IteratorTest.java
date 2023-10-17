import iterator.Book;
import iterator.BookShelf;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class IteratorTest {
    @Test
    @DisplayName("next() 테스트")
    void nextTest() {
        //given
        BookShelf bookShelf = new BookShelf(5);
        bookShelf.appendBook(new Book("장화홍련"));
        bookShelf.appendBook(new Book("자바의정석"));
        bookShelf.appendBook(new Book("헨젤과그래텔"));
        bookShelf.appendBook(new Book("홍길동전"));
        bookShelf.appendBook(new Book("성경"));

        Iterator<Book> it = bookShelf.iterator();

        //when
        Book book = it.next();
        it.hasNext();

        //then
        assertThat(book.getName()).isEqualTo("장화홍련");

    }
}
