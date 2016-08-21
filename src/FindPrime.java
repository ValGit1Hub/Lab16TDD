
public class FindPrime {
	 public static void main (String[] args)  {	
	 //Kamel said not to take user input 
	 //so I set lab 16 to find prime number between 1  to 9.
		 
	int i =0;
    int num =0;
    String  primeNumbers = "";
        
    
    for (i = 1; i <= 9; i++)    //range of loop     
    { 		  	  
       int counter=0; 	  
       for(num =i; num>=1; num--)//loop to check how many time a number can be factored
	  {
         if(i%num==0)
	     {
        	 counter = counter + 1;
	     }
	  }//end of factor loop
	  if (counter ==2)// if counter is 2 then it is a prime number
	  {
	     //Appended the Prime number to the String
	     primeNumbers = primeNumbers + i + " ";

	  }	
    }//end of range loop
    System.out.println("Prime numbers from 1 to 9 are :");
    System.out.println(primeNumbers);
  }//end of main
     
}



