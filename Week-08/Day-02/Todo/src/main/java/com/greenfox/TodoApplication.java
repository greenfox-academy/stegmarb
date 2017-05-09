package com.greenfox;

import com.greenfox.model.ToDo;
import com.greenfox.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner{

  @Autowired
  TodoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new ToDo("I have to learn Object Relational Mapping"));
  }
}
