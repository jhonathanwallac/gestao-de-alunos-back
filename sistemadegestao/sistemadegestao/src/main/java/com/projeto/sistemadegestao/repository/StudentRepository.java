package com.projeto.sistemadegestao.repository;

import com.projeto.sistemadegestao.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
