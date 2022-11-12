package book.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import book.base.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "sec_books")
public class Book extends BaseEntity<Long> {
	
	@PositiveOrZero
	@NotNull
	private Double price;
	@NotBlank
	private String edition;
	@NotNull
	private Made made;
	private Quality quality;
	private String photos;
	@NotNull
	private boolean delivery;
	
    @ManyToOne
    @JoinColumn(name = "seller_id")
	private Seller seller;
    
//    @ManyToOne
//    private AbstractBook abstractBook;
	
	public enum Made{
		NEW, OLD
	}
	
	public enum Quality{
		VERY_BAD, BAD, NORMAL, GOOD, VERY_GOOD, LIKE_NEW
	}

}
