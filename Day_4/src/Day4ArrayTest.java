//2024.03.12(화) 배열 코딩 수업 내용

import java.util.Scanner;

public class Day4ArrayTest {
	
	public static void main(String[] args)
	{
		func3();
	}
	
	//배열을 선언 및 생성 후 5명의 점수를 입력받아 평균 구하는 코드 
	public static void func1() 
	{
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		double avg = 0;
		
		int point[] = new int[5];
		for(int i=0; i<5; i++) {
			point[i] = sc.nextInt();
			sum += point[i];
		}
		avg = sum/(double)5;
		System.out.print("다섯 학생의 평균 점수는 :");
		System.out.println(avg);
		System.out.print("점 입니다.");
	}
	
	//5개의 정수를 저장할 수 있는 배열을 선언 및 생성하고
	//2,3,4,5,6으로 초기화
	public static void func2() {
		int arr[] = new int[5];
		
		arr[0] = 10;
		arr[1] = 11;
		arr[2] = 12;
		arr[3] = 13;
		arr[4] = 14;
	}
	
	//5개의 정수를 저장할 수 있는 배열을 선언을 하고 
	//2,3,4,5,6로 동시에 초기화 
	public static void func3() {
		int arr[] = {0,1,2,3,4};
		System.out.println(arr[5]);	
	}
	
	
	//7명의 점수를 선언과 초기화를 동시에 하고 총점과 평균을 구하는 코드 
	public static void func4() {
		int hap = 0;
		double avg = 0;
		int arr[] = {90, 85, 100, 100, 70, 95, 80};
		
		for(int i=0; i<arr.length; i++)
		{
			hap += arr[i];
		}
		avg = (double)hap/arr.length;
		
		System.out.println("총점: " + hap + " 평균: " + avg);
	}
}
