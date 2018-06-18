package _07.spring.autowiring;

public class DBConnection {

	private Database database;
	
	private Property properties;

	public void openConnection() {

		System.out.println("url : " + this.database.getUrl());

		System.out.println("username : " + this.database.getUserName());

		System.out.println("password : " + this.database.getPassword());
		
		System.out.println("property 1: " + this.properties.getProperty1());
		
		System.out.println("property 2: " + this.properties.getProperty2());

		System.out.println("Connection was opened");

	}

	public void closeConnection() {
		System.out.println("Connection was closed");
	}

	public Database getDatabase() {
		return database;
	}

	public void setDatabase(Database database) {
		this.database = database;
	}

	public Property getProperties() {
		return properties;
	}

	public void setProperties(Property properties) {
		this.properties = properties;
	}
	
	

}
