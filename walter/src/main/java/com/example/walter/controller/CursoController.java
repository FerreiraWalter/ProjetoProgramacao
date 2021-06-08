package com.example.walter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.walter.model.Curso;
import com.example.walter.repository.CursoRepository;

@RestController
@RequestMapping("/curso")
public class CursoController {

	@Autowired
	private CursoRepository cursoRepository;
	
	@GetMapping("/listar")
	public List<Curso> listarCursos() {
		return cursoRepository.findAll();
	}
	
	@PostMapping("/adicionar")
	public Curso adicionarCurso(@RequestBody Curso curso) {
		return cursoRepository.save(curso);
	}
	
	@DeleteMapping("/deletar")
	public void deletarCurso(@RequestBody Curso curso) {
		cursoRepository.delete(curso);
	}
	
	@PutMapping("/atualizar")
	public Curso atualizarCurso(@RequestBody Curso curso) {
		return cursoRepository.save(curso);
	}
}
