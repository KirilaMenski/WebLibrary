package by.ansgar.SaveCitationWeb.DAOImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import by.ansgar.SaveCitationWeb.DAO.BooksDAO;
import by.ansgar.SaveCitationWeb.entity.Books;

@Repository
public class BooksDAOImpl implements BooksDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void addBooks(Books books) throws SQLException {
		try{
			currentSession().save(books);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	public void editBooks(Books books) throws SQLException {
		try{
			currentSession().update(books);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	public List<Books> getAllBooks() throws SQLException {
		List<Books> getBooks = new ArrayList<Books>();
		try{
			getBooks = currentSession().createQuery("FROM Books").list();
		}catch(Exception e){
			e.printStackTrace();
		}
		return getBooks;
	}

	public Books getBooksById(long id) throws SQLException {
		Books booksById = null;
		try{
			booksById = (Books) currentSession().get(Books.class, id);
		}catch(Exception e){
			e.printStackTrace();
		}
		return booksById;
	}
	
	public Session currentSession() {
		Session currentSession = sessionFactory.getCurrentSession();
		return currentSession;
	}

}
