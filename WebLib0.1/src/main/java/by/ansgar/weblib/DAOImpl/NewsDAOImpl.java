package by.ansgar.weblib.DAOImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import by.ansgar.weblib.DAO.NewsDAO;
import by.ansgar.weblib.entity.News;

@Repository
public class NewsDAOImpl implements NewsDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void addNews(News news) throws SQLException {

		try {
			currentSession().save(news);
		} catch (Exception e) {
			e.printStackTrace();
		} 

	}

	public void updateNews(News news) throws SQLException {

		try {
			currentSession().update(news);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@SuppressWarnings("unchecked")
	public List<News> getAllNews() throws SQLException {
		List<News> allNews = new ArrayList<News>();
		try {
			allNews = currentSession().createQuery("FROM News").list();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return allNews;
	}

	public void deleteNews(News news) throws SQLException {

		try {
			currentSession().delete(news);
		} catch (Exception e) {
			e.printStackTrace();
		} 

	}

	public News getNewsById(long id) throws SQLException {
		
		News newsById = null;
		
		try{
			newsById = (News) currentSession().get(News.class, id);
		}catch(Exception e){
			e.printStackTrace();
		}
		return newsById;
		
	}

	public Session currentSession(){
		Session currentSession = sessionFactory.getCurrentSession();
		return currentSession;
	}
}
