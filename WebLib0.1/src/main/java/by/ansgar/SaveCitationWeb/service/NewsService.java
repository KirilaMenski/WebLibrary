package by.ansgar.SaveCitationWeb.service;

import java.sql.SQLException;
import java.util.List;

import by.ansgar.SaveCitationWeb.entity.News;

public interface NewsService {
	
	public void addNews(News news) throws SQLException;
	
	public List<News> getAllNews () throws SQLException;
	
	public News getNewsById (int id) throws SQLException;

}
