package command;

public class SearchEmployeeBySalaryRangeCommand extends QueryExecutorCommand {

	private double min;
	private double max;
	
	public SearchEmployeeBySalaryRangeCommand(double min, double max) {
		super();
		this.min = min;
		this.max = max;
		commandName = CommandName.SearchEmployeesBySalaryRange;
	}
	
	public double getMin() {
		return min;
	}
	public double getMax() {
		return max;
	}
}
