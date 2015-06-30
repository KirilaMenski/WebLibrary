package by.ansgar.SaveCitationWeb.DAOImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import by.ansgar.SaveCitationWeb.DAO.LinkAuthorsBooksDAO;
import by.ansgar.SaveCitationWeb.entity.LinkAuthorsBooks;

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

	public Session currentSession() {
		Session currentSession = sessionFactory.getCurrentSession();
		return currentSession;
	}
}
