package com.Guvi.SpringTask1.SpringDataJpa.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Guvi.SpringTask1.SpringDataJpa.Entity.Books;
import com.Guvi.SpringTask1.SpringDataJpa.Repository.BookRepo;

@Service
public class BookService {

@Autowired
private BookRepo bookRepo;

public String addBook(Books book){
    bookRepo.save(book);
    return "Book Feedback Saved";
}

public List<Books> allBooks(){
    return bookRepo.findAll();
}
}
