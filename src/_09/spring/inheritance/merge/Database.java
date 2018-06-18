package _09.spring.inheritance.merge;

import java.util.List;

public class Database {

	private String url;

	private String userName;

	private String password;

	private List<String> properties;

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

	public List<String> getProperties() {
		return properties;
	}

	public void setProperties(List<String> properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "Database [url=" + url + ", userName=" + userName + ", password=" + password + ", properties="
				+ properties + "]";
	}

}
