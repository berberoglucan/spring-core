package _04.spring.object.injection;

public class DBConnection {

	private Database database;
	

	public void openConnection() {

		System.out.println("url : " + this.database.getUrl());

		System.out.println("username : " + this.database.getUserName());

		System.out.println("password : " + this.database.getPassword());

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
	
	

}
