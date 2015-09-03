package by.ansgar.weblib.DAOImpl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import by.ansgar.weblib.DAO.UserDAO;
import by.ansgar.weblib.entity.Users;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addUsers(Users users) throws SQLException {
		currentSession().save(users);

	}

	public void updateUsers(Users users) throws SQLException {
		currentSession().update(users);

	}

	public Users getUsersById(int id) throws SQLException {
		return (Users) currentSession().get(Users.class, id);
	}

	public Users getUserByName(String login){
		Criteria criteria = currentSession().createCriteria(Users.class);
		criteria.add(Restrictions.eq("login", login));
		return (Users) criteria.uniqueResult();
	}
	
	@SuppressWarnings("unchecked")
	public List<Users> users() throws SQLException {
		return currentSession().createQuery("FROM Users").list();
	}

	public void deleteUsersById(Users users, int id) throws SQLException {
		currentSession().delete(id);
	}

	public Session currentSession() {
		Session currentSession = sessionFactory.getCurrentSession();
		return currentSession;
	}
	
}
