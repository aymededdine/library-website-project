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

import library.dto.BookDto;
import library.entity.Book;
import library.mapper.BookMapper;
import library.service.BookService;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {
	
	@Autowired
	private BookService bookServ;
	
	@Autowired
	private BookMapper bookMapper;
	
	@GetMapping("")
	public ResponseEntity<?> findAll(){
		List<BookDto> dtos = bookMapper.map(bookServ.findAll());
		return ResponseEntity.ok(dtos);
	}
	
	@PostMapping("/insert")
	public ResponseEntity<?> insert(@RequestBody @Valid Book book){
		return ResponseEntity.ok(bookServ.insert(book));
	}
	
	

}
