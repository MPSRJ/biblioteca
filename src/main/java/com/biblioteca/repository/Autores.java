package com.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.model.Autor;

public interface Autores extends JpaRepository<Autor, Long>{

}
