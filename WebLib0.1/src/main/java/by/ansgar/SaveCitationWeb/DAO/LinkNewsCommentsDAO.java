package by.ansgar.SaveCitationWeb.DAO;

import java.sql.SQLException;
import java.util.List;

import by.ansgar.SaveCitationWeb.entity.LinkNewsCom;

public interface LinkNewsCommentsDAO {
	
	public void addNewsCom (LinkNewsCom newsCom) throws SQLException;
	
	public List<LinkNewsCom> getAllComent (long id) throws SQLException;
	
}
