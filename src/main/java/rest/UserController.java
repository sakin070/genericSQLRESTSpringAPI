package rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    @PostMapping("/addUser")
    public ResponseEntity<Object> addUser(@RequestBody User user){
        System.out.println(user);
        User savedUser = userRepository.save(user);;
        System.out.println(savedUser);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getUsername()).toUri();
        return ResponseEntity.created(location).build();
    }

    @GetMapping("/addUser/{userName}/{password}/{firstName}/{lastName}/{sex}/{email}/{dateOfBirth}")
    public ResponseEntity<Object> addUser(@PathVariable String userName, @PathVariable String password,@PathVariable String firstName, @PathVariable String lastName, @PathVariable String sex, @PathVariable String email, @PathVariable String dateOfBirth){
        User savedUser = new User(userName, password,firstName,lastName,sex,email,dateOfBirth);
        savedUser = userRepository.save(savedUser);
        System.out.println(savedUser);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getUsername()).toUri();
        System.out.println(location);
        return ResponseEntity.created(location).build();
    }

}
