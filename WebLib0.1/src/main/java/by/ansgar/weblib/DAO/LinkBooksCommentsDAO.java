package by.ansgar.weblib.DAO;

import java.sql.SQLException;
import java.util.List;

import by.ansgar.weblib.entity.LinkBooksComments;

public interface LinkBooksCommentsDAO {

	public void addBooksCom(LinkBooksComments linkBooksComments) throws SQLException;

	public List<LinkBooksComments> getComent(long id) throws SQLException;

}
