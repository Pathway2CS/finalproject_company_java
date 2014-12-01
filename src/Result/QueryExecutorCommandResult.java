package Result;

import java.util.ArrayList;

import Tuple.Tuple;


public class QueryExecutorCommandResult extends Result {

	private ArrayList<Tuple> queryResults;
	
	public QueryExecutorCommandResult()
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
	
	public void AddQueryResult(Tuple tuple) {
		queryResults.add(tuple);
	}
}
