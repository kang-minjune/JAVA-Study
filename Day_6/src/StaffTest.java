//2024.03.13(화) 프린트 5번

public class StaffTest {
   public static void main(String[] args) {
	   Staff stf1 = new Staff();
	   stf1.name = "김태희";
	   stf1.position = "과장";
	   stf1.sallay = 3000000;
	   
	   
	   Staff stf2 = new Staff();
	   stf2.name = "차은우";
	   stf2.position = "대리";
	   stf2.sallay = 2000000;
	   
	   Staff stf3 = new Staff();
	   stf3.name = "소지섭";
	   stf3.position = "사원";
	   stf3.sallay = 1000000;
	   
	   System.out.println(stf1.info());
	   System.out.println(stf2.info());
	   System.out.println(stf3.info());
   }
}

class Staff{
	
	 String position;
	 String name;
	 double sallay;
	
	 String info() {
		 return name + " " + position + " " + sallay;
	 }
	  
}
