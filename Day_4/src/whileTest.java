
//2024.03.12(화) 수업 내용 코드 

import java.util.*;

public class whileTest {
	
	
	
	//while문 hello 5번 반
	static void func1() {
		int i = 0;
		
		while(i++ < 5) {
			System.out.println((i+1) + ". hello");		
		}
	}
	
	//while문으로 8단 출력
	static void func2() {
		int i=1;
		
		while(i++ <= 9)
		{
			System.out.println("8 x " + i + " = " + (i*8));
		}
	}
	
	//while문을 이용해서 i번 입력받고 홀수인지 짝수인지 i번 출력 
	static void func3() {
		Scanner sc = new Scanner(System.in);
		
		int i=1;
			
		while(i <=5 ) {
			
			int num = sc.nextInt(); //5번 입력 받으려면 while문 안에 있어야 함.
			
			if(num%2 != 0) {
				System.out.println("홀수입니다");
			}
			else 
			{
				System.out.println("짝수입니다");
			}	
			i++;
		}		
	System.out.println("종료");
	}
	
	//do-while문을 이용해서 i번 입력받고 홀수인지 짝수인지 i번 출력
		static void func4() {
			Scanner sc = new Scanner(System.in);
			
			int i=1;
			do {
				int num = sc.nextInt(); //5번 입력 받으려면 while문 안에 있어야 함.
				
				if(num%2 != 0) {
					System.out.println("홀수입니다");
				}
				else 
				{
					System.out.println("짝수입니다");
				}	
				i++;
			}
			while(i<5);
		System.out.println("종료");
		}
		
		
	
		
		//사용자로부터 하나의 양의 정수를 입력받아서
		//for,while,do-while문 중에 아무거나 사용해서
		//짝수인지 홀수인지 출력
		//-1이 입력되면 종료
		static void func5() {
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
		
		
		
		//두 개 주사위 합을 출력
		//난수 발생(1부터 6가지의 난수)
		//q를 누르면 종료
		//c를 누르면 계속
		static void func6() {
			Scanner sc = new Scanner(System.in);
			
			int n1, n2;
			char ch = 0;
			
			do {
				n1 = ((int)(Math.random()*6))+1;
				n2 = ((int)(Math.random()*6))+1;
				
				System.out.println("두 주사위 (" + n1 + "," + n2 + ") 합 : " + (n1+n2));
				
				System.out.println("계속할까요? (c 또는 q 입력)");
				ch = (sc.next()).charAt(0);
				
				
				while(ch!='c'&&ch!='q') {
					ch = (sc.next()).charAt(0);
				} //c와 q를 제외한 다른 문자가 입력되었을 때 다시 입력할 수 있게 예외처리 
				
				if(ch == 'q') {
					System.out.println("종료");
					break;						
				}
				
			} while(ch=='c');
			
		}
		
		
			
		public static void main(String[] args) {
			func6();
		}
	
}
