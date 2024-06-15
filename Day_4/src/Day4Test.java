//2024.03.12(화) 수업 전 응용 Test

public class Day4Test {
	public static void main(String[] args)
	{
		func5();
	}
	
	
	//구구단 7단 출력하는 코드 
	static void func1() {
		int i;
		int j;
		
		for(i=1; i<10; i++)
		{
			System.out.println("7 * " +  i +" = " + (i*7));
		}
	}
	
	
	
	//*이 옆으로 나란히 10개 출력되는 코드 
	static void func2() {
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	// *
	// **
	// ***
	// .
	// .
	// .
	// **********(10개까지) 별 피라미드 만드는 코드 
	static void func3() {
		for(int i=0; i<10; i++)
		{
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// 위 모양 반대로 감소하는 별 피라미드 만드는 코드 
	static void func4() {
		for(int i=10; i>0; i--)
		{
			for(int j = i-1; j>0; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//구구단 2~9단 중복 for문 사용해서 출력
	
	static void func5() {
		for(int i = 2; i<10; i++)
		{
			System.out.println("구구단 " + i + "단");
			for(int j=1; j<10; j++)
			{
				System.out.println(i + " x " + j + " = " + i*j);
			}
			System.out.println();
		}
	}
	
	
}
