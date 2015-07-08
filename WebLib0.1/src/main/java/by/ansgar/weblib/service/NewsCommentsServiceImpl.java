package by.ansgar.weblib.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import by.ansgar.weblib.DAO.CommentsDAO;
import by.ansgar.weblib.entity.NewsComments;
import by.ansgar.weblib.util.DateCalendar;

@Service
public class NewsCommentsServiceImpl implements NewsCommentsService {

	@Autowired
	private CommentsDAO commentsDAO;

	@Transactional
	public void addComments(NewsComments comments) throws SQLException {
		try {
			comments.setUserName("Kirila");
			comments.setDate(DateCalendar.hour + ":" + DateCalendar.min + " " + DateCalendar.day + "."
					+ DateCalendar.month + "." + DateCalendar.year);
			commentsDAO.addComments(comments);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Transactional
	public List<NewsComments> commentsList() throws SQLException {
		List<NewsComments> getAllComments = new ArrayList<NewsComments>();
		try{
			getAllComments = commentsDAO.commentsList();
		}catch(Exception e){
			e.printStackTrace();
		}
		return getAllComments;
	}

	@Transactional
	public NewsComments getCommentById(long id) throws SQLException {
		return commentsDAO.getCommentsById(id);
	}

}
