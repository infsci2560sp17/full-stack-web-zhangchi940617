/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.controllers;

import edu.infsci2560.models.Book;
import edu.infsci2560.repositories.BookRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class BooksController {
    @Autowired
    private BookRepository repository;
    
    @RequestMapping(value = "books", method = RequestMethod.GET)
    public ModelAndView index() {        
        return new ModelAndView("books", "books", repository.findAll());
    }
    
    @RequestMapping(value = "books/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid Book book, BindingResult result) {
        repository.save(book);
        return new ModelAndView("books", "books", repository.findAll());
    }

    //@RequestMapping(value = "books", method = RequestMethod.DELETE)
    @RequestMapping(value = "books/delete", method = RequestMethod.GET)
    public ModelAndView delete(@RequestParam(value="id", required=true) Long id) {
        // log.info("*** delete id = " + id);
        Book book = repository.findOne(id);
        
        if ( book != null ) {
           // log.info("*** recipe is not null");
            repository.delete(book);
        }

        return new ModelAndView("books", "books", repository.findOne(id));
    }
    
}
