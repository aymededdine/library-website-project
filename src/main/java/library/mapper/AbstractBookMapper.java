package library.mapper;

import org.mapstruct.Mapper;

import library.base.mapper.BaseMapper;
import library.dto.AbstractBookDto;
import library.dto.BookDto;
import library.entity.AbstractBook;
import library.entity.Book;

@Mapper(componentModel = "spring" )
public interface AbstractBookMapper extends BaseMapper<AbstractBook, AbstractBookDto> {
	
//	@Override
//	@Mapping(source= "", target="")
//	BookDto map(Book library);

}
