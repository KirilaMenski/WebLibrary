package by.ansgar.SaveCitationWeb.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import by.ansgar.SaveCitationWeb.DAO.NewsDAO;
import by.ansgar.SaveCitationWeb.entity.News;
import by.ansgar.SaveCitationWeb.util.DateCalendar;

@Service
public class NewsServiceImpl implements NewsService {

	@Autowired
	// @Qualifier("newsDAO")
	private NewsDAO newsDAO;

	@Transactional
	public void addNews(News news) throws SQLException {
		news.setDate(DateCalendar.hour + ":" + DateCalendar.min + " "
				+ DateCalendar.day + "." + DateCalendar.month + "."
				+ DateCalendar.year);
		try {
			newsDAO.addNews(news);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Transactional
	public List<News> getAllNews() throws SQLException {
		List<News> newsList = new ArrayList<News>();
		try {
			newsList = newsDAO.getAllNews();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return newsList;
	}

	@Transactional
	public News getNewsById(long id) throws SQLException {
		return newsDAO.getNewsById(id);
	}

	@Transactional
	public void editNews(News news) throws SQLException {
		try {
			news.setDate(DateCalendar.hour + ":" + DateCalendar.min + " "
					+ DateCalendar.day + "." + DateCalendar.month + "."
					+ DateCalendar.year);
			newsDAO.updateNews(news);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Transactional
	public void deleteNews(News news) throws SQLException {
		try {
			newsDAO.deleteNews(news);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
