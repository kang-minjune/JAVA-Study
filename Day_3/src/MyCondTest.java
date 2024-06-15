import java.util.Scanner;

public class MyCondTest {

	static void func1() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num%2 == 0) {
			System.out.println("짝수입니다");
		}else {
			System.out.println("홀수입니다");
		}	
	}	
	
	static void func2() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num%2 != 0) {
			System.out.println("홀수입니다");
		}else if(num == 0){
			System.out.println("0입니다");
		}else {
			System.out.println("짝수입니다");
		}	
	}
	
	static void func3() {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
	    if(score>=90) {
			System.out.println("A 학점입니다");
		}else if(score>=80) {
			System.out.println("B학점입니다");
		}else if(score>=70) {
			System.out.println("C학점입니다");
		}else if(score>=60) {
			System.out.println("D학점입니다");
		}else {
			System.out.println("F학점입니다");
		}
	}

	
	static void func4() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num%3 == 0) {
			System.out.println(num);
		}else {
			System.out.println("3의 배수가 아닙니다");
		}
		
	}	
	static void func5() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num%3==0 || num%7==0) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
	}

	static void func6() {
		System.out.println("카드 게임을 시작합니다. 원하는 메뉴를 선택하세요");
		System.out.println("1. 카드를 섞습니다");
		System.out.println("2. 모든 카드를 보여 줍니다");
		System.out.println("3. 원하는 카드를 선택합니다");
		System.out.println("4. 게임을 종료합니다");
		
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		
		if(menu == 1) {
			System.out.println("카드 섞기를 선택했습니다");
		}else if(menu == 2) {
			System.out.println("카드 보기를 선택했습니다");
		}else if(menu == 3) {
			System.out.println("카드 선택을 선택했습니다");
		}else  {
			System.out.println("게임을 종료합니다");
		}
		
	}
	
	//0보다 크고 10보다 작은 한 자리 양수를 입력 받아 출력하고
	//그 외의 정수는 잘못된 입력이라고 출력
	public static void func7() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num >0 && num <10) {
			System.out.println("입력한 수 : " + num);
		}else {
			System.out.println("잘못된 입력입니다");
		}
		
	}
	
	//0보다 작거나 100보다 큰 수는 잘못된 입력이라고 출력
	public static void func8() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num <0 || num >100) {
			System.out.println("잘못된 입력입니다");
		}
		
	}
	
	//소문자는 대문자로, 대문자는 소문자로 출력
	public static void func9() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char ch = s.charAt(0);
		
		if(ch >= 'A' && ch <='Z') {
			ch = (char)(ch + ('a'-'A'));
		}else if(ch >= 'a' && ch <= 'z') {
			ch = (char)(ch - ('a'-'A'));
		}else {
			System.out.println("잘못된 입력입니다");
			return ;
		}
		
		System.out.println("변경한 문자:" + ch);
	}

	//중첩if 문
	static void func11() {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if(score>=0 && score <=100) {
			if(score>=90) {
				System.out.println("A 학점입니다");
			}else if(score>=80) {
				System.out.println("B학점입니다");
			}else if(score>=70) {
				System.out.println("C학점입니다");
			}else if(score>=60) {
				System.out.println("D학점입니다");
			}else {
				System.out.println("F학점입니다");
			}
		}else {
			System.out.println("잘못된 입력입니다");
		}
	}
	
	static void func12() {
		System.out.println("카드 게임을 시작합니다. 원하는 메뉴를 선택하세요");
		System.out.println("1. 카드를 섞습니다");
		System.out.println("2. 모든 카드를 보여 줍니다");
		System.out.println("3. 원하는 카드를 선택합니다");
		System.out.println("4. 게임을 종료합니다");
		
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("카드 섞기를 선택했습니다");
			break;
		case 2:
			System.out.println("카드 보기를 선택했습니다");
			break;
		case 3:
			System.out.println("카드 선택을 선택했습니다");
			break;
		default:
			System.out.println("게임을 종료합니다");
			break;
		}
		
	}

	static void func13() {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		int num = score/10;
		
		switch(num) {
		case 10:
		case 9:
			System.out.println("A 학점입니다");
			break;
		case 8:
			System.out.println("B학점입니다");
			break;
		case 7:
			System.out.println("C학점입니다");
			break;
		case 6:
			System.out.println("D학점입니다");
			break;
		default:
			System.out.println("F학점입니다");
				
		}
	}
	
	static void func14_1() {

		int num1, num2, result;
		char op;
		Scanner sc = new Scanner(System.in);

		System.out.println("첫번 째 수를 입력하세요");
		num1 = sc.nextInt();

		System.out.println("두번 째 수를 입력하세요");
		num2 = sc.nextInt();

		System.out.println("+, -, *, / 중 하나를 입력하세요");
		String str_op = (sc.next());
		op = str_op.charAt(0);
		
		switch (op) {
		case '+':
			result = num1 + num2;
			System.out.println(""+ num1 + op + num2 + "=" + result );
			break;
		case '-':
			result = num1 - num2;
			System.out.println(""+ num1 + op + num2 + "=" + result );
			break;
		case '*':
			result = num1 * num2;
			System.out.println(""+ num1 + op + num2 + "=" + result );

			break;
		case '/':
			result = num1 / num2;
			System.out.println(""+ num1 + op + num2 + "=" + result );
			break;
		default:
			System.out.println("잘못된 입력입니다");
			return;
		}

	}
	
	static void func14() {

		int num1, num2, result=0;
		char op;
		Scanner sc = new Scanner(System.in);

		System.out.println("첫번 째 수를 입력하세요");
		num1 = sc.nextInt();

		System.out.println("두번 째 수를 입력하세요");
		num2 = sc.nextInt();

		System.out.println("+, -, *, / 중 하나를 입력하세요");
		String str_op = (sc.next());
		op = str_op.charAt(0);
		
		switch (op) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			if(num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다");
				break;
			}
			result = num1 / num2;
			break;
		default:
			System.out.println("잘못된입력입니다");
			return;
		}
		
		if(num2 != 0)
			System.out.println(""+ num1 + op + num2 + "=" + result );
	}
	
	public static void main(String[] args) {
		func14_1();
	}
	

}