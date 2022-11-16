package com.example.thymeleafspringecommerce;

import com.example.thymeleafspringecommerce.models.Student;
import com.example.thymeleafspringecommerce.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThymeleafSpringEcommerceApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(ThymeleafSpringEcommerceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	/*	Student student1 = new Student("John", "Johnny","john@gmail.com");
		studentRepository.save(student1);
		Student student2 = new Student("Mike", "Mickey","mikegmail.com");
		studentRepository.save(student2);
		Student student3 = new Student("Len", "lenny","len@gmail.com");
		studentRepository.save(student3);*/

	}
}
