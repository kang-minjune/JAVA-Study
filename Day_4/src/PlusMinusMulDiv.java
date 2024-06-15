//2024.03.12(화) - 복습 시간에 꼭 해보기

import java.util.Scanner;

public class PlusMinusMulDiv {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		char pmmd = (sc.next()).charAt(0); //문자열을 입력 받을때는 반드시 이렇게 해야함. (문자열 첫번째부터 찾아줌. charAt(0)
		
		
		if(pmmd == '+') {
			int sumresult = sum(num1, num2);
			System.out.println(sumresult);
		}
		else if(pmmd == '-'){
			int subresult = sub(num1, num2);
			System.out.println(subresult);
		}
		
		else if(pmmd == '*') {
			int mulresult = mul(num1, num2);
			System.out.println(mulresult);
		}
		else if(pmmd == '/') {
			double divresult = div(num1, num2);
			System.out.println(divresult);
		}			
	}
	
	//a와 b의 합을 반환 
	public static int sum(int a, int b)
	{
		
		return a+b;
		
	}
	
	//a와 b의 차를 반환
	public static int sub(int a, int b)
	{
		return a-b;
		
	}
	
	//a와 b의 곱을 반환 
	public static int mul(int a, int b)
	{
		return a*b;
		
	}
	
	//a에 b를 나눈 몫을 실수로 반환
	public static double div(int a, int b)
	{
		return a/(double)b;
		
	}
}