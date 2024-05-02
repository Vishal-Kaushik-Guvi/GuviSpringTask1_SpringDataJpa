package com.Guvi.SpringTask1.SpringDataJpa.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Guvi.SpringTask1.SpringDataJpa.Entity.Books;
import com.Guvi.SpringTask1.SpringDataJpa.Service.BookService;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/book")
    public String addBookPage(){
        return "book";
    }

    @PostMapping("/booksinfo")
    public String addBookDetails(@ModelAttribute Books book) {
        bookService.addBook(book);
        return "booksinfo";
    }

    @GetMapping("/booksinfo")
    public String allBooksDetails(Model model) {
        List<Books> books = bookService.allBooks();
        model.addAttribute("books", books);
        return "booksinfo";
    }
}
