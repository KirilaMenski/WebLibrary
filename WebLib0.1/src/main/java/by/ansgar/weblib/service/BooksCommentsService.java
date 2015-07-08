package by.ansgar.weblib.service;

import java.sql.SQLException;
import java.util.List;

import by.ansgar.weblib.entity.BooksComments;

public interface BooksCommentsService {
	public void addComments(BooksComments booksComments) throws SQLException;

	public BooksComments getCommentsById(long id) throws SQLException;

	public List<BooksComments> booksComments() throws SQLException;
}
