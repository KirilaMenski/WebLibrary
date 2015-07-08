package by.ansgar.weblib.DAO;

import java.sql.SQLException;
import java.util.List;

import by.ansgar.weblib.entity.LinkGenreBooks;

public interface LinkGenreBooksDAO {
	
	public void addGenreBooks (LinkGenreBooks linkGenreBooks) throws SQLException;
	
	public List<LinkGenreBooks> getGenreBooks (long id) throws SQLException;
	

}
