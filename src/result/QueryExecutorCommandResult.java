package result;

import java.util.ArrayList;

import Tuple.Tuple;


public class QueryExecutorCommandResult extends Result {

	private ArrayList<Tuple> queryResults;
	
	QueryExecutorCommandResult()
	{
		this.resultId=this.generteResultId();		
		this.errorCode=0;
		this.errorString="";		
		this.resultType=ResultType.QueryExecutorCommandResult;
	}
	
	public ArrayList<Tuple> getQueryResults()
	{
		return queryResults;
	}
}
