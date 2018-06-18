package _15.spring.interfacebased;

public class MySQLDBConnectionImpl implements DBConnection{
	
	@Override
	public void openConnection() {
		
		System.out.println("MySQL database connection was opened");

	}

	@Override
	public void closeConnection() {
		
		System.out.println("MySQL database connection was closed");

	}
	
}
