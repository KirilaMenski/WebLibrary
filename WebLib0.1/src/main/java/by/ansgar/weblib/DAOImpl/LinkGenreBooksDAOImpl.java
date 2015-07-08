package by.ansgar.weblib.DAOImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import by.ansgar.weblib.DAO.LinkGenreBooksDAO;
import by.ansgar.weblib.entity.LinkGenreBooks;

@Repository
public class LinkGenreBooksDAOImpl implements LinkGenreBooksDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addGenreBooks(LinkGenreBooks linkGenreBooks)
			throws SQLException {
		try{
			currentSession().save(linkGenreBooks);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public List<LinkGenreBooks> getGenreBooks(long id) throws SQLException {
		List<LinkGenreBooks> getGenreBooksById = new ArrayList<LinkGenreBooks>();
		try{
			getGenreBooksById = currentSession()
					.createQuery(
							"select b from LinkGenreBooks lgb left outer join lgb.books b left outer join lgb.genre g"
									+ " where lgb.books.id = lgb.books"
									+ " and lgb.genre = lgb.genre.id"
									+ " and lgb.genre.id = :id")
					.setParameter("id", id).list();
		}catch(Exception e){
			e.printStackTrace();
		}
		return getGenreBooksById;
	}
	
	public Session currentSession() {
		Session currentSession = sessionFactory.getCurrentSession();
		return currentSession;
	}
}
