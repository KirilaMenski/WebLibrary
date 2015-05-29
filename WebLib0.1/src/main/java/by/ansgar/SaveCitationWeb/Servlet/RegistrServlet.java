package by.ansgar.SaveCitationWeb.Servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import by.ansgar.SaveCitationWeb.DAO.Factory;
import by.ansgar.SaveCitationWeb.entity.Users;

@WebServlet("/RegistrServlet")
public class RegistrServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	JSONParser jsonParser = new JSONParser();
	Users users = new Users();

	public RegistrServlet() {
		super();
	}

	public JSONObject getJSONObject(String json) throws ParseException {
		return (JSONObject) jsonParser.parse(json.trim());// parse преобразует
															// jsоn строку в
															// json объект
	}

	// разабрацца
	public static String getMessageBody(HttpServletRequest request)
			throws IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader reader = request.getReader();
		String line;
		while ((line = reader.readLine()) != null) {
			sb.append(line);
		}
		return sb.toString();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String data = getMessageBody(request);
		try {
			JSONObject json = getJSONObject(data);

			users.setFirstName((String) json.get("name"));
			users.setLastName((String) json.get("lastname"));
			users.setPassword((String) json.get("password"));
			users.setEmail((String) json.get("email"));
			Factory.getInstance().getUsersDAO().addUsers(users);

			List<Users> users = Factory.getInstance().getUsersDAO().users();

			for (int i = 0; i < users.size(); i++) {
				System.out.println(users.get(i).getId() + " "
						+ users.get(i).getFirstName() + " "
						+ users.get(i).getLastName() + " "
						+ users.get(i).getPassword() + " "
						+ users.get(i).getEmail());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
