import java.util.*;

public class VarTest {

	
	public static void main(String[] args) {

	}
	
	
	//a라는 이름의 정수형 변수를 선언하고 10으로 초기화
	static void func1() {
//		int a;
//		a = 10;
		int a = 10;
		
	}
	
	//세 개의 정수형 변수를 선언하고 오늘의 연도, 월, 일을 저장
	//세 변수에 저장된 값을 출력
	static void func2() {
		int a;
		int b;
		int c;
		
		a = 2024;
		b = 3;
		c = 4;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
	
	static void func3() {
		int a = 2024;
		int b = 3;
		int c = 4;
		System.out.println(a + "년 " + b + "월 " + c + "일");
	}
	
	//정수형 변수 x, y와 각각 10과 20을 저장
	//x, y 값을 교환해서 출력
	static void func4() {
		
		int x = 10;
		
		System.out.print("x:"+x);
		
	}
	
	static void func5() {
		int a = 2024;
		int b = 3;
		int c = 4;
		System.out.println("오늘은 " + a + "년 " + b + "월 " + c + "일 입니다");
	}
	
	//정수 하나와 문자열 하나를 입력받아
	//각각 출력
	static void func6() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();	
		System.out.println("첫번째 입력: " + a);
		
		String s = sc.next();
		System.out.println("두번째 입력: " + s);
	}
	
	static void func7() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("두 수의 합 : " + (a+b));
	}
	
	//출생년도를 입력받아 나이를 출력하세요
	static void func8() {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
	
		int age = 2024 - y + 1;
		
		System.out.println(age);
	}
	
	static void func9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름: ");
		String name = sc.next();
		
		System.out.println("국어: ");
		int kor = sc.nextInt();
		
		System.out.println("영어: ");
		int eng = sc.nextInt();
		
		System.out.println("수학: ");
		int math = sc.nextInt();
		
		int total = kor + eng + math;
		double avg = total/3.0d;
		
		System.out.println("총점: " + total +", 평균: " + avg);
	}
	
	static void func10() {
		
		double d  = 85.4;
		int score = (int)d;

		System.out.println("score="+score);
		System.out.println("d="+d);
	}
	
	static void func11() {
		
        ///// 형변환 1
		int num1;
		double num2 = 3.14;
		num1 = (int)num2;
		
		System.out.println(num1);
		System.out.println(num2);
		
		/////형변환 2
		char ch = 'A';
		int num = ch ;
		System.out.println(ch);
		System.out.println(num);
		
		/////형변환 3
		int a = 10;
		double d = a;
		System.out.println(d);
		
		
	}
	
	static void func12() {
		double num1;
		int num2, num3;
		char ch;
		
		num1= 3.14;
		num2 = (int)num1;
		ch = 'A';
		num3 = ch ;
		
		System.out.println(num1 + "," + num2 + ", " + num3 + ", " + ch);

	}

}






