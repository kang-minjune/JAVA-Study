import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//2차원 배열
//6. 다음과 같이 2차원 배열을 초기화 하고 2차원의 형태로 출력
//100, 100, 100  
//20, 20, 20 
//30, 30, 30 
//40, 40, 40  
//50, 50, 50 

//7. 3명의 학생 대상 C 시험과 Java 시험을 봐서 다음과 같다.
//90, 95
//85, 100
//95, 90
//7-1. 이들 점수로 2차원 배열을 초기화하고 2차원 형태로 출력
//7-2. 세 명의 C언어 점수 평균을 반복문으로 구해서 출력

//8. 다섯 개의 매장을 가지고 있고 각 매장에 3명의 직원(과장, 대리, 사원)이 있다
//전 직원의 급여액수를 저장하기 위한 5x3 배열을 만들고
//8-1 사용자로부터 급여액을 입력받아 배열에 저장한다.
//8-2 매장별 총 급여을 구해서 출력하고
//8-3 직급별 총 급여를 구해서 출력하라

public class ArrayStudy2D {
	
	public static void main(String[] args) {


		
		return ;
		
	}
	
	static void func6() {
		int[][] score = {   { 100, 100, 100 }, 
							{ 20, 20, 20 }, 
							{ 30, 30, 30 },
							{ 40, 40, 40 }, 
							{ 50, 50, 50 } };

		for(int i = 0 ; i<5 ; i++) {
			for(int j = 0 ; j < 3; j++) {
				System.out.print(score[i][j] + ", ");
			}
			
			System.out.println();
		}
	}
	
//7. 3명의 학생 대상 C 시험과 Java 시험을 봐서 다음과 같다.
//90, 95
//85, 100
//95, 90
//7-1. 이들 점수로 2차원 배열을 초기화하고 2차원 형태로 출력
//7-2. 세 명의 C언어 점수 평균을 반복문으로 구해서 출력
	static void func7() {
		
		int[][] score = { 
				{90, 95},
				{85, 100},
				{95, 90}
		};
		
		int c_total =0;
		
		//모든 점수 출력하기
		for(int i = 0 ;i < score.length ;i ++) {
			for(int j = 0 ; j < score[i].length ;j++) {
				System.out.print(score[i][j]+", ");
			}
			System.out.println();
		}
		
		//C언어 총점
		for(int i = 0 ;i < score.length ;i ++) {
			c_total += score[i][0];
		}
		
		System.out.println("3명의 C언어 평균은 " + c_total/3f + "점 입니다");
	}
	
	//String을 저장하기 위한 3x2 배열을 만들고
	//3명이 이름과 연락처를 입력받아 저장 후 출력
	static void func8() {
		String[][] addr = new String[3][2];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0 ; i <addr.length ;i++) {
			
			System.out.println(i+1+"번:");
			for(int j = 0 ; j < addr[i].length ;j++) {
				addr[i][j] = sc.next();
			}
			
			System.out.println();
		}
		
		for(int i = 0 ; i < addr.length;i++) {
			System.out.println(Arrays.toString(addr[i]));
		}
	}
	

	//8. 다섯 개의 매장을 가지고 있고 각 매장에 3명의 직원(과장, 대리, 사원)이 있다
	//전 직원의 급여액수를 저장하기 위한 5x3 배열을 만들고
	//8-1 사용자로부터 급여액을 입력받아 배열에 저장한다.
	//8-2 매장별 총 급여을 구해서 출력하고
	//8-3 직급별 총 급여를 구해서 출력하라	
	static void func9() {
		
		int[][] sallery = new int[5][3];
		
		int total;
		int total_lev_1 =0;
		int total_lev_2 =0;
		int total_lev_3 =0;
		Scanner sc = new Scanner(System.in);
		
		//급여입력
		for(int i = 0 ;i < sallery.length ; i++) {
			System.out.println( i + 1 + "번 매장 급여입력");
			for(int j = 0 ; j < sallery[i].length ; j++) {
				System.out.println( j+1 + "번 직원 급여 : ");
				sallery[i][j] = sc.nextInt();
			}
		}
		
		//매장별
		for(int i = 0 ;i < sallery.length ; i++) {
			total = 0;
			for(int j = 0 ; j < sallery[i].length ; j++) {
				total += sallery[i][j];
			}
			System.out.println(i+1+"번 매장 총 급여액 : " + total);
		}
		
		//직급별
		for(int i = 0 ;i < sallery.length ; i++) {
		
			total_lev_1 += sallery[i][0];
			total_lev_2 += sallery[i][1];
			total_lev_3 += sallery[i][2];
		}
		
		System.out.println("직급별 총 급여액 : " + total_lev_1 +", "
				+ total_lev_2 +", " + total_lev_3 +", ");
		
	}
	
}

