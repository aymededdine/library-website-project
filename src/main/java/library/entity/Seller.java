package library.entity;


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
import javax.validation.constraints.Pattern;

import library.base.entity.BaseEntity;
import library.entity.Book.Made;
import library.entity.Book.Quality;
import library.validator.IpAddress;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "sec_sellers")
public class Seller extends BaseEntity<Long> {
	
	
	@NotBlank
	private String firstName;
	@NotBlank
	private String lastName;
	
	private String name = firstName+lastName;
	
	@Email
	private String email;
	private String phone;
	
	//@Pattern(regexp = "^([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})$")
	@IpAddress
	private String ipAdress;
	
	// @NotEmpty
	@OneToMany(mappedBy="seller")
	private List<Book> books;
	
    // @NotEmpty
	@ManyToMany(mappedBy = "sellers")
	private Set<AbstractBook> abstractBooks = new HashSet<>();
	
	private Rate rate;
	
	public enum Rate{
		ONE_STAR, TWO_STARS, THREE_STARS, FOUR_STARS, FIVE_STARS
	}

}
