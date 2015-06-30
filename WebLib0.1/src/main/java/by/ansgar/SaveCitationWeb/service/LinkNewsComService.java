package by.ansgar.SaveCitationWeb.service;

import java.sql.SQLException;
import java.util.List;

import by.ansgar.SaveCitationWeb.entity.LinkNewsCom;

public interface LinkNewsComService {
	public void addNewsCom(LinkNewsCom newsCom) throws SQLException;

	// public LinkNewsCom getNewsComById (long id) throws SQLException;
	//
	// public List<LinkNewsCom> newsCom() throws SQLException;

	public List<LinkNewsCom> getAllComent(long id) throws SQLException;
}
