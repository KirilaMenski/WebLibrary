package by.ansgar.SaveCitationWeb.service;

import java.sql.SQLException;
import java.util.List;

import by.ansgar.SaveCitationWeb.entity.NewsComments;

public interface NewsCommentsService {
	
	public void addComments(NewsComments comments) throws SQLException;

	public NewsComments getCommentById (long id) throws SQLException;
	
	public List<NewsComments> commentsList() throws SQLException;
}