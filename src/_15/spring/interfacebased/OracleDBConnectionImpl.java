package _15.spring.interfacebased;

public class OracleDBConnectionImpl implements DBConnection {

	@Override
	public void openConnection() {
		
		System.out.println("Oracle database connection was opened");

	}

	@Override
	public void closeConnection() {
		
		System.out.println("Oracle database connection was closed");

	}

}
