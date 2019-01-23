package by.zakrevskaya.service;

import by.zakrevskaya.dao.BookDAO;
import by.zakrevskaya.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDAO bookDAO;

    @Override
    public List<Book> findAll(){  return bookDAO.getAll(); }

    @Override
    public Book findById(int id) { return bookDAO.getById(id); }

    @Override
    public Book save(Book book) { return bookDAO.create(book); }

    @Override
    public Book update(int id, Book book){ return bookDAO.update(id, book);}

    @Override
    public void delete(int id) {
        bookDAO.delete(id);
    }
}
