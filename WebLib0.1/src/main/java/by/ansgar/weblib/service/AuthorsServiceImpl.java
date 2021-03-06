package by.ansgar.weblib.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import by.ansgar.weblib.DAO.AuthorsDAO;
import by.ansgar.weblib.entity.Authors;
import by.ansgar.weblib.util.DateCalendar;

@Service
public class AuthorsServiceImpl implements AuthorsService {

	@Autowired
	private AuthorsDAO authorsDAO;

	@Transactional
	public void addAuthor(Authors authors) throws SQLException {

		try {
			authors.setDate(DateCalendar.hour + ":" + DateCalendar.min + " "
					+ DateCalendar.day + "." + DateCalendar.month + "."
					+ DateCalendar.year);
			authorsDAO.addAuthor(authors);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Transactional
	public void editAuthor(Authors authors) throws SQLException {

		try {
			authors.setDate(DateCalendar.hour + ":" + DateCalendar.min + " "
					+ DateCalendar.day + "." + DateCalendar.month + "."
					+ DateCalendar.year);
			authorsDAO.editAuthor(authors);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Transactional
	public List<Authors> getAllAuthors() throws SQLException {
		List<Authors> getAuthors = new ArrayList<Authors>();
		try {
			getAuthors = authorsDAO.getAllAuthors();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return getAuthors;
	}

	@Transactional
	public Authors getAuthor(long id) throws SQLException {
		return authorsDAO.getAuthor(id);
	}

	@Transactional
	public Authors getAuthor(String name) throws SQLException {
		return authorsDAO.getAuthor(name);
	}

}
