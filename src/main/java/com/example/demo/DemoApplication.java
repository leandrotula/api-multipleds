package com.example.demo;

import com.example.demo.relational.mysql.model.Student;
import com.example.demo.relational.mysql.repository.StudentRepository;
import com.example.demo.relational.postgres.model.Graduated;
import com.example.demo.relational.postgres.repository.GraduatedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private GraduatedRepository graduatedRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Iterable<Student> students =studentRepository.findAll();

		StreamSupport.stream(students.spliterator(), false).map(Student::getLastName).forEach(System.out::println);

		Iterable<Graduated> graduateds = graduatedRepository.findAll();

		StreamSupport.stream(graduateds.spliterator(), false).map(Graduated::getUser).forEach(System.out::println);
	}
}
