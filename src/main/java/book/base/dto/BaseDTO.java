package book.base.dto;

import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@MappedSuperclass
public class BaseDTO<ID> {
	
	private ID id;
		
	private Integer statusCode;

}
