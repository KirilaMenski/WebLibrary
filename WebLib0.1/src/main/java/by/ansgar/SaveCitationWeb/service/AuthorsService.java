package by.ansgar.SaveCitationWeb.service;

import java.sql.SQLException;
import java.util.List;

import by.ansgar.SaveCitationWeb.entity.Authors;

public interface AuthorsService {
public void addAuthor (Authors authors) throws SQLException;
	
	public void editAuthor (Authors authors) throws SQLException;
	
	public List<Authors> getAllAuthors () throws SQLException;
	
	public Authors getAuthorsById (long id) throws SQLException;
}
