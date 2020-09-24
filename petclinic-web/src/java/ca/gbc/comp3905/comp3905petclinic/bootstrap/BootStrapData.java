package ca.gbc.comp3905.comp3905petclinic.bootstrap;

import org.springframework.stereotype.Component;
import ca.gbc.comp3905.comp3905petclinic.domain.Author;
import ca.gbc.comp3905.comp3905petclinic.domain.Book;
import ca.gbc.comp3905.comp3905petclinic.repositories.AuthorRespository;
import ca.gbc.comp3905.comp3905petclinic.repositories.BookRespository;
import org.springframework.boot.CommandLineRunner;

@Component
public class BootStrapData implements CommandLineRunner {
    private AuthorRespository authorRepository;
    private BookRespository bookRepository;

    public BootStrapData (AuthorRespository authorRepository,BookRespository bookRepository){
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String...args) throws Exception{
        
    }

}
