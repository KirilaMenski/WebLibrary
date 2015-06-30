package by.ansgar.SaveCitationWeb.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import by.ansgar.SaveCitationWeb.DAO.LinkBooksCommentsDAO;
import by.ansgar.SaveCitationWeb.entity.LinkBooksComments;

@Service
public class LinkBooksCommentsServiceImpl implements LinkBooksCommentsService{

	@Autowired
	private LinkBooksCommentsDAO linkBooksCommentsDAO;
	
	@Transactional
	public void addNewsCom(LinkBooksComments linkBooksComments)
			throws SQLException {
		try{
			linkBooksCommentsDAO.addNewsCom(linkBooksComments);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	@Transactional
	public List<LinkBooksComments> getComent(long id) throws SQLException {
		return linkBooksCommentsDAO.getComent(id);
	}

}
