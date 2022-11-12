package book.entity;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import book.base.entity.BaseEntity;
import book.entity.Book.Made;
import book.entity.Book.Quality;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "sec_sellers")
public class Seller extends BaseEntity<String> {
	
	
	@NotBlank
	private String firstName;
	@NotBlank
	private String lastName;
	
	private String name = firstName+lastName;
	private String email;
	private String phone;

	@OneToMany(mappedBy="seller")
	private List<Book> books;
	
	@ManyToMany(mappedBy = "sellers")
	private Set<AbstractBook> abstractBooks = new HashSet<>();
	
	private Rate rate;
	
	public enum Rate{
		ONE_STAR, TWO_STARS, THREE_STARS, FOUR_STARS, FIVE_STARS
	}

}
