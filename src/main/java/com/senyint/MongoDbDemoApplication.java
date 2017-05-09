package com.senyint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.senyint.pojo.User;
import com.senyint.repository.UserRepository;

@SpringBootApplication
public class MongoDbDemoApplication  implements CommandLineRunner{

	@Autowired	
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MongoDbDemoApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {

//		userRepository.delete(1L);
        userRepository.save(new User(1L, "didi", 30));
        userRepository.save(new User(2L, "mama", 40));
        userRepository.save(new User(3L, "kaka", 50));
		System.out.println(userRepository.findByUsername("didi").getAge());
	}
}
