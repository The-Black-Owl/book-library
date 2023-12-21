package api.library.services;

import api.library.dto.BookDto;
import api.library.entity.Book;
import api.library.mapping.BookMapper;
import api.library.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    public BookService(BookRepository bookRepository, BookMapper bookMapper) {
        this.bookRepository = bookRepository;
        this.bookMapper = bookMapper;
    }

    public BookDto createBook(String isbn, BookDto bookDto){
        // to make isbn match isbn of the book we are creating
        // to achieve this we have to set the isbn in the bookDto
        bookDto.setISBN(isbn);

        Book book=bookRepository.save(bookMapper.mapFrom(bookDto));
        return bookMapper.mapTo(book);
    }
}
