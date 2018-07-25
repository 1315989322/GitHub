package com.example.controller;

import com.example.service.BookService;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;

@Controller
public class BookController {

    @Resource
    private BookService bookService;


}
