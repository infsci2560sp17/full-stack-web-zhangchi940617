package edu.infsci2560.controllers;

import edu.infsci2560.models.Book;
import edu.infsci2560.repositories.BookRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class BookEditController {
    @Autowired
    private BookRepository repository;
    
    @RequestMapping(value = "books/edit/{id}", method = RequestMethod.GET)
    public ModelAndView index(@PathVariable Long id) { 
        Book book = repository.findOne(id);
        return new ModelAndView("bookEdit", "book", book);
    }
    
    @RequestMapping(value = "books/edit/{id}", method = RequestMethod.PUT, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public String update( @Valid Book book, BindingResult result) {
        repository.save(book);
        return "redirect:/books";
    }        
}