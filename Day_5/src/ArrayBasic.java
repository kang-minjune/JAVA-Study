
public class ArrayBasic {
	public static void main(String[] args) {
		func4();
	}
	
	//길이가 5인 int형 배열을 선언 및 생성하고
	//10,11,12,13,14를저장
	public static void func1() {
		//배열의 선언과 생성
		int[] arr = new int[5];
		
		//배열의 초기화
		arr[0] = 10;
		arr[1] = 11;
		arr[2] = 12;
		arr[3] = 13;
		arr[4] = 14;
		
	}
	
	//5개의 정수를 저장할 수 있는 배열을 선언과 동시에 
	//2,3,4,5,6로 초기화
	public static void func2() {
		
		int arr[] = {2,3,4,5,6};
		
	}
	
	//다음 배열의 모든 요소를 출력
	public static void func3() {
		int arr[] =  {9,8,7,6,5,4,3};//배열의 길이가 7
		
		int sum = 0;
		for(int i = 0 ; i < 7 ; i++ ) {
			System.out.println(arr[i]);
			sum = sum + arr[i];
		}
		
		System.out.println("모든 배열 요소의 합 : " + sum);

	}
	
	//다음과 같이 성적이 저장되어 있다
	//총점과 평균을 각각 int와 double로 출력
	public static void func4() {
		int score[] =  {90, 85, 100, 100,70, 95, 80};
		int total = 0;
		double avg = 0;
		
		for(int i = 0 ;i < score.length ; i++) {
			total += score[i];
		}
		
		avg = (double)total/score.length;
		
		System.out.println("총점: "+ total +",  평균: " + avg);
		
	}
	

}
