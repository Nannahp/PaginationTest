package com.example.chattest.config;

import com.example.chattest.models.Book;
import com.example.chattest.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class InitBooks {

    @Autowired
    private BookRepository bookRepository;

    @Bean
    public CommandLineRunner populateDatabase() {
        return (args) -> {
            List<Book> books = Arrays.asList(
                    new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling"),
                    new Book("Harry Potter and the Chamber of Secrets", "J.K. Rowling"),
                    new Book("Harry Potter and the Prisoner of Azkaban", "J.K. Rowling"),
                    new Book("Harry Potter and the Goblet of Fire", "J.K. Rowling"),
                    new Book("Harry Potter and the Order of the Phoenix", "J.K. Rowling"),
                    new Book("Harry Potter and the Half-Blood Prince", "J.K. Rowling"),
                    new Book("Harry Potter and the Deathly Hallows", "J.K. Rowling"),
                    new Book("The Hunger Games", "Suzanne Collins"),
                    new Book("Catching Fire", "Suzanne Collins"),
                    new Book("Mockingjay", "Suzanne Collins"),
                    new Book("The Fault in Our Stars", "John Green"),
                    new Book("Divergent", "Veronica Roth"),
                    new Book("Insurgent", "Veronica Roth"),
                    new Book("Allegiant", "Veronica Roth"),
                    new Book("The Maze Runner", "James Dashner"),
                    new Book("The Scorch Trials", "James Dashner"),
                    new Book("The Death Cure", "James Dashner"),
                    new Book("Twilight", "Stephenie Meyer"),
                    new Book("New Moon", "Stephenie Meyer"),
                    new Book("Eclipse", "Stephenie Meyer"),
                    new Book("Breaking Dawn", "Stephenie Meyer"),
                    new Book("The Girl with the Dragon Tattoo", "Stieg Larsson"),
                    new Book("The Girl Who Played with Fire", "Stieg Larsson"),
                    new Book("The Girl Who Kicked the Hornets Nest", "Stieg Larsson"),
                    new Book("A Game of Thrones", "George R.R. Martin"),
                    new Book("A Clash of Kings", "George R.R. Martin"),
                    new Book("A Storm of Swords", "George R.R. Martin"),
                    new Book("A Feast for Crows", "George R.R. Martin"),
                    new Book("A Dance with Dragons", "George R.R. Martin"),
                    new Book("The Perks of Being a Wallflower", "Stephen Chbosky"),
                    new Book("1984", "George Orwell"),
                    new Book("Brave New World", "Aldous Huxley"),
                    new Book("To Kill a Mockingbird", "Harper Lee"),
                    new Book("The Great Gatsby", "F. Scott Fitzgerald"),
                    new Book("Pride and Prejudice", "Jane Austen"),
                    new Book("The Catcher in the Rye", "J.D. Salinger"),
                    new Book("Moby-Dick", "Herman Melville"),
                    new Book("The Lord of the Rings: The Fellowship of the Ring", "J.R.R. Tolkien"),
                    new Book("The Lord of the Rings: The Two Towers", "J.R.R. Tolkien"),
                    new Book("The Lord of the Rings: The Return of the King", "J.R.R. Tolkien"),
                    new Book("The Hobbit", "J.R.R. Tolkien"),
                    new Book("One Hundred Years of Solitude", "Gabriel García Márquez"),
                    new Book("The Kite Runner", "Khaled Hosseini"),
                    new Book("The Book Thief", "Markus Zusak"),
                    new Book("The Chronicles of Narnia: The Lion, the Witch and the Wardrobe", "C.S. Lewis"),
                    new Book("The Chronicles of Narnia: Prince Caspian", "C.S. Lewis"),
                    new Book("The Chronicles of Narnia: The Voyage of the Dawn Treader", "C.S. Lewis"),
                    new Book("The Chronicles of Narnia: The Silver Chair", "C.S. Lewis"),
                    new Book("The Chronicles of Narnia: The Horse and His Boy", "C.S. Lewis"),
                    new Book("The Chronicles of Narnia: The Magician's Nephew", "C.S. Lewis"),
                    new Book("The Chronicles of Narnia: The Last Battle", "C.S. Lewis"),
                    new Book("Fahrenheit 451", "Ray Bradbury"),
                    new Book("Slaughterhouse-Five", "Kurt Vonnegut"),
                    new Book("The Handmaid's Tale", "Margaret Atwood"),
                    new Book("The Picture of Dorian Gray", "Oscar Wilde"),
                    new Book("The Alchemist", "Paulo Coelho"),
                    new Book("The Road", "Cormac McCarthy"),
                    new Book("The Count of Monte Cristo", "Alexandre Dumas"),
                    new Book("Little Women", "Louisa May Alcott")
            );
            books.forEach(book -> {
                bookRepository.save(book); // Save each book into the repository
                System.out.println("Book added: " + book.getTitle() + " by " + book.getAuthor());
            });
        };
    }
}
