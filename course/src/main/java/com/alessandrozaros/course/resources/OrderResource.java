package com.alessandrozaros.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alessandrozaros.course.entity.Order;
import com.alessandrozaros.course.services.OrderService;

@RestController   //Esta anotation é para dizer que esta classe é um recurso web implementado por um controlador rest

@RequestMapping(value = "/orders")   //
public class OrderResource {
	
	@Autowired
	private OrderService service;
	
	@GetMapping //para indicar q este método responte a uma requisição do tipo get do http
	public ResponseEntity<List<Order>> findAll(){
		List<Order> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
