package by.ansgar.weblib.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import by.ansgar.weblib.DAO.LinkAuthorsBooksDAO;
import by.ansgar.weblib.entity.LinkAuthorsBooks;

@Service
public class LinkAuthorsBooksServiceImpl implements LinkAuthorsBooksService{

	@Autowired
	private LinkAuthorsBooksDAO linkAuthorsBooksDAO;
	
	@Transactional
	public void addAuthorsBooks(LinkAuthorsBooks linkAuthosBooks)
			throws SQLException {
		try{
			linkAuthorsBooksDAO.addAuthorsBooks(linkAuthosBooks);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	@Transactional
	public List<LinkAuthorsBooks> getAuthorsBooks(long id) throws SQLException {
		List<LinkAuthorsBooks> getAllAuthorsBooks = new ArrayList<LinkAuthorsBooks>();
		try{
			getAllAuthorsBooks = linkAuthorsBooksDAO.getAuthorsBooks(id);
		}catch(Exception e){
			e.printStackTrace();
		}
		return getAllAuthorsBooks;
	}

	@Transactional
	public List<LinkAuthorsBooks> getAuthor(long id) throws SQLException {
		List<LinkAuthorsBooks> getAuthor = new ArrayList<LinkAuthorsBooks>();
		try{
			getAuthor = linkAuthorsBooksDAO.getAuthor(id);
		}catch(Exception e){
			e.printStackTrace();
		}
		return getAuthor;
	}

}
