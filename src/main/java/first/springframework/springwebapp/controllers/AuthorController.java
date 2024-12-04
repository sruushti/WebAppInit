package first.springframework.springwebapp.controllers;

import first.springframework.springwebapp.services.AuthorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @RequestMapping("/authors")
    public String getAuthor(Model model) {
        model.addAttribute("authors", authorService.getAuthors());
        return "authors";
    }
}
