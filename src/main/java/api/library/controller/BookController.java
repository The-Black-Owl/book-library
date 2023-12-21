package api.library.controller;

import api.library.dto.BookDto;
import api.library.services.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PutMapping("/{isbn}")
    public ResponseEntity<BookDto> createBook(@PathVariable("isbn") String isbn
            , @RequestBody BookDto bookRequest){
        return new ResponseEntity<>(bookService.createBook(isbn,bookRequest), HttpStatus.CREATED);
    }
}
