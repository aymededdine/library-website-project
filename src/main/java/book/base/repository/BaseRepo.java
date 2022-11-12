package book.base.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import book.base.entity.BaseEntity;

@NoRepositoryBean
public interface BaseRepo<T extends BaseEntity , ID> extends JpaRepository<T, ID> {
	
	
	@Modifying
	@Transactional
	@Query(value = "UPDATE #{#entityName} t SET t.statusCode = :statusCode WHERE t.id = :id ")
	void updateStatus(@Param("id") ID id,@Param("statusCode") Integer statusCode);
	
	T findByNameLike(String name);

}
