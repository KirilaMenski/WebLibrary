package by.ansgar.weblib.service;

import java.sql.SQLException;
import java.util.List;

import by.ansgar.weblib.entity.LinkAuthorsBooks;

public interface LinkAuthorsBooksService {
	
	public void addAuthorsBooks(LinkAuthorsBooks linkAuthosBooks)
			throws SQLException;

	public List<LinkAuthorsBooks> getAuthorsBooks(long id) throws SQLException;
	
	public List<LinkAuthorsBooks> getAuthor(long id) throws SQLException;
}
