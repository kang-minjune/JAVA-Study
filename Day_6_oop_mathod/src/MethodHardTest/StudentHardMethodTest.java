//Method 생성 응용 문제 4번 (동일 폴더에 문제 있음)

package MethodHardTest;

import java.util.Scanner;

public class StudentHardMethodTest {
	public static void main(String[] args) {
		
		Student st[] = new Student[5];
		
		Scanner sc = new Scanner(System.in);
		
		int max = 0 ;
		String maxname = null;
		
		System.out.println("이름/국어점수/영어점수/수학점수 순으로 입력");
		
		for(int i = 0; i < st.length; i++) {
			
			st[i] = new Student();	
			st[i].setName(sc.next());
		    st[i].setKor(sc.nextInt());
		    st[i].setEng(sc.nextInt());
		    st[i].setMath(sc.nextInt());
	
			if(max < st[i].getTotal()) {				    
				max = st[i].getTotal();
				maxname = st[i].getName();
			}	
		}
		
		
		
		//4번 출력 코드
		System.out.println();
		System.out.println("[4번 출력]");
			 
		for(int i = 0; i < st.length; i++) {
			System.out.println("이름: " + st[i].getName() +" 국어: "+ st[i].getKor() + " 영어: "+ st[i].getEng() + " 수학: " + st[i].getMath());
		}
		
		
		//5번 출력 코드 
		System.out.println();
		System.out.println("[5번 출력]");
		System.out.println("총점이 가장 높은 사람은: " + maxname +"입니다.");
	}
	
}

class Student{
	
	    //4번을 풀기 위한 선언 및 반환 
		String name;
		int kor;
		int eng;
		int math;
		
		
		String getName() {
			return name;
		}
		void setName(String str) {
			name = str;
		}

		
		int getKor() {
			return kor;
		}
		void setKor(int k) {
			kor = k;
		}
		
		int getEng() {
			return eng;
		}
		void setEng(int e) {
			eng = e;
		}
		
		int getMath() {
			return math;
		}
		void setMath(int m) {
			math = m;
		}
		
		
		//5번 total 반환		 
		int getTotal() {
			return kor + eng + math;
		}
		
	}
