import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AuthorBookTester {

    Author author;
    Book book;

    public void setUp() {
        author = new Author("Philip K Dick", "pkd@gmail.com", 'm');
        book = new Book("The Man in the High Castle", author, 100, 10);
    }

    public void tearDown() {
        author = null;
        book = null;
    }

    @Test
    public void testAuthorConstructorName() {
        setUp();
        assertTrue("Ensure that your constructor in your Author class has been implemented correctly!", author.getName().equals("Philip K Dick"));
        tearDown();
    }

    @Test
    public void testAuthorConstructorEmail() {
        setUp();
        assertTrue("Ensure that your constructor in your Author class has been implemented correctly!", author.getEmail().equals("pkd@gmail.com"));
        tearDown();
    }

    @Test
    public void testAuthorConstructorGender() {
        setUp();
        assertTrue("Ensure that your constructor in your Author class has been implemented correctly!", author.getGender() == 'm');
        tearDown();
    }

    @Test
    public void testAuthorSetEmail() {
        setUp();
        author.setEmail("pkd@cis.edu.hk");
        assertTrue("Ensure that your setEmail method in your Author class has been implemented correctly!", author.getEmail().equals("pkd@cis.edu.hk"));
        tearDown();
    }

    @Test
    public void testAuthorToString() {
        setUp();
        assertTrue("Ensure that your constructor in your Author class has been implemented correctly!", author.toString().equals("Philip K Dick (m) at pkd@gmail.com"));
        tearDown();
    }

    @Test
    public void testBookConstructorName() {
        setUp();
        assertTrue("Ensure that your constructor in your Book class has been implemented correctly!", book.getName().equals("The Man in the High Castle"));
        tearDown();
    }

    @Test
    public void testBookConstructorAuthor() {
        setUp();
        assertTrue("Ensure that your constructor in your Book class has been implemented correctly!", book.getAuthor().toString().equals("Philip K Dick (m) at pkd@gmail.com"));
        tearDown();
    }

    @Test
    public void testBookConstructorPrice() {
        setUp();
        assertTrue("Ensure that your constructor in your Book class has been implemented correctly!", book.getPrice() == 100);
        tearDown();
    }

    @Test
    public void testBookConstructorQuantity() {
        setUp();
        assertTrue("Ensure that your constructor in your Book class has been implemented correctly!", book.getQty() == 10);
        tearDown();
    }

    @Test
    public void testBookGetName() {
        setUp();
        assertTrue("Ensure that your getName method in your Book class has been implemented correctly!", book.getName().equals("The Man in the High Castle"));
        tearDown();
    }

    @Test
    public void testBookGetAuthor() {
        setUp();
        assertEquals("Ensure that your getAuthor method in your Book class has been implemented correctly!", "Philip K Dick (m) at pkd@gmail.com", book.getAuthor().toString());
        tearDown();
    }

    @Test
    public void testBookGetPrice() {
        setUp();
        assertTrue("Ensure that your getPrice method in your Book class has been implemented correctly!", book.getPrice() == 100);
        tearDown();
    }

    @Test
    public void testBookSetPrice() {
        setUp();
        book.setPrice(150);
        assertTrue("Ensure that your setPrice method in your Book class has been implemented correctly!", book.getPrice() == 150);
        tearDown();
    }

    @Test
    public void testBookGetQty() {
        setUp();
        assertTrue("Ensure that your getQty method in your Book class has been implemented correctly!", book.getQty() == 10);
        tearDown();
    }

    @Test
    public void testBookSetQty() {
        setUp();
        book.setQty(20);
        assertTrue("Ensure that your setQty method in your Book class has been implemented correctly!", book.getQty() == 20);
        tearDown();
    }

    @Test
    public void testBookToString() {
        setUp();
        assertEquals("Ensure that your toString method in your Book class has been implemented correctly!", "'The Man in the High Castle' by Philip K Dick (m) at pkd@gmail.com", book.toString());
        tearDown();
    }

}
