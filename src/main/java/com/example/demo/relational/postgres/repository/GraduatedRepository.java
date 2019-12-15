package com.example.demo.relational.postgres.repository;

import com.example.demo.relational.postgres.model.Graduated;
import org.springframework.data.repository.CrudRepository;

public interface GraduatedRepository extends CrudRepository<Graduated, Long> {
}
