package com.example.walter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.walter.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {

}
