package calculator;

import java.util.Scanner;

public class User {
	private static Scanner input;
	public static void main (String[] args){
		OperatorCalculator operator = new OperatorCalculator();
		
		input = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자를 입력해 주세요");
		int a = input.nextInt();
		System.out.println("+, - , * , / 중 한가지 연산자를 입력해 주세요");
		String oper = input.next();
		System.out.println("두 번째 숫자를 입력해 주세요");
		int b = input.nextInt();

	
		int OperAdd = operator.add(a ,b);
		int OperSub = operator.sub(a ,b);
		int OperMul = operator.mul(a ,b);
		int OperDiv = operator.div(a ,b);

		if (oper.equals("+")){
			System.out.println("두 수의 합은"+ OperAdd + "입니다"  );
		}
		if (oper.equals("-")){
			System.out.println("두 수의 차는"+ OperSub + "입니다"  );
		}
		if (oper.equals("*")){
			System.out.println("두 수의 곱은"+ OperMul + "입니다"  );
		}
		if (oper.equals("/")){
			System.out.println("두 수를 나눈 값은"+ OperDiv + "입니다"  );
		}

	}
}
