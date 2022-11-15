package library.repository;

import org.springframework.stereotype.Repository;

import library.base.repository.BaseRepo;
import library.entity.AbstractBook;
import library.entity.Book;

@Repository
public interface AbstractBookRepo extends BaseRepo<AbstractBook, Long> {

}
