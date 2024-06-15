//PlusMinusMulDiv.java 파일에 있는 코드 복습(빈칸채우기)

import java.util.Scanner;

public class ExampleLoop_Myself {
		// 2개의 정수를 인자로 전달받아
		// 합, 차, 곱, 나눈 몫을 반환하는 메서드 4개를 구현
		// 각 메서드 명 sum, sub, mul, div
		// div의 반환 타입은 double, 그 외의 메서드 반환 타입은 int
	
		public static void main(String[] args) {
			// 사용자로부터 2개의 정수를 입력받고
			// 하나의 연산자를 +, -, *, / 문자로 입력받아
			// 두 정수의 연산결과를 추가한 4개의 메서드를 호출해서 구하고
			// 출력하세요
			
			Scanner sc = new Scanner(System.in);
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			char c = (sc.next()).charAt(0);
			
			switch(c) {
			case '+' :
				int sumresult = sum(num1, num2);
				System.out.println(sumresult); break;
				
			case '-' :
				int subresult = sub(num1, num2);
				System.out.println(subresult); break;
			
			case '*' :
				int mulresult = mul(num1, num2);
				System.out.println(mulresult); break;
			
			case '/' :
				double divresult = div(num1, num2);
				System.out.println(divresult); break;
			}
			
			
		}

		public static int sum(int a, int b)
		{
			return a+b;
		}
		
		public static int sub(int a, int b)
		{
			return a-b;
		}
		
		public static int mul(int a, int b)
		{
			return a*b;
		}
		public static double div(int a, int b)
		{
			return a/b;
		}
		
		



}
