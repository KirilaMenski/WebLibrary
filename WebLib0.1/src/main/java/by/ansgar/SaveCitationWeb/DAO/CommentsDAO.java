package by.ansgar.SaveCitationWeb.DAO;

import java.sql.SQLException;
import java.util.List;

import by.ansgar.SaveCitationWeb.entity.NewsComments;

public interface CommentsDAO {
	
	public void addComments (NewsComments comments) throws SQLException;
	
	public NewsComments getCommentsById(long id) throws SQLException;
	
	public List<NewsComments> commentsList () throws SQLException;

}