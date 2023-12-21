package api.library.controller;

import api.library.dto.AuthorDto;
import api.library.services.AuthorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/author")
public class AuthorController {
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;

    }

    //create author
    @PostMapping
    public AuthorDto createAuthor(@RequestBody AuthorDto author){
        return authorService.createAuthor(author);
    }
}
