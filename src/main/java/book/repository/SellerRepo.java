package book.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import book.base.repository.BaseRepo;
import book.entity.Seller;

@Repository
public interface SellerRepo extends BaseRepo<Seller, String>{

	

}
