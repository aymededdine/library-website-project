package library.repository;

import org.springframework.stereotype.Repository;

import library.base.repository.BaseRepo;
import library.entity.Book;

@Repository
public interface BookRepo extends BaseRepo<Book, Long> {

}
