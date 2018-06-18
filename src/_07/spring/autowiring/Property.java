package _07.spring.autowiring;

public class Property {

	private String property1;

	private String property2;

	public Property(String property1, String property2) {
		this.property1 = property1;
		this.property2 = property2;
	}

	public Property() {
	}

	public String getProperty1() {
		return property1;
	}

	public void setProperty1(String property1) {
		this.property1 = property1;
	}

	public String getProperty2() {
		return property2;
	}

	public void setProperty2(String property2) {
		this.property2 = property2;
	}

}
