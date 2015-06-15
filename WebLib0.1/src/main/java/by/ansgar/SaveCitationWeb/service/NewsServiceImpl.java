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

@Service
public class NewsServiceImpl implements NewsService {

	@Autowired
	//@Qualifier("newsDAO")
	private NewsDAO newsDAO;

	Calendar calendar = Calendar.getInstance();
	int year = calendar.get(Calendar.YEAR);
	int month = calendar.get(Calendar.MONTH) + 1;
	int day = calendar.get(Calendar.DAY_OF_MONTH);
	int hour = calendar.get(Calendar.HOUR_OF_DAY);
	int min = calendar.get(Calendar.MINUTE);
	
	@Transactional
	public void addNews(News news) throws SQLException {
		news.setDate(hour + ":" + min + " " + day+"."+month+"."+year);
		try{
			newsDAO.addNews(news);
		}catch(Exception e){
			e.printStackTrace();
		}

	}

	public List<News> getAllNews() throws SQLException {
		List<News> newsList = new ArrayList<News>();
		try {
			newsList = newsDAO.getAllNews();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return newsList;
	}

	public News getNewsById(int id) throws SQLException {
		//try{
			return newsDAO.getNewsById(id);
		//}catch(Exception e){
			//e.printStackTrace();
		//}
	}

}
