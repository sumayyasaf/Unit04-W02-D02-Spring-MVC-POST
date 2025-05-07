package org.dci.mvcpost.Controller;

import org.dci.mvcpost.Repository.BookRepo;
import org.dci.mvcpost.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {
    private final BookRepo bookRepo;


    public BookController(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    @GetMapping("/books")
    public String getBooks(Model model) {
        model.addAttribute("books", bookRepo.getBooks());
        return "book-list";
    }
    @GetMapping("/books/new")
    public String ShowForm(Model model) {
        model.addAttribute("book", new Book());
        return "add-book-form";
    }
    @PostMapping("/books")
    public String AddBook(Book book) {
        bookRepo.getBooks().add(book); // adding the submitted book to the list
      return "redirect:/books";
    }

}
