package compare;

import java.util.Scanner;

public class BigNumber {
	
	public static void main(String [] args){
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫 번째 숫자를 입력해주세요");
		int number1 = scanner.nextInt();
		System.out.println("두 번째 숫자를 입력해주세요");
		int number2 = scanner.nextInt();
		
		
		if(number1 > number2){
			System.out.println("더 큰 숫자는" + number1 + "입니다");
		}
		
		if(number1 < number2){
			System.out.println("더 큰 숫자는" + number2 + "입니다");
		}
		if(number1 == number2){
			System.out.println("두 숫자는 크기가" + number1 + "로 같습니다");
		}
		
		
		
	}

}
