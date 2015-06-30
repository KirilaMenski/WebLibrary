package by.ansgar.SaveCitationWeb.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import by.ansgar.SaveCitationWeb.DAO.LinkNewsCommentsDAO;
import by.ansgar.SaveCitationWeb.entity.LinkNewsCom;

@Service
public class LinkNewsComServiceImpl implements LinkNewsComService {

	@Autowired
	private LinkNewsCommentsDAO newsComDAO;
	
	@Transactional
	public void addNewsCom(LinkNewsCom newsCom) throws SQLException {
		try{
			newsComDAO.addNewsCom(newsCom);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	@Transactional
	public List<LinkNewsCom> getAllComent(long id) throws SQLException {
		List<LinkNewsCom> allComment = new ArrayList<LinkNewsCom>();
		try{
			allComment = newsComDAO.getAllComent(id);
		}catch(Exception e){
			e.printStackTrace();
		}
		return allComment;
	}

}
