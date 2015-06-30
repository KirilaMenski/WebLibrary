package by.ansgar.SaveCitationWeb.DAO;

import java.sql.SQLException;
import java.util.List;

import by.ansgar.SaveCitationWeb.entity.Authors;

public interface AuthorsDAO {
	
	public void addAuthor (Authors authors) throws SQLException;
	
	public void editAuthor (Authors authors) throws SQLException;
	
	public List<Authors> getAllAuthors () throws SQLException;
	
	public Authors getAuthorsById (long id) throws SQLException;

}
