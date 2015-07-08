package by.ansgar.weblib.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import by.ansgar.weblib.DAO.LinkBooksCommentsDAO;
import by.ansgar.weblib.entity.LinkBooksComments;

@Service
public class LinkBooksCommentsServiceImpl implements LinkBooksCommentsService{

	@Autowired
	private LinkBooksCommentsDAO linkBooksCommentsDAO;
	
	@Transactional
	public void addBooksCom(LinkBooksComments linkBooksComments)
			throws SQLException {
		try{
			linkBooksCommentsDAO.addBooksCom(linkBooksComments);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	@Transactional
	public List<LinkBooksComments> getComent(long id) throws SQLException {
		return linkBooksCommentsDAO.getComent(id);
	}

}
