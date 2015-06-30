package by.ansgar.SaveCitationWeb.service;

import java.sql.SQLException;
import java.util.List;

import by.ansgar.SaveCitationWeb.entity.LinkAuthorsBooks;

public interface LinkAuthorsBooksService {
	public void addAuthorsBooks(LinkAuthorsBooks linkAuthosBooks)
			throws SQLException;

	public List<LinkAuthorsBooks> getAuthorsBooks(long id) throws SQLException;
}
