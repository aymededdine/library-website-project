package book.repository;

import org.springframework.stereotype.Repository;

import book.base.repository.BaseRepo;
import book.entity.Book;

@Repository
public interface BookRepo extends BaseRepo<Book, Long> {

}
