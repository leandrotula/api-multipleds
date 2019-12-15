package com.example.demo.relational.mysql.repository;

import com.example.demo.relational.mysql.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
