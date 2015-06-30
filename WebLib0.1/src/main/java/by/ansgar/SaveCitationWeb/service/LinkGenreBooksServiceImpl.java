package by.ansgar.SaveCitationWeb.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import by.ansgar.SaveCitationWeb.DAO.LinkGenreBooksDAO;
import by.ansgar.SaveCitationWeb.entity.LinkGenreBooks;

@Service
public class LinkGenreBooksServiceImpl implements LinkGenreBooksService{

	@Autowired
	private LinkGenreBooksDAO linkGenreBooksDAO;
	
	@Transactional
	public void addGenreBooks(LinkGenreBooks linkGenreBooks)
			throws SQLException {
		try{
			linkGenreBooksDAO.addGenreBooks(linkGenreBooks);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	@Transactional
	public List<LinkGenreBooks> getGenreBooks(long id) throws SQLException {
		return linkGenreBooksDAO.getGenreBooks(id);
	}

}
