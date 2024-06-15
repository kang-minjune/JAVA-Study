import java.util.Scanner;

public class Day4ArrayTest_Myself {
		
		public static void main(String[] args)
		{
			func5();
		}
		
		//배열을 선언 및 생성 후 5명의 점수를 입력받아 평균 구하는 코드 
		public static void func1() 
		{
			Scanner sc = new Scanner(System.in);
			
			int arr[] = new int[5];
			int hap = 0;
			double avg = 0;
			
			for(int i=0; i<5; i++) {
				arr[i] = sc.nextInt();
				hap += arr[i];	
			}
			avg = hap/(double)5;
			System.out.println(avg);
		}
		
		//5개의 정수를 저장할 수 있는 배열을 선언 및 생성하고
		//2,3,4,5,6으로 초기화
		public static void func2() {
			
		}
		
		//5개의 정수를 저장할 수 있는 배열을 선언을 하고 
		//2,3,4,5,6로 동시에 초기화 
		public static void func3() {
			
		}
		
		
		//7명의 점수를 선언과 초기화를 동시에 하고 총점과 평균을 구하는 코드 
		public static void func4() {
			
			int arr[] = {80, 100, 100, 90, 95, 75};
			int hap=0;
			double avg=0;
			
			for(int i=0; i<arr.length; i++) {
				hap += arr[i];
			}
			avg = (double)hap/arr.length;
			
			System.out.println("총점 : " + hap + " 평균 : " + avg);
			
		}
	
	   //3x10 정수형 2차원 배열을 만들고 각 행마다 2의 배수. 3의 배수, 4의 배수를 저장하세요. * 배수는 0을 포함하지 않는 배수 
	   public static void func5() {
		   int[][] arr = new int[3][10];
			
			for(int i = 0 ; i < arr.length ; i++) {
				for(int j = 0 ; j <arr[i].length ; j++) {
					
					arr[i][j] = (i+2)*(j+1);
				
		            System.out.println(arr[i][j]); 
		        } 
			}
			
		}
	   
}



