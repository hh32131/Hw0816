package temperature;

import java.util.Scanner;

public class Changer {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TemperCalculator temper = new TemperCalculator();
		int exitNum = 0;
		int selectedMenu =0;
		int celsius = 0;
		int fahrenheit =0;
		double result = 0.0;
		while (true) {
			System.out.println("1. 화씨 -> 섭씨");
			System.out.println("2. 섭씨 -> 화씨");
			System.out.println("원하시는 번호를 누르세요");
			selectedMenu = scanner.nextInt();

			if (selectedMenu == 1) {
				System.out.println("변경하실 화씨 도수를 적어주세요");
				celsius = scanner.nextInt();
				result = temper.celsius(celsius);
				System.out.println("변환된 결과는" + result + "도 입니다");
			}
			else if (selectedMenu == 2) {
				System.out.println("변경하실 섭씨 도수를 적어주세요");
				fahrenheit = scanner.nextInt();
				result = temper.fahrenheit(fahrenheit);
				System.out.println("변환된 결과는" + result + "도 입니다");

			}
			else{
				System.out.println("잘못 누르셨습니다");
			}
			System.out.println("끝내시고 싶으시면 999 을 입력, 다시 하시려면 아무키나 눌러주세요");
			exitNum= scanner.nextInt();
		if (exitNum == 999){
			break;
			}
		}
	}

}
