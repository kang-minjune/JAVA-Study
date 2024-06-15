import java.util.Arrays;
import java.util.Scanner;

//1차원 배열
//1. 10개의 정수를 저장할 수 있는 배열을 만들고, 반복문을 사용해 1부터 10까지 저장하세요.
//2. 학생들의 점수를 저장할 정수 배열을 100, 88, 100, 100, 90 로 초기화합니다. 
// 이 배열의 요소 값을 모두 더한 총합과 평균을 반복문을 사용해서 구하고 출력하세요
//3. 길이가 5인 정수형 배열에 사용자로부터 값을 입력받아 초기화하고 이 중 가장 큰 값을 출력
//4. "79, 88, 91, 33, 100, 55, 95"로 초기화한 정수 배열에서 최대값, 최소값 구하기
//5. 정수 길이가 10인 정수형 배열을 만들고 1부터 45까지의 난수를 저장하고 출력하세요 (중복허용)
//6. 1부터 10까지의 중복되지 않은 정수 10개를 출력하세요 (정렬되지 않은 섞여있는 형태, 5, 9, 4, 10...)
//7. 1부터 45까지의 수 6개를 출력하세요 (로또번호발생기)
//8. 학급인원수 만큼의 길이를 갖는 1차원 배열을 생성하고 인원 수 만큼 성적을 입력받아 저장

public class ArrayStudy {
	
	public static void main(String[] args) {
		func2();
	}
	
	//1. 10개의 정수를 저장할 수 있는 배열을 만들고, 반복문을 사용해 1부터 10까지 저장하세요.
	static void func1() {
		
//		int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
		int[] arr = new int[10] ;
		
		for(int i = 0 ; i < arr.length ;i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + ", ");
		}
		
	}
	
	//2. 학생들의 점수를 저장할 정수 배열을 100, 88, 100, 100, 90 로 초기화합니다. 
	// 이 배열의 요소 값을 모두 더한 총합과 평균을 반복문을 사용해서 구하고 출력하세요
	static void func2() {
		int sum =0;// 총점을 저장하기 위한 변수
		double average = 0f;// 평균을 저장하기 위한 변수

		int[] score = {100, 88, 100, 100, 90};

		for (int i=0; i < score.length ; i++ ) {
			sum += score[i];
		}
   
		average = sum / (double)score.length ; // 계산결과를 				
		                                       //float로 얻기 위함.

		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + func2_getAvg(average));
	}
	
	//전달 받은 실수를 소수 세째자리에서 반올림한 소수 둘째자리까지의 실수를 반환
	public static double func2_getAvg(double avg) {
		double result = 0;
		
		result = (int)((avg+0.005)*100)/(double)100;
		
		return result;
	}
	
	

	//3. 길이가 5인 정수형 배열에 사용자로부터 값을 입력받아 초기화하고 이 중 가장 큰 값을 출력
	static void func3() {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		int var = 0;
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
			if(var < arr[i]) {
				var = arr[i];
			}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("가장 큰 입력 값은 " + var + "입니다");
		
	}

	//4 최대최소 구하기
	static void func4() {
		int[] arr = { 79, 88, 91, 33, 100, 55, 95};
		int min = arr[0];
		int max = arr[0];
		
		for(int i = 0 ; i < arr.length ; i++) {
			min = (arr[i] < min) ? arr[i] : min;
			max = arr[i] > max ? arr[i] : max;
		}
		
		System.out.println("최소값 : " + min);
		System.out.println("최대값 : " + max);
		
	}
	
	//5. 정수 길이가 10인 정수형 배열을 만들고 1부터 45까지의 난수를 저장하고 출력하세요 (중복허용)
	static void func5() {
		
		int[] arr = new int[10];
		
		for(int i = 0 ;i < arr.length ; i++) {
			arr[i] = (int)(Math.random()*45) + 1;
		}

		for(int i = 0 ;i < arr.length ; i++) {
			System.out.print(arr[i] + ", ");
		}

		
	}
	
	//6. 1부터 10까지의 중복되지 않은 정수 10개를 출력하세요 
	//   (정렬되지 않은 섞여있는 형태, 5, 9, 4, 10...)
	static void func6() {
		
		int[] number = new int[10];
		
		for(int i = 0 ;i < number.length ;i++) {
			number[i] = i + 1;
		}
		
//		int j = 0, temp = 0;
//		for(int i = 0 ;i < 100 ;i++) {
//			j = (int)(Math.random()*10);
//			
//			temp = number[j];
//			number[j] = number[0];
//			number[0] = temp;	
//		}
		func6_shuffle(number);
		
		
//		for(int i = 0 ;i <number.length ;i++) {
//			System.out.print(number[i] + ", ");
//		}
		System.out.println(Arrays.toString(number));
		
	}
	
	static void func6_shuffle(int[] arr) {
		int j = 0, temp = 0;
		for(int i = 0 ;i < arr.length*3 ;i++) {
			j = (int)(Math.random()*10);
			
			temp = arr[j];
			arr[j] = arr[0];
			arr[0] = temp;	
		}
	}
	
	//5. 로또번호발생기 
	static void func7() {
		int[] ball = new int[45];       

		for(int i=0; i < ball.length; i++)       
			ball[i] = i+1;   

		int temp = 0;   int j = 0;      

		for(int i=0; i < 100; i++) {       
			j = (int)(Math.random() * 45);  
			temp     = ball[j]; 
			ball[j] = ball[0]; 
			ball[0] = temp; 
		} 
		
		for(int i=0; i < 6; i++) 
		{
			System.out.print(ball[i] + ", ");
		}
	}
	
	//학급인원수 만큼의 길이를 갖는 1차원 배열을 생성하고
	//학생의 성적을 인원 수 만큼 입력받아 저장
	static void func9() {
		Scanner sc = new Scanner(System.in);
		int[] score ;

		System.out.println("학급의 인원은 몇명인가요?");
		int n = sc.nextInt();
		score = new int[n];

		for(int i = 0 ; i < score.length ;i++) {
			System.out.println(i+1 + "번 학생의 성적을 입력하세요");
			score[i] = sc.nextInt();
		}
	}
}

//int[][] arr1 = new int[3][2];
//arr1[0][0] = 1;
//
//int[][] arr2 = {{1,2}, {3,4}, {5,6}};
//
//int[][] arr3 = new int[3][2];
//
//int value = 1;
//for(int i = 0 ; i < 3 ; i++) {
//	for(int j = 0 ; j < 2 ; j++) {
//		arr3[i][j] = value++;
//	}
//}