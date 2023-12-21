package api.library.mapping;


import api.library.dto.AuthorDto;
import api.library.dto.BookDto;
import api.library.entity.Author;
import api.library.entity.Book;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class BookMapper implements Mapper<Book, BookDto> {
    private final ModelMapper modelMapper;

    public BookMapper(ModelMapper modelMapper) {

        this.modelMapper = modelMapper;
        modelMapper.typeMap(AuthorDto.class, Author.class)
                .addMappings(mapper -> mapper.map(src -> Integer.parseInt(String.valueOf(src.getAge())), Author::setAge));
    }


    @Override
    public BookDto mapTo(Book book) {
        return modelMapper.map(book,BookDto.class);
    }

    @Override
    public Book mapFrom(BookDto bookDto) {
        return modelMapper.map(bookDto, Book.class);
    }
}
