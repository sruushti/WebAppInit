package first.springframework.springwebapp.services;

import first.springframework.springwebapp.domain.Author;

public interface AuthorService {

    Iterable<Author> getAuthors();
}
