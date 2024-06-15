import java.util.Scanner;

public class MyForTest {

	// 여러개의 for문
	static void func1() {
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("  hello");
		}
		
		for(int i = 5 ; i > 0 ; i--) {
			System.out.println("  hello");
		}
		
		for(int i = 0 ; i <= 10 ; i+=2) {
			System.out.println(i);
		}
	}
	
	//1부터 3까지의 합을 구하기
	static void func2() {
		int sum = 0;
		for(int i = 1; i <= 3 ;i++) {
			sum += i;  //sum = sum + i;
		} 
		
		System.out.println("1부터 3까지의 합: " + sum);
	}
	
	//1부터 10까지의 합을 구하기
	static void func3() {
		int sum = 0;
		for(int i = 1; i <= 10 ;i++) {
			sum += i;  //sum = sum + i;
		} 
		
		System.out.println("1부터 10까지의 합: " + sum);
	}
	
	//1부터 사용자가 입력한 값까지의 합을 출력
	static void func4_1() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 1 ;i <= num ; i++) {
			sum += i;
		}
		System.out.println("1부터 " + num + "까지의 합 : " + sum);
		
	}
	
	//0부터 100이하의 양수를 입력 받아 그 합을 출력
	static void func4() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num < 0 || num > 100) {
			System.out.println("잘못된 입력입니다");
			return ;
		}
		
		int sum = 0;
		
		for(int i = 1 ;i <= num ; i++) {
			sum += i;
		}
		System.out.println("1부터 " + num + "까지의 합 : " + sum);
		
	}
	
	//0에서 시작하는 3의 배수 10개
	static void func5() {
		for(int i = 0 ;i < 10 ; i++) {
			System.out.print(i*3 + ", ");
		}
	}
	
	//3에서 시작하는 3의 배수 10개
	static void func5_2() {
		for(int i = 1 ;i <= 10 ; i++) {
			System.out.print(i*3 + ", ");
		}
	}
	
	//구구단 8단 출력
	static void func6() {
		for(int i = 1 ;i <=9 ; i++ ) {
			System.out.println("8 x " + i + " = " + (8*i));
		}
	}
	
	//1부터 100까지의 정수 중에서 7의 배수만 출력
	static void func7() {
		for(int i = 1 ; i <= 100 ;i++) {
			if(i%7 == 0) {
				System.out.print(i + ", ");
			}
		}
	}
	
	//사용자로부터 2부터 9사이의 수를 입력받아
	//해당 구구단을 출력
	static void func8() {
		
		System.out.println("2부터 9사이의 정수를 입력하세요 ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num < 2 || num >9 ) {
			System.out.println("잘못된 입력입니다");
			return;
		}
		
		for(int i = 1 ;i <=9 ; i++ ) {
			System.out.println(num + " x " + i + " = " + (num*i));
		}
	}
	
	//사용자로부터 두 개 정수를 입력 받아 두 수 사이의 합을 출력
	//3과 7을 입력받으면 3+4+5+6+7을 출력
	static void func9() {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int min, max;
		int sum = 0;
		
		min = (n1<n2) ? n1 : n2;
		max = (n1>n2) ? n1 : n2;
		
		for(int i = min ; i <= max ; i++) {
			sum += i;
		}
		System.out.println("두 수 사이의 합: " + sum);
	}
	
	//무한히 반복하는 for문
	static void func10() {
		
		int i = 0;
		for(;;) {
			i++;
			if(i==1000) break;
			
			System.out.println("hello");
		}
		
	}
	
//	주사위 두 개를 던져서 두 주사위의 합이 큰 사람이 이기는 게임을 만들고자 한다
//	1부터 6까지의 난수를 두 번 발생시켜 두 수의 합을 구하는 코드를 작성한다
//	단, c를 누르면 이를 반복하고 q를 누르면 종료한다
	static void func11() { 
		
		Scanner sc = new Scanner(System.in);
		String s;
		char ch;
		
		for(;;) {
			System.out.println("주사위 합을 구하려면 c, 게임 종료는 q를 누르세요");
			s = sc.next();
			ch = s.charAt(0);
			if(ch == 'c') {
				int n1 = (int)(Math.random()*6) + 1;
				int n2 = (int)(Math.random()*6) + 1;
				System.out.println("주사위 1 : " + n1 );
				System.out.println("주사위 2 : " + n2 );
				System.out.println("주사위 합 : " + (n1 + n2) );
			}
			else if(ch == 'q') {
				System.out.println("게임종료");
				break;
			}else {
				System.out.println("c 또는 q를 입력하세요");
			}
			
		}

	}
	
	
	public static void main(String[] args) {
		
		func11();
	}

}