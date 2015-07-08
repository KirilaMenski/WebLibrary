package by.ansgar.weblib.DAO;

import java.sql.SQLException;
import java.util.List;

import by.ansgar.weblib.entity.LinkAuthorsBooks;

public interface LinkAuthorsBooksDAO {
	
	public void addAuthorsBooks(LinkAuthorsBooks linkAuthosBooks)
			throws SQLException;
	
	public List<LinkAuthorsBooks> getAuthor(long id) throws SQLException;

	public List<LinkAuthorsBooks> getAuthorsBooks(long id) throws SQLException;
	
	public List<LinkAuthorsBooks> getAuthorsBooks(String name) throws SQLException;
}
