package library.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import library.base.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "sec_abstract_books")
public class AbstractBook extends BaseEntity<Long> {

	@NotBlank
	private String author;
	
	private String imagePath;
	
	// @NotEmpty
	@OneToMany()
	@JoinColumn(name = "abstract_book_id")
	private List<Book> books;
	
	// @NotEmpty
	@ManyToMany
	@JoinTable(name = "sec_abstract_books_sellers"
	,joinColumns = @JoinColumn(name="abstract_book_id")
	,inverseJoinColumns = @JoinColumn(name="seller_id"))
	private Set<Seller> sellers = new HashSet<>();


	
}
