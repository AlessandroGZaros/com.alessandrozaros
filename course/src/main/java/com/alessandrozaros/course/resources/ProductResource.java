package com.alessandrozaros.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alessandrozaros.course.entity.Product;
import com.alessandrozaros.course.services.ProductService;

@RestController   //Esta anotation é para dizer que esta classe é um recurso web implementado por um controlador rest

@RequestMapping(value = "/products")   //
public class ProductResource {
	
	@Autowired
	private ProductService service;
	
	@GetMapping //para indicar q este método responte a uma requisição do tipo get do http
	public ResponseEntity<List<Product>> findAll(){
		List<Product> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
