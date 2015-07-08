package by.ansgar.weblib.DAO;

import java.sql.SQLException;
import java.util.List;

import by.ansgar.weblib.entity.Programm;

public interface ProgrammDAO {
	
	public void addProgramm (Programm programm) throws SQLException;
	
	public void deleteProgramm (long id) throws SQLException;
	
	public void editProgramm(Programm programm) throws SQLException;
	
	public List<Programm> getAllProgram() throws SQLException;
	
	public Programm getProgrammById(long id) throws SQLException;

}
