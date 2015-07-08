package by.ansgar.weblib.DAO;

import java.sql.SQLException;
import java.util.List;

import by.ansgar.weblib.entity.Genre;

public interface GenreDAO {
	
	public void addGenre(Genre genre) throws SQLException;
	
	public List<Genre> getAllGenre () throws SQLException;
	
	public Genre getGenreById(long id) throws SQLException;

}
