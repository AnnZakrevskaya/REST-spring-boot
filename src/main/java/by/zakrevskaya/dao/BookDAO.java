package by.zakrevskaya.dao;

import by.zakrevskaya.entity.Book;

import java.util.List;

public interface BookDAO {
    List<Book> getAll();
    Book getById(int id);
    Book create(Book book);
    Book update (int id, Book book);
    void delete(int id);
}
