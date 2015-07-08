package by.ansgar.weblib.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import by.ansgar.weblib.DAO.BooksCommentsDAO;
import by.ansgar.weblib.entity.BooksComments;
import by.ansgar.weblib.util.DateCalendar;

@Service
public class BooksCommentsServiceImpl implements BooksCommentsService {

	@Autowired
	private BooksCommentsDAO booksComDAO;

	@Transactional
	public BooksComments getCommentsById(long id) throws SQLException {
		return booksComDAO.getCommentsById(id);
	}

	@Transactional
	public List<BooksComments> booksComments() throws SQLException {
		List<BooksComments> getAllBooksComments = new ArrayList<BooksComments>();
		try {
			getAllBooksComments = booksComDAO.booksComments();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return getAllBooksComments;
	}

	@Transactional
	public void addComments(BooksComments booksComments) throws SQLException {
		try {
			booksComments.setUserName("Menski");
			booksComments.setDate(DateCalendar.hour + ":" + DateCalendar.min
					+ " " + DateCalendar.day + "." + DateCalendar.month + "."
					+ DateCalendar.year);
			booksComDAO.addComments(booksComments);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
