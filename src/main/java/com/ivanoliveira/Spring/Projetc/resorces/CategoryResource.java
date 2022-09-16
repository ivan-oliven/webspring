package com.ivanoliveira.Spring.Projetc.resorces;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ivanoliveira.Spring.Projetc.entites.Category;
import com.ivanoliveira.Spring.Projetc.repositories.CategoryRepository;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryRepository categoryResitory ;

	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List <Category> list = categoryResitory.findAll();
		
		return ResponseEntity.ok().body(list);
	}


	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id) {
		Category cat = categoryResitory.findById(id); 
		return ResponseEntity.ok().body(cat);
	} }