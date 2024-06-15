//whileTest.java 파일에서 공부했던 내용 복습(코드 채우기)

import java.util.Scanner;

public class WhileTest2_Myself {
	public static void main(String[] args) {
		func7();
	}
	
	//while문을 사용해서 hello를 5번 반복
	public static void func1() {
		int i = 0;
		
		while(i++ < 5) {
			System.out.println("hello");
		}
	}
	
	//while문을 사용해서 hello를 5번 반복
	public static void func2() {
		
	}
	
	//while문으로 8단 출력
	public static void func3() {
		int i = 1;
		System.out.println("구구단 8단");
		
		while(i++ <= 8) {
			
			System.out.println("8 x " + i + " = " + i*8);
		}
	}
	
	//do while
	public static void func4() {
		int i = 1;
		
		do {
			if(i%2==0 && i%2!=0) {
				i++;
			}
			System.out.println("8 x " + i + " = " + i*8);
		}
		while(i++<9);

	}
	
	//하나의 양의정수를 입력받아 짝수 인지 홀수 인지 출력
	//5번 반복 (while문 사용)
	public static void func5() {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		while(num++ <5) {
			num = sc.nextInt();
			
			if(num%2==0) {
				System.out.println("짝수입니다.");
			}
			else System.out.println("홀수입니다.");
			
		}
		
	}
	
	//하나의 양의정수를 입력받아 짝수 인지 홀수 인지 출력
	//5번 반복 (do-while문 사용)
	public static void func6() {
		
		Scanner sc = new Scanner(System.in);
		int  num = 0;
		do {
			num++;
			num = sc.nextInt();
			if(num%2==0) {
				System.out.println("짝수입니다.");
			}
			else System.out.println("홀수입니다.");
		} while(num++<5);
		
	}
	
	//하나의 양의 정수를 입력받아 짝수인지 홀수인지를 출력
	//-1이 입력되기전까지 반복, -1이 입력되면 종료
	static void func7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("하나의 양수를 입력하세요:");
		
		int num = sc.nextInt();	
		
		while(num != -1) {
			
					
			if(num%2==0) {
				System.out.println("짝수입니다.");
			}
			else if(num%2!=0){
				System.out.println("홀수입니다.");
			}
			else{
				System.out.println("잘못된 입력입니다.");
			}
			
			num = sc.nextInt();	
			
			
			if(num<0) {
				System.out.println("종료합니다.");	break;
			}
		}//위에서 조건으로 설정했던 num != -1 이외에 음수 입력해도 종료될 수 있게 예외처리
							
	}
	
	
	
	
}
