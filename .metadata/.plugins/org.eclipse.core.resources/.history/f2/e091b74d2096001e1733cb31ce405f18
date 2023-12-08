package com.alessandrozaros.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alessandrozaros.course.entity.User;

@RestController   //Esta anotation é para dizer que esta classe é um recurso web implementado por um controlador rest

@RequestMapping(value = "/users")   //
public class UserResource {
	
	//end point para acessar os usuarios
	
	@GetMapping //para indicar q este método responte a uma requisição do tipo get do http
	public ResponseEntity<User> findAll(){
		//como o id é do tipo long é necessário colocar a letra L após o numero 1
		User u = new User(1L,"ALessandro","alessandro@gmail.com", "988533344", "1234567");
		return ResponseEntity.ok().body(u);
		}
}
