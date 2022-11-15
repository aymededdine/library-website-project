package library.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import library.base.repository.BaseRepo;
import library.entity.Seller;

@Repository
public interface SellerRepo extends BaseRepo<Seller, Long>{

	

}
