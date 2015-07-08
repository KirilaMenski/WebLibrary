package by.ansgar.weblib.DAOImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import by.ansgar.weblib.DAO.AuthorsDAO;
import by.ansgar.weblib.entity.Authors;

@Repository
public class AuthorsDAOImpl implements AuthorsDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addAuthor(Authors authors) throws SQLException {
		try {
			currentSession().save(authors);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void editAuthor(Authors authors) throws SQLException {
		try {
			currentSession().update(authors);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public List<Authors> getAllAuthors() throws SQLException {
		List<Authors> getAuthors = new ArrayList<Authors>();
		try {
			getAuthors = currentSession().createQuery("FROM Authors").list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return getAuthors;
	}

	public Authors getAuthor(long id) throws SQLException {
		Authors authorsById = null;
		try {
			authorsById = (Authors) currentSession().get(Authors.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return authorsById;
	}

	public Authors getAuthor(String name) throws SQLException {
		Authors authorsByName = null;
		try {
			authorsByName = (Authors) currentSession().get(Authors.class, name);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return authorsByName;
	}

	public Session currentSession() {
		Session currentSession = sessionFactory.getCurrentSession();
		return currentSession;
	}

}
