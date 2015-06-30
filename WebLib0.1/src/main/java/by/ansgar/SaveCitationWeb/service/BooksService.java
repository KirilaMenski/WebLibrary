package by.ansgar.SaveCitationWeb.service;

import java.sql.SQLException;
import java.util.List;

import by.ansgar.SaveCitationWeb.entity.Books;

public interface BooksService {
	public void addBooks(Books books) throws SQLException;

	public void editBooks(Books books) throws SQLException;

	public List<Books> getAllBooks() throws SQLException;

	public Books getBooksById(long id) throws SQLException;

}
