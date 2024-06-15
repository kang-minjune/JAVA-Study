import java.util.Scanner;

public class OperatorTest {

	public static void main(String[] args) {
		


	}
	

	
	static void func1() {
		System.out.println("hello java");
		int x = 10;
		int y = 10;

		//–x + 3
		System.out.println(-x+3);

		//x + 3 * y
		System.out.println(x + 3 * y);

		//x + 3 > y - 2
		System.out.println(x + 3 > y - 2);

		//x > 3 && x < 5
		System.out.println(x > 3 && x < 5);

	}
	
	//시프트연산
	static void func2() {
		int a = 1;
		System.out.println(a<<1);
		System.out.println(a<<2);
		System.out.println(a<<3); 
		
		System.out.println();
		
		int b = 8;
		System.out.println(b>>1);
		System.out.println(b>>2);
		System.out.println(b>>3);
		
	}
	
	// 시프트 연산과 산술 연산
	static void func3() {
		int a = 1;
		int x = 4;
		
		//x << 2 + 1
		System.out.println(a << 2 + 1);
		
		System.out.println((a << 2) + 1);

		//x < -1 || x > 3 && x < 5
		System.out.println(x < -1 || x > 3 && x < 5);
	}
	
	//사용자로부터 초 단위 시간을 정수로 입력받아 시간, 분, 초로 표시
	//4000초를 입력받는다면 1시간 6분 40초로 출력해야함
	static void func4() {
		Scanner scan = new Scanner(System.in);
		int time = scan.nextInt();
		
	
		int sec = time%60;
		int min = (time/60)%60;
		int hour = (time/60)/60;
		
		System.out.println(hour + "시간, " + min +"분, " +sec +"초");

	}
	
	//이항연산자 특징
	static void func5_1() {
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a + b);
		System.out.println(c);
		
	}
	
	//이항연산자 특징
	static void func5() {
		int a = 1000000;  // 1,000,000
		int b = 2000000;  // 2,000,000
//		long c= a*b;
		long c = (long)a * b;   
		System.out.println(c);

	}
	
	//이항연산자 특징
	static void func6() {
		
		long a = 1000000 * 1000000; // 1,000,000
		long b = 1000000* 1000000L;
		
		int c = 1000000*1000000/1000000;
		int d = 1000000/1000000*1000000;
		
		System.out.println("a:"+  a);
		System.out.println("b:"+  b);
		System.out.println("c:"+  c);
		System.out.println("d:"+  d);
	}
	
	//이항연산자 특징
	//int 보다 작은 데이터타입은 int로 변환해서 연산
	static void func7() {
		//알파벳소문자 연산
		char c1 = 'a';
//		char c2 = c1 + 1;
//		char c2 = (char)(c1 + 1);  
		char c2 = ++c1;
		System.out.println(c2);
		
		//문자형 숫자의 연산
		int  i = '2' - '0';//2
		
		System.out.println(i);
		
		
//		char ch = 'y';
//		ch = (char)(ch - ('a' - 'A'));
//		System.out.println(ch);
	}
	
	//printf 사용법
	static void func8_1() {
		int a = 10;
		System.out.printf("%d", a);
		
		System.out.println();

		float f = 3.141592f;
		System.out.printf("%f", f);
		System.out.println();
		System.out.printf("%.3f", f);
	}
	
	//실수의 소수부를 3째자리까지 표현하기
	static void func8() {
		
		System.out.printf("%.3f\n", 3.141592f);
		
		float pi = 3.141592f;
		pi = ((int)(pi*1000))/1000F;
		System.out.println(pi);
		
		double pi2 = 3.141592d;
		pi2 = ((int)(pi2*1000))/1000d;
		System.out.println(pi2);

		float pi3 = 3.141592f;
		pi3 = ((int)((pi3+0.0005)*1000))/1000F;
		System.out.println(pi3);
		
		float pi4 = 3.141592f;
		pi4 = (Math.round(pi4*1000))/1000F;
		System.out.println(pi4);
	}
	
	//관계연산자
	static void func9() {
		int x = 10;
		int y = 20;
		
		System.out.println(x >= y);
	}
	
	//비트연산
	static void func10() {
		int a = 3;
		int b= 5;
		System.out.println(a|b);
		System.out.println(a&b);
		System.out.println(a^b);
	}
	
	//두 개 정수 중 큰 값을 반환하는 삼항연산자
	static void func11() {
		int a =83;
		int b = 5;
		int max = (a>b)? a: b;
		System.out.println(max);

	}
	
	//대입연산자
	static void func12() {
		
		int a = 10;
		a += 3; //a = a+3;
		System.out.println(a);
	}
}
