package by.ansgar.SaveCitationWeb.DAO;

import java.sql.SQLException;
import java.util.List;

import by.ansgar.SaveCitationWeb.entity.LinkBooksComments;

public interface LinkBooksCommentsDAO {

	public void addNewsCom(LinkBooksComments linkBooksComments) throws SQLException;

	public List<LinkBooksComments> getComent(long id) throws SQLException;

}
