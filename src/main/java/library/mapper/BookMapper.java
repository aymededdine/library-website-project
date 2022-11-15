package library.mapper;

import org.mapstruct.Mapper;

import library.base.mapper.BaseMapper;
import library.dto.BookDto;
import library.entity.Book;

@Mapper(componentModel = "spring" )
public interface BookMapper extends BaseMapper<Book, BookDto> {
	
//	@Override
//	@Mapping(source= "", target="")
//	BookDto map(Book library);

}
