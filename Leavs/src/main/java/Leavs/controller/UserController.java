package Leavs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Leavs.entity.User;
import Leavs.repository.UserRepository;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	private UserRepository userRepo;
	
	@PostMapping("/addUser")
	public ResponseEntity<User> addUser(@RequestBody User user)
	{
		User savedUser = userRepo.save(user);
		return new ResponseEntity<>(savedUser,HttpStatus.CREATED);
	}
	
	@GetMapping("/getUser")
	public ResponseEntity<List<User>> getAllUser()
	{
		List<User> user = (List<User>) userRepo.findAll();
		return new ResponseEntity<>(user,HttpStatus.OK);
		
	}
	
	
	
	
}
