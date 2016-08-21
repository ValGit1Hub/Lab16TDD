
public class GetPrimeNums {

	public static int primeNums(int input) {
		int i =0;
	    int num =0;
	    int prime = 1;
	    for (i =input; i <= input; i++)         
	    { 		  	  
	       int counter=0; 	  
	       for(num =i; num>=1; num--)
		  {
	    	   if (Mod(i,num)==0){
	    		   //set counter to check for how many times factored
	    		   counter += 1;
	    	   }
	    	   prime = isPrime(counter);	
			
		  }//end of loop factorial
	    }//end of range loop
	    input = prime;
	    System.out.println("What is input"+input);
	    
		return input;
	}
	/**
	 * @param counter
	 * @return
	 */
	public static int isPrime(int counter) {
		int prime;
		if (counter ==2)
		   {
			   prime = 0;
			   System.out.println("prime is set");
		   }
		   else
		   {
			   //its composite
			   prime = -1;
		   }
		return prime;
	}
	public static int Mod(int x, int y){
		
		return x%y;
	}

}
