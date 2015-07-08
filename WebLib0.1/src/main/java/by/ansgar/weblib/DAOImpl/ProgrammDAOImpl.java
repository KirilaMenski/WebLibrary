package by.ansgar.weblib.DAOImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import by.ansgar.weblib.DAO.ProgrammDAO;
import by.ansgar.weblib.entity.Programm;

@Repository
public class ProgrammDAOImpl implements ProgrammDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addProgramm(Programm programm) throws SQLException {

	}

	public void deleteProgramm(long id) throws SQLException {

	}

	public void editProgramm(Programm programm) throws SQLException {

	}

	public List<Programm> getAllProgram() throws SQLException {
		List<Programm> allProgramm = new ArrayList<Programm>();
		try {
			allProgramm = currentSession().createQuery("FROM Programm").list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return allProgramm;
	}

	public Programm getProgrammById(long id) throws SQLException {
		Programm programmById = null;
		try{
			programmById = (Programm) currentSession().get(Programm.class, id);
		}catch(Exception e){
			e.printStackTrace();
		}
		return programmById;
	}

	public Session currentSession() {
		Session currentSession = sessionFactory.getCurrentSession();
		return currentSession;
	}

}
