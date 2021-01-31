public class Calculator {
      public long add(int c, int d,int ... a) {
    	  int sum=0;
    	  for(int x:a) {
    		  sum=sum+x;	  
    	  }
    	  return sum+c+d;	  
      }   
}
