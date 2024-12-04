package first.springframework.springwebapp.services;

import first.springframework.springwebapp.domain.Book;
import org.springframework.stereotype.Service;

@Service
public interface BookService {

    Iterable<Book> findAll();
}
