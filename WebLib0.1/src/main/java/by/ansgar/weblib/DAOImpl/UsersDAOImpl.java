package by.ansgar.weblib.DAOImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.hibernate.Session;

import by.ansgar.weblib.DAO.UsersDAO;
import by.ansgar.weblib.entity.Users;
import by.ansgar.weblib.util.HibernateUtil;

public class UsersDAOImpl implements UsersDAO {

	public void addUsers(Users users) throws SQLException {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(users);
			session.getTransaction().commit();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error",
					JOptionPane.OK_OPTION);
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}

	}

	public void updateUsers(Users users) throws SQLException {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.update(users);
			session.getTransaction().commit();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error",
					JOptionPane.OK_OPTION);
		} finally {
			if (session.isOpen() && session != null) {
				session.close();
			}
		}
	}

	public Users getUsersById(int id) throws SQLException {
		Session session = null;
		Users users = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			users = (Users) session.get(Users.class, id);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error",
					JOptionPane.OK_OPTION);
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		return users;
	}

	public List<Users> users() throws SQLException {
		Session session = null;
		List<Users> users = new ArrayList<Users>();

		try {
			session =HibernateUtil.getSessionFactory().openSession();
			users = session.createCriteria(Users.class).list();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error",
					JOptionPane.OK_OPTION);
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		return users;
	}

	public void deleteUsersById(Users users, int id) throws SQLException {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.delete(users);
			session.getTransaction().commit();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error",
					JOptionPane.OK_OPTION);
		} finally {
			if (session.isOpen() && session != null) {
				session.close();
			}
		}
	}

}
