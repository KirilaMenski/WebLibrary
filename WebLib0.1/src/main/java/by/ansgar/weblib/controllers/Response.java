package by.ansgar.weblib.controllers;

public class Response {
	private String userName;
	private int userPassword;
	
	public Response(){
		
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(int userPassword) {
		this.userPassword = userPassword;
	}
	
}
