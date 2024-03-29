package br.com.ferruje.desafiouolbackendspirng.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ferruje.desafiouolbackendspirng.entities.User;
import br.com.ferruje.desafiouolbackendspirng.entities.DTOs.UserDTO;
import br.com.ferruje.desafiouolbackendspirng.services.UserService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "http://localhost:8081")
public class UserResouce {

    @Autowired
    UserService service_user;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok( service_user.findAll() );
    }
    

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> criarUsuario(@RequestBody UserDTO entity) throws Exception {
            
        return ResponseEntity.ok( service_user.createUser(entity) );
    }
    

    // @GetMapping
    // public ResponseEntity<String> getHello() {
    //     return ResponseEntity.ok("Hello World");
    // }
    
}
