package com.Guvi.SpringTask1.SpringDataJpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Guvi.SpringTask1.SpringDataJpa.Entity.Books;

public interface BookRepo extends JpaRepository<Books, Integer>{

}
