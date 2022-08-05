package my.com.jenkins.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import my.com.jenkins.demo.model.*;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
	User findByUsrFirstNamess(String name);
}
