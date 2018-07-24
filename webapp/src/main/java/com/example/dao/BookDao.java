package com.example.dao;

import com.example.entity.Book;

import java.util.List;

public interface BookDao {

    List<Book> findBookByAuthor(String gid);

}
