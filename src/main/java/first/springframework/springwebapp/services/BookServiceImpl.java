package first.springframework.springwebapp.services;

import first.springframework.springwebapp.domain.Book;
import first.springframework.springwebapp.repositories.BookRepository;

public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
