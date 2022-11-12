package book.base.mapper;

import java.util.List;
import java.util.Set;

import org.mapstruct.MappingTarget;


public interface BaseMapper<T, DTO> {
	
	DTO map(T t);
	
	T unMap(DTO dto);
	
	T unMap(@MappingTarget T t, DTO dto);
	
//	Set<DTO> map(Set<T> t);
	
	List<DTO> map(List<T> t);

	
	

}
