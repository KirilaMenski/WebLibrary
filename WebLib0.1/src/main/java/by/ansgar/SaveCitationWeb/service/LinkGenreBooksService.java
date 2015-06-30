package by.ansgar.SaveCitationWeb.service;

import java.sql.SQLException;
import java.util.List;

import by.ansgar.SaveCitationWeb.entity.LinkGenreBooks;

public interface LinkGenreBooksService {

	public void addGenreBooks(LinkGenreBooks linkGenreBooks)
			throws SQLException;

	public List<LinkGenreBooks> getGenreBooks(long id) throws SQLException;
}
