package data;


public class Employee extends Tuple{
	private static int CURRENT_ID = 0;
	private int id;
	private String name;
	private String birthday;
	private String department;
	private String position;
	private int salary;
	
	private Employee() {}
	
	public static Builder builder() {
		return new Builder();
	}
	
	public static synchronized int nextId() {
		return ++CURRENT_ID;
	}
	
	public static synchronized void resetId() {
		CURRENT_ID = 0;
	}
	
	public static class Builder {
		private Employee employee = new Employee();
		public Builder id(int id) {
			employee.id = id;
			return this;
		}
		public Builder name(String name) {
			employee.name = name;
			return this;
		}
		public Builder birthday(String birthday) {
			employee.birthday = birthday;
			return this;
		}
		public Builder department(String department) {
			employee.department = department;
			return this;
		}
		public Builder position(String position) {
			employee.position = position;
			return this;
		}
		public Builder salary(int salary) {
			employee.salary = salary;
			return this;
		}
		public Employee build() {
			return employee;
		}
	}
	
	public void displayTuple()
	{
		// implement this method to print the content of an employee tuple
	}

}
