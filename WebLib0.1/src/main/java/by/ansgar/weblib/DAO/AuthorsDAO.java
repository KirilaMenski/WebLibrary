package by.ansgar.weblib.DAO;

import java.sql.SQLException;
import java.util.List;

import by.ansgar.weblib.entity.Authors;

public interface AuthorsDAO {
	
	public void addAuthor (Authors authors) throws SQLException;
	
	public void editAuthor (Authors authors) throws SQLException;
	
	public List<Authors> getAllAuthors () throws SQLException;
	
	public Authors getAuthor (long id) throws SQLException;
	
	public Authors getAuthor(String name) throws SQLException;

}
