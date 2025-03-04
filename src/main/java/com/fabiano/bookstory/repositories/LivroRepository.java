package com.fabiano.bookstory.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fabiano.bookstory.domain.Livro;

@Repository
public interface  LivroRepository extends JpaRepository<Livro, Integer> {

}
