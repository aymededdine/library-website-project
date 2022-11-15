package library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import library.service.FileUploadService;


@RestController
@RequestMapping("/file")
public class FileUploadController {
	
	@Autowired
	private FileUploadService fileUploadServ;
	
	@PostMapping("/upload")
	public ResponseEntity<Object> uploadPhoto(@RequestParam Long id,
			@RequestParam String pathType, @RequestParam MultipartFile file){
		String fileName = fileUploadServ.storeFile(fileUploadServ.convertMultiPartFileToFile(file), id, pathType);
		return ResponseEntity.ok(fileName);
	}

}
