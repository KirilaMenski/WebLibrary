package by.ansgar.SaveCitationWeb.DAOImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import by.ansgar.SaveCitationWeb.DAO.CommentsDAO;
import by.ansgar.SaveCitationWeb.entity.NewsComments;

@Repository
public class CommentsDAOImpl implements CommentsDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addComments(NewsComments comments) throws SQLException{
		try {
			currentSession().save(comments);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<NewsComments> commentsList() throws SQLException{
		List<NewsComments> getComments = new ArrayList<NewsComments>();
		
		try{
			getComments = currentSession().createQuery("FROM NewsComments").list();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return getComments;
	}

	public NewsComments getCommentsById(long id) throws SQLException {
		
		NewsComments newsComments = null;
		try{
			newsComments = (NewsComments) currentSession().get(NewsComments.class, id);
		}catch(Exception e){
			e.printStackTrace();
		}
		return newsComments;
	}

	public Session currentSession() {
		Session currentSession = sessionFactory.getCurrentSession();
		return currentSession;
	}


}