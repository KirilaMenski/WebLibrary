package by.ansgar.SaveCitationWeb.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import by.ansgar.SaveCitationWeb.DAO.BooksDAO;
import by.ansgar.SaveCitationWeb.entity.Books;
import by.ansgar.SaveCitationWeb.util.DateCalendar;

@Service
public class BooksServiceImpl implements BooksService {

	@Autowired
	private BooksDAO booksDAO;

	@Transactional
	public void addBooks(Books books) throws SQLException {
		try {
			books.setDate(DateCalendar.hour + ":" + DateCalendar.min + " "
					+ DateCalendar.day + "." + DateCalendar.month + "."
					+ DateCalendar.year);
			booksDAO.addBooks(books);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Transactional
	public void editBooks(Books books) throws SQLException {
		try {
			books.setDate(DateCalendar.hour + ":" + DateCalendar.min + " "
					+ DateCalendar.day + "." + DateCalendar.month + "."
					+ DateCalendar.year);
			booksDAO.editBooks(books);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Transactional
	public List<Books> getAllBooks() throws SQLException {
		List<Books> getAllBooks = new ArrayList<Books>();
		try{
			getAllBooks = booksDAO.getAllBooks();
		}catch(Exception e){
			e.printStackTrace();
		}
		return getAllBooks;
	}

	@Transactional
	public Books getBooksById(long id) throws SQLException {
		return booksDAO.getBooksById(id);
	}

}
