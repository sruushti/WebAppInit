package first.springframework.springwebapp.services;

import first.springframework.springwebapp.domain.Author;
import first.springframework.springwebapp.repositories.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }
    @Override
    public Iterable<Author> getAuthors() {
        return authorRepository.findAll();
    }

//    On the service implementation, why use the @Override annotation?
//    To mark a given method as :
//    an implementation of another abstract method defined on the base class/interface.
//    a new implementation of another concrete method defined on the base class/interface.
//    This annotation, isn't mandatory.
//    But it is a best practice to use it to prevent errors when defining a method that has
//    the same signature of another concrete one, already defined in the base class.
}
