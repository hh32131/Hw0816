package gradecalculate;

public class GradeCalculator {
	
	
	public int sum(int a, int b, int c, int d){
		
		int sumResult = a + b + c + d;
		return sumResult; 
		
	}
	public int avg(int sumResult, int count ){
		
		int avgResult = sumResult / 4;
		return avgResult;
		
	}
}
