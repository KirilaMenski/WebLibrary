package by.ansgar.weblib.DAO;

import java.sql.SQLException;
import java.util.List;

import by.ansgar.weblib.entity.News;

public interface NewsDAO {

	public void addNews(News news) throws SQLException;

	public void updateNews(News news) throws SQLException;

	public List<News> getAllNews() throws SQLException;

	public void deleteNews(News news) throws SQLException;
	
	public News getNewsById(long id) throws SQLException;

}
