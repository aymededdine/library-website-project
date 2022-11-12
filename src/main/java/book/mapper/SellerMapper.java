package book.mapper;

import org.mapstruct.Mapper;

import book.base.mapper.BaseMapper;
import book.dto.SellerDto;
import book.entity.Seller;

@Mapper(componentModel = "spring" )
public interface SellerMapper extends BaseMapper<Seller, SellerDto> {

}
