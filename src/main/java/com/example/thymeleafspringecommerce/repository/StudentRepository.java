package com.example.thymeleafspringecommerce.repository;

import com.example.thymeleafspringecommerce.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
