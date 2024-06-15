//2024.03.13(화) 프린트 4번 번외(카카오톡 단톡에)
public class TvTest {
   public static void main(String[] args) {
	  Tv tv1 = new Tv();
	  tv1.ChannelUp();
	  tv1.ChannelDown();
      
	  
   }
   
  
}

class Tv{
	boolean power;
	int channel; 
	
	void power(){power=!power;}
    void ChannelUp() {channel++;}
    void ChannelDown() {channel--;}
}


