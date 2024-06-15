//매서드(함수)에 전달인자 지정후 main에서 호출하는 형식
public class WriteDemo {
	
	public static void main(String[] args)
	{
		func1();
		func2();
		sum(1,3);
		int result = mul(5,7); //result에 mul값을 
		System.out.println(result);
		
	}
	
	public static void func1()
	{
		System.out.println("hello");
	}
	
	public static void func2()
	{
		System.out.println("모블교육센터");
	}
	
	//두 개의 정수를 전달 받아 그 곱을 반환 
	public static int mul(int a, int b)
	{
		return a*b;
	}
	
	//두 개의 정수를 전달 받아 그 합을 출력 
	public static void sum(int a, int b)
	{
		System.out.println(a+b);
		return;
	}
	
}
