package _16.spring.required;

import org.springframework.beans.factory.annotation.Required;

public class DBConnection {

	private String url;

	private String userName;

	private String password;

	public DBConnection(String url, String userName, String password) {
		this.url = url;
		this.userName = userName;
		this.password = password;
	}

	public DBConnection() {
	}

	public String getUrl() {
		return url;
	}
	
	@Required
	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void openConnection() {
		
		System.out.println("url : " + this.url);

		System.out.println("username : " + this.userName);

		System.out.println("password : " + this.password);
		
		System.out.println("Connection was opened");

	}

	public void closeConnection() {
		System.out.println("Connection was closed");
	}

}
