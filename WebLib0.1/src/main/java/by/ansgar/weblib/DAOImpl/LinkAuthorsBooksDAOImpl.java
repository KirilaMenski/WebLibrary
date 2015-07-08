package by.ansgar.weblib.DAOImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import by.ansgar.weblib.DAO.LinkAuthorsBooksDAO;
import by.ansgar.weblib.entity.LinkAuthorsBooks;

@Repository
public class LinkAuthorsBooksDAOImpl implements LinkAuthorsBooksDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addAuthorsBooks(LinkAuthorsBooks linkAuthosBooks)
			throws SQLException {
		try {
			currentSession().save(linkAuthosBooks);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@SuppressWarnings("unchecked")
	public List<LinkAuthorsBooks> getAuthorsBooks(long id) throws SQLException {
		List<LinkAuthorsBooks> getAuthorsBooksById = new ArrayList<LinkAuthorsBooks>();
		try {
			getAuthorsBooksById = currentSession()
					.createQuery(
							"select b from LinkAuthorsBooks lab left outer join lab.books b left outer join lab.authors a"
									+ " where lab.books.id = lab.books"
									+ " and lab.authors = lab.authors.id"
									+ " and lab.authors.id = :id")
					.setParameter("id", id).list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return getAuthorsBooksById;
	}


	@SuppressWarnings("unchecked")
	public List<LinkAuthorsBooks> getAuthorsBooks(String name)
			throws SQLException {
		List<LinkAuthorsBooks> getAuthorsBooksByName = new ArrayList<LinkAuthorsBooks>();
		try {
			getAuthorsBooksByName = currentSession()
					.createQuery(
							"select b from LinkAuthorsBooks lab left outer join lab.books b left outer join lab.authors a"
									+ " where lab.books.id = lab.books"
									+ " and lab.authors = lab.authors.id"
									+ " and lab.books.firstName = :name")
					.setParameter("name", name).list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return getAuthorsBooksByName;
	}
	
	@SuppressWarnings("unchecked")
	public List<LinkAuthorsBooks> getAuthor(long id) throws SQLException {
		List<LinkAuthorsBooks> getAuthor = new ArrayList<LinkAuthorsBooks>();
		try {
			getAuthor = currentSession()
					.createQuery(
							"select a from LinkAuthorsBooks lab left outer join lab.authors a left outer join lab.books b"
									+ " where lab.authors.id = lab.authors"
									+ " and lab.books = lab.books.id"
									+ " and lab.books.id = :id")
					.setParameter("id", id).list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return getAuthor;
	}
	public Session currentSession() {
		Session currentSession = sessionFactory.getCurrentSession();
		return currentSession;
	}

	
}
