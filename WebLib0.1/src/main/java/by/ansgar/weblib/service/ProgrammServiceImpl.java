package by.ansgar.weblib.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import by.ansgar.weblib.DAO.ProgrammDAO;
import by.ansgar.weblib.entity.Programm;

@Service
public class ProgrammServiceImpl implements ProgrammService{
	
	@Autowired
	private ProgrammDAO programmDAO;
	
	public void addProgramm(Programm programm) throws SQLException {
		
	}

	public void deleteProgramm(long id) throws SQLException {
		
	}

	public void editProgramm(Programm programm) throws SQLException {
		
	}

	@Transactional
	public List<Programm> getAllProgram() throws SQLException {
		List<Programm> allProgramm = new ArrayList<Programm>();
		try{
			allProgramm = programmDAO.getAllProgram();
		}catch(Exception e){
			e.printStackTrace();
		}
		return allProgramm;
	}
	
	@Transactional
	public Programm getProgrammById(long id) throws SQLException {
		return programmDAO.getProgrammById(id);
	}

}
