package api.library.services;

import api.library.dto.AuthorDto;
import api.library.entity.Author;
import api.library.mapping.AuthorMapper;
import api.library.repository.AuthorRepository;
import org.springframework.stereotype.Service;


@Service
public class AuthorService {
    private final AuthorRepository authorRepository;
    private final AuthorMapper authorMapper;

    public AuthorService(AuthorRepository authorRepository, AuthorMapper authorMapper) {
        this.authorRepository = authorRepository;
        this.authorMapper = authorMapper;
    }

    public AuthorDto createAuthor(AuthorDto request){
        Author author=authorRepository.save(authorMapper.mapFrom(request));
        return authorMapper.mapTo(author);
    }
}
