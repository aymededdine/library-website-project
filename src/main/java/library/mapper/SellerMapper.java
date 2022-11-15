package library.mapper;

import org.mapstruct.Mapper;

import library.base.mapper.BaseMapper;
import library.dto.SellerDto;
import library.entity.Seller;

@Mapper(componentModel = "spring" )
public interface SellerMapper extends BaseMapper<Seller, SellerDto> {

}
