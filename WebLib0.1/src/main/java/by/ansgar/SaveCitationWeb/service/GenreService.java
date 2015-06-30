package by.ansgar.SaveCitationWeb.service;

import java.sql.SQLException;
import java.util.List;

import by.ansgar.SaveCitationWeb.entity.Genre;

public interface GenreService {
	public void addGenre(Genre genre) throws SQLException;

	public List<Genre> getAllGenre() throws SQLException;

	public Genre getGenreById(long id) throws SQLException;
}
