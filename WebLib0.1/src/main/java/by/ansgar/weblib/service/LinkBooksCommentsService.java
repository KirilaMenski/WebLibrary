package by.ansgar.weblib.service;

import java.sql.SQLException;
import java.util.List;

import by.ansgar.weblib.entity.LinkBooksComments;

public interface LinkBooksCommentsService {

	public void addBooksCom(LinkBooksComments linkBooksComments)
			throws SQLException;

	public List<LinkBooksComments> getComent(long id) throws SQLException;
}
