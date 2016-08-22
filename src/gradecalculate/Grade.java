package gradecalculate;

import java.util.Scanner;

public class Grade {
	private static Scanner input;
	public static void main (String[] args){
		
		input = new Scanner(System.in);
		
		System.out.println("프로그래밍 과목 점수를 입력하세요");
		int a= input.nextInt();
		System.out.println("경영 과목 점수를 입력하세요");
		int b= input.nextInt();
		System.out.println("수학 과목 점수를 입력하세요");
		int c= input.nextInt();
		System.out.println("알고리즘 과목 점수를 입력하세요");
		int d= input.nextInt();
	
		GradeCalculator grade = new GradeCalculator();
		
		int gradeSum = grade.sum(a , b, c, d);
		int gradeAvg = grade.avg(gradeSum , 4);

	
		System.out.println("과목의 총점은"+ gradeSum + "입니다" );
		System.out.println("과목의 평균은"+ gradeAvg + "입니다" );
		
		if (gradeAvg >= 90){
			System.out.println("참 잘했어요" );
		}

	}
}


