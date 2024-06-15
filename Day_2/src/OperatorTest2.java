
public class OperatorTest2 {
	
	public static void main(String[] args) {
		func3();
	}
	
	//6, 6
	static void func1() {
		
		int i=5;
		i++;		     
		System.out.println(i);

		i=5;		      
		++i;
		System.out.println(i);
	}
	
	//6, 5
	//6, 6
	static void func2() {
		int i, j;
		
		i = 5;
		j = i++;
		System.out.println("j=i++; 결과, i=" + i +", j="+ j); 

		i=5;        
		j = ++i;
		System.out.println("j=++i; 결과, i=" + i +", j="+ j); 
	}
	
	//5
	//6
	//6, 6
	static void func3() {
		int i=5, j=5;

		System.out.println(i++);	            
		System.out.println(++j);
		System.out.println("i = " + i + ", j = " +j);
	}

}
