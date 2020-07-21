package com.nakangzi.service;

import com.nakangzi.pojo.Books;

import java.util.List;

public interface BookService {
    int addBook(Books book);

    int deleteBookById(int id);

    int updateBook(Books book);

    Books queryBookById(int id);

    List<Books>queryAllBooks();
}
