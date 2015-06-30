package by.ansgar.SaveCitationWeb.DAOImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import by.ansgar.SaveCitationWeb.DAO.GenreDAO;
import by.ansgar.SaveCitationWeb.entity.Genre;

@Repository
public class GenreDAOImpl  implements GenreDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addGenre(Genre genre) throws SQLException {
		try{
			currentSession().save(genre);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	public List<Genre> getAllGenre() throws SQLException {
		List<Genre> getGenre = new ArrayList<Genre>();
		try{
			getGenre = currentSession().createQuery("FROM Genre").list();
		}catch(Exception e){
			e.printStackTrace();
		}
		return getGenre;
	}

	public Genre getGenreById(long id) throws SQLException {
		Genre genreById = null;
		try{
			genreById = (Genre) currentSession().get(Genre.class, id);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return genreById;
	}
	
	public Session currentSession(){
		Session currentSession = sessionFactory.getCurrentSession();
		return currentSession;
	}

}
