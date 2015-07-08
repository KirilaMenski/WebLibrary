package by.ansgar.weblib.DAOImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import by.ansgar.weblib.DAO.LinkNewsCommentsDAO;
import by.ansgar.weblib.entity.LinkNewsCom;

@Repository
public class LinkNewsCommentsDAOImpl implements LinkNewsCommentsDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addNewsCom(LinkNewsCom newsCom) throws SQLException {
		try {
			currentSession().save(newsCom);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public List<LinkNewsCom> getAllComent(long id) throws SQLException {

		List<LinkNewsCom> newsComList = new ArrayList<LinkNewsCom>();
		try {

			// newsComList =
			// currentSession().createQuery("From NewsComments").list();

			newsComList = currentSession()
					.createQuery(
							"select nc from LinkNewsCom lnk left outer join lnk.newsCom nc left outer join lnk.news n"
									+ " where lnk.newsCom.id = lnk.newsCom"
									+ " and lnk.news = lnk.news.id"
									+ " and lnk.news.id = :id")
					.setParameter("id", id).list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return newsComList;
	}

	public Session currentSession() {
		Session currentSession = sessionFactory.getCurrentSession();
		return currentSession;
	}

}
