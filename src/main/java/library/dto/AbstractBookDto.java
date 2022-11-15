package library.dto;

import org.mapstruct.Mapper;

import library.base.dto.BaseDTO;

@Mapper(componentModel = "spring" )
public class AbstractBookDto extends BaseDTO<Long> {

}
