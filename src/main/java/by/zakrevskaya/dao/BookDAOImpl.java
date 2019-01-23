package by.zakrevskaya.dao;

import by.zakrevskaya.entity.Book;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class BookDAOImpl implements BookDAO{
    @PersistenceContext
    private EntityManager entityManager;

    public List<Book> getAll() {
        return entityManager.createQuery("from Book b order by b.id desc", Book.class).getResultList();
    }

    public Book getById(int id) {
        return entityManager.find(Book.class, id);
    }

    public Book create(Book book) {
        entityManager.persist(book);
        return book;
    }

    public Book update(int id, Book book) {
        Book original = entityManager.find(Book.class, id);
        book.setId(original.getId());
        entityManager.remove(original);
            entityManager.merge(book);
            entityManager.flush();
        return book;
    }

    public void delete(int id) {
        Book country = entityManager.find(Book.class, id);
        if (country != null) {
            entityManager.remove(country);
        }
    }
}
