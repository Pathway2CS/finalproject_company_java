package data;

import java.util.Arrays;
import java.util.List;

public class Position {
	private static String[] departments = {"development", "sales", "HR"};
	private static String[][] positions = {
		{
			"testing_engineer",
			"developer",
			"architect"
		},
		{
			"sales_representative",
			"sales_manager",
		},
		{
			"HR_representative"
		}
		
	};

	
	private String department;
	private String position;
	Position(String department, String position) {
		this.department = department;
		this.position = position;
	}
	
	public Position(int deptIdx, int positionIdx) {
		this.department = departments[deptIdx];
		this.position = positions[deptIdx][positionIdx];
	}
	
	public String getDepartment() {
		return department;
	}
	
	public String getPosition() {
		return position;
	}
	
	public static List<String> getDepartments() {
		return Arrays.asList(departments);
	}
	
	public static List<String> getPositions(String department) {
		int deptIdx = getDepartments().indexOf(department);
		if (deptIdx == -1) {
			throw new IllegalStateException("Fatal error in accessing departments");
		}
		return Arrays.asList(positions[deptIdx]);
	}
}