package by.ansgar.weblib.DAOImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import by.ansgar.weblib.DAO.BooksCommentsDAO;
import by.ansgar.weblib.entity.BooksComments;

@Repository
public class BooksCommentsDAOImpl implements BooksCommentsDAO{

	@Autowired
	private SessionFactory sessionFactory;

	public void addComments(BooksComments booksComments) throws SQLException {
		try{
			currentSession().save(booksComments);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	public BooksComments getCommentsById(long id) throws SQLException {
		BooksComments booksCommentsById = null;
		try{
			booksCommentsById = (BooksComments) currentSession().get(BooksComments.class, id);
		}catch(Exception e){
			e.printStackTrace();
		}
		return booksCommentsById;
	}

	public List<BooksComments> booksComments() throws SQLException {
		List<BooksComments> getBooksComments = new ArrayList<BooksComments>();
		try{
			getBooksComments = currentSession().createQuery("FROM BooksComments").list();
		}catch(Exception e){
			e.printStackTrace();
		}
		return getBooksComments;
	}
	
	public Session currentSession() {
		Session currentSession = sessionFactory.getCurrentSession();
		return currentSession;
	}
}
