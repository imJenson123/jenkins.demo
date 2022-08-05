package my.com.jenkins.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.com.jenkins.demo.model.User;
import my.com.jenkins.demo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	
	public List<User> getUserList() {
		return (List<User>)repository.findAll();
	}
	
	public Optional<User> getUserById(Integer id) {
		return repository.findById(id);
	}
	
	public User getUserByName(String name) {
		return repository.findByUsrFirstNamess(name);
	}
}
