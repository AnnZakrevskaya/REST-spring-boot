package by.zakrevskaya.service;

import by.zakrevskaya.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();
    Book findById(int id);
    Book save(Book book);
    Book update (int id, Book book);
    void delete(int id);

}
