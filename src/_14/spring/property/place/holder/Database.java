package _14.spring.property.place.holder;

public class Database {

	private String url;

	private String userName;

	private String password;

	public Database(String url, String userName, String password) {
		this.url = url;
		this.userName = userName;
		this.password = password;
	}

	public Database() {
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

	@Override
	public String toString() {
		return "Database [url=" + url + ", userName=" + userName + ", password=" + password + "]";
	}

}
