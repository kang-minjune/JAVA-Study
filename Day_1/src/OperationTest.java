import java.util.Scanner;

public class OperationTest {

	public static void main(String[] args) {
		func7();
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
	
	static void func2() {
		int a = 1;
		int x = 4;
		
		//x << 2 + 1
		System.out.println(a << 2 + 1);
		
		System.out.println((a << 2) + 1);

		//x < -1 || x > 3 && x < 5
		System.out.println(x < -1 || x > 3 && x < 5);
	}
	
	static void func3() {
		int i=5, j=0;

		j = ++i;
		System.out.println("j=++i; 실행 후, i=" + i +", j="+ j);

		i=5;        // 결과를 비교하기 위해, i와 j의 값을 다시 5와 0으로 변경
		j=0;

		j = i++;
		System.out.println("j=i++; 실행 후, i=" + i +", j="+ j);
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
	
	static void func5() {
		int a = 1000000;  // 1,000,000
		int b = 2000000;  // 2,000,000
//		long c= a*b;
		long c = (long)a * b;   
		System.out.println(c);

	}
	
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
	}
	
	static void func8() {
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
}
