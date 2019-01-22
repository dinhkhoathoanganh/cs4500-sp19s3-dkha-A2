package cs4500.A2.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import cs4500.A2.models.User;

@RestController
public class UserService {
	static List<User> users = new ArrayList();
	static {
		users.add(new User(1, "alice", "alice", "Alice", "Wonderland"));
		users.add(new User(2, "bob", "bob", "Bob", "Marley"));
	}

	@GetMapping("/api/user")
	public List<User> findAllUsers() {
		return users;
	}
	

}