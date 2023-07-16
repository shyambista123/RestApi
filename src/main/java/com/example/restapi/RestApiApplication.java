package com.example.restapi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
	}

// posting/adding a sample data
		@Bean
		CommandLineRunner commandLineRunner(PostRepository postRepository){
			return args -> {
				Post post = new Post();
				post.setId(1);
				post.setContent("this is content");
				post.setTitle("this is title");
				post.setDateCreated(null);
				postRepository.save(post);
			};
		}
}
