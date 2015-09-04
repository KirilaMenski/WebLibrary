package by.ansgar.weblib.service;

import java.sql.SQLException;
import java.util.List;

import by.ansgar.weblib.entity.News;

public interface NewsService {
	
	public void addNews(News news) throws SQLException;
	
	public void editNews(News news) throws SQLException;
	
	public void deleteNews (News news) throws SQLException;
	
	public List<News> getAllNews () throws SQLException;
	
	public List<News> getAllNews (int page) throws SQLException;
	
	public News getNewsById (long id) throws SQLException;

}
