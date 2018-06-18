package _06.spring.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class DBConnection {

	private String userName;

	private String password;

	private List<String> list;

	private Map<String, String> maps;

	private Properties props;

	public void openConnection() {

		System.out.println("Username : " + this.userName);

		System.out.println("Password : " + this.password);

		System.out.println("List : ");

		list.forEach(System.out::println);

		System.out.println("Map : ");

		maps.forEach((key, value) -> System.out.println(key + " : " + maps.get(key)));

		System.out.println("Properties : ");

		props.forEach((key, value) -> System.out.println(key + " : " + props.getProperty((String) key)));

		System.out.println("Connection was opened");

	}

	public void closeConnection() {

		System.out.println("Connection was closed");

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

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Map<String, String> getMaps() {
		return maps;
	}

	public void setMaps(Map<String, String> maps) {
		this.maps = maps;
	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

}
