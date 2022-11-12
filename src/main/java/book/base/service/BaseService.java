package book.base.service;

import java.util.List;

import javax.persistence.MappedSuperclass;

import org.springframework.beans.factory.annotation.Autowired;

import book.base.entity.BaseEntity;
import book.base.repository.BaseRepo;

@MappedSuperclass
public abstract class BaseService<T extends BaseEntity, ID> {

	@Autowired
	private BaseRepo<T, ID> baseRepo;
	
	public List<T> findAll(){
		return baseRepo.findAll();
	}
	
	public T findById(ID id) {
		return baseRepo.findById(id).orElse(null);
	}
	
	public T findByNameLike(String name) {
		return baseRepo.findByNameLike(name);
	}
	
	public T getReferenceById(ID id) {
		return baseRepo.getReferenceById(id);
	}
	
	public T insert(T entity) {
		return baseRepo.save(entity);
	}
	
	public T persist(T entity) {
		return baseRepo.saveAndFlush(entity);
	}
	
	public T update(T entity) {
		return baseRepo.save(entity);
	}
	
	public void deleteById(ID id) {
		baseRepo.deleteById(id);
	}
	
	public void deleteAill(List<ID> ids) {
		ids.forEach(id -> {
			baseRepo.deleteById(id);
		});
	}
	

	
}
