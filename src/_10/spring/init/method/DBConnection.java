package _10.spring.init.method;

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

	public void validate() {

		if (this.url == null || this.userName == null || this.password == null) {
			throw new NullPointerException("Wrong database properties");
		} else {
			System.out.println("Correct");
		}

	}

	public String getUrl() {
		return url;
	}

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

		System.out.println("Connection was opened");

	}

	public void closeConnection() {
		System.out.println("Connection was closed");
	}

}
