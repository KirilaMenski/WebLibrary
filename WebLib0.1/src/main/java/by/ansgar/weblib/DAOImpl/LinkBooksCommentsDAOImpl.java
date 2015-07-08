package by.ansgar.weblib.DAOImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import by.ansgar.weblib.DAO.LinkBooksCommentsDAO;
import by.ansgar.weblib.entity.LinkBooksComments;

@Repository
public class LinkBooksCommentsDAOImpl implements LinkBooksCommentsDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addBooksCom(LinkBooksComments linkBooksComments)
			throws SQLException {
		try {
			currentSession().save(linkBooksComments);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@SuppressWarnings("unchecked")
	public List<LinkBooksComments> getComent(long id) throws SQLException {
		List<LinkBooksComments> getBooksCommentsById = new ArrayList<LinkBooksComments>();
		try {

			getBooksCommentsById = currentSession()
					.createQuery(
							"select bc from LinkBooksComments lbc left outer join lbc.booksCom bc left outer join lbc.books b"
									+ " where lbc.booksCom.id = lbc.booksCom"
									+ " and lbc.books = lbc.books.id"
									+ " and lbc.books.id = :id")
					.setParameter("id", id).list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return getBooksCommentsById;
	}

	public Session currentSession() {
		Session currentSession = sessionFactory.getCurrentSession();
		return currentSession;
	}
}
