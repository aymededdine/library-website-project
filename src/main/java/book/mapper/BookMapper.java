package book.mapper;

import org.mapstruct.Mapper;

import book.base.mapper.BaseMapper;
import book.dto.BookDto;
import book.entity.Book;

@Mapper(componentModel = "spring" )
public interface BookMapper extends BaseMapper<Book, BookDto> {
	
//	@Override
//	@Mapping(source= "", target="")
//	BookDto map(Book book);

}
