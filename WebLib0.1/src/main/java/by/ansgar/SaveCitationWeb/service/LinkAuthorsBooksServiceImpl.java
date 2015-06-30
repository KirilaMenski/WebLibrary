package by.ansgar.SaveCitationWeb.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import by.ansgar.SaveCitationWeb.DAO.LinkAuthorsBooksDAO;
import by.ansgar.SaveCitationWeb.entity.LinkAuthorsBooks;

@Service
public class LinkAuthorsBooksServiceImpl implements LinkAuthorsBooksService{

	@Autowired
	private LinkAuthorsBooksDAO linkAuthorsBooksDAO;
	
	@Transactional
	public void addAuthorsBooks(LinkAuthorsBooks linkAuthosBooks)
			throws SQLException {
		try{
			
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

}
