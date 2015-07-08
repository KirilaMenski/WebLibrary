package by.ansgar.weblib.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import by.ansgar.weblib.DAO.GenreDAO;
import by.ansgar.weblib.entity.Genre;

@Service
public class GenreServiceImpl implements GenreService{

	@Autowired
	private GenreDAO genreDAO;
	
	@Transactional
	public void addGenre(Genre genre) throws SQLException {
		try{
			genreDAO.addGenre(genre);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	@Transactional
	public List<Genre> getAllGenre() throws SQLException {
		List<Genre> getAllGenre = new ArrayList<Genre>();
		try{
			getAllGenre = genreDAO.getAllGenre();
		}catch(Exception e){
			e.printStackTrace();
		}
		return getAllGenre;
	}

	@Transactional
	public Genre getGenreById(long id) throws SQLException {
		return genreDAO.getGenreById(id);
	}

}
