package com.wyrzel.libraryVol2.controller;

import com.wyrzel.libraryVol2.entity.Book;
import com.wyrzel.libraryVol2.service.BookServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
public class BookRestController {

    @Autowired
    private BookServiceImp bookService;

    @RequestMapping(path = "/RestBooks", method = RequestMethod.GET)
    public List<Book> findAllBooks() {
        return bookService.findAll();
    }
}
