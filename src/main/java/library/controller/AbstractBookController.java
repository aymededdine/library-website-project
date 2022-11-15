package library.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import library.dto.AbstractBookDto;
import library.dto.BookDto;
import library.entity.AbstractBook;
import library.entity.Book;
import library.mapper.AbstractBookMapper;
import library.mapper.BookMapper;
import library.service.AbstractBookService;

@RestController
@RequestMapping("/api/v1/a-books")
public class AbstractBookController {
	
	@Autowired
	private AbstractBookService aBookServ;
	
	@Autowired
	private AbstractBookMapper bookMapper;
	
	@GetMapping("")
	public ResponseEntity<?> findAll(){
		List<AbstractBookDto> dtos = bookMapper.map(aBookServ.findAll());
		return ResponseEntity.ok(dtos);
	}
	
	@PostMapping("/insert")
	public ResponseEntity<?> insert(@RequestBody  AbstractBook book){
		return ResponseEntity.ok(aBookServ.insert(book));
	}
	
//	@PostMapping("/photos")
//	public ResponseEntity<Object> uploadPhoto(){
//		return ResponseEntity.ok(null);
//	}
	

}
