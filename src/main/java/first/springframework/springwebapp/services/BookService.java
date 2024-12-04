package first.springframework.springwebapp.services;

import first.springframework.springwebapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
