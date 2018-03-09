/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
import java.util.ArrayList;
import java.util.List;
public class Author extends Person {
    private List books;

    public Author(String firstName, String lastName) {
        super(firstName, lastName);
        books = new ArrayList();
    }

    /**
     * @deprecated Use publishedBooks instead
     */


    @Deprecated
    @SuppressWarnings({"all, unchecked"})
    public List<String> getBooks() {
        return publishedBooks();
    }

    public List<String> publishedBooks() {
        return publishedBooks();
    }

    public void addBook(String book) {
        publishedBooks().add(book);
    }

    @SuppressWarnings({"all, unchecked"})
    public String sortName() {
        return String.format("%s, %s", lastName, firstName);
    }
}
