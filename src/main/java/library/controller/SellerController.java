package library.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import library.entity.Book;
import library.entity.Seller;
import library.service.SellerService;

@Validated
@RestController
@RequestMapping("/api/v1/sellers")
public class SellerController {
	
	@Autowired
	SellerService sellerServ;
	
	@PostMapping("/insert")
	public ResponseEntity<?> insert(@RequestBody @Valid Seller seller){
		return ResponseEntity.ok(sellerServ.insert(seller));
	}

}
