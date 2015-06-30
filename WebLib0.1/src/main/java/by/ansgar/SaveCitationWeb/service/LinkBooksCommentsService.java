package by.ansgar.SaveCitationWeb.service;

import java.sql.SQLException;
import java.util.List;

import by.ansgar.SaveCitationWeb.entity.LinkBooksComments;

public interface LinkBooksCommentsService {

	public void addNewsCom(LinkBooksComments linkBooksComments)
			throws SQLException;

	public List<LinkBooksComments> getComent(long id) throws SQLException;
}
