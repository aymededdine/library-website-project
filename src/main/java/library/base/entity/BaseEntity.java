package library.base.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@MappedSuperclass
@EntityListeners({AuditingEntityListener.class})
public class BaseEntity<ID> {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private ID id;
	
	//@NotBlank
	private String name;
		
	private Integer statusCode;

	
	@CreatedBy
	@Column(updatable = false)
	private String createdBy;
	
	@CreatedDate
	@Column(updatable = false)
	private LocalDateTime createdDate;
	
	@LastModifiedBy
	private String lastModifiedBy;
	
	@LastModifiedDate
	private LocalDateTime lastModifiedDate;

}
