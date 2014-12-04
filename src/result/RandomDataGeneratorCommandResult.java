package result;

import java.util.ArrayList;

import data.*;

public class RandomDataGeneratorCommandResult extends Result {
	
private ArrayList<Employee> employeeGenerated;
	
    RandomDataGeneratorCommandResult()
	{
		this.resultId=this.generteResultId();		
		this.errorCode=0;
		this.errorString="";		
		this.resultType=Result.ResultType.QueryExecutorCommandResult;
	}
	
	public ArrayList<Employee> getEmployeeGenerated()
	{
		return employeeGenerated;
	}

}
