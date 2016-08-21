import static org.junit.Assert.*;

import org.junit.Test;

public class primeNumTester {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
//	@Test
//	public void test1(){
//		//-1 is not a prime
//		assertEquals(-1,GetPrimeNums.primeNums(1));
//	}
//	@Test
//	public void test2(){
//		assertEquals(0,GetPrimeNums.primeNums(2));
//	}
	@Test
	public void test3(){
		assertEquals(0,GetPrimeNums.primeNums(3));
	}
	@Test
	public void test4(){
		assertEquals(-1,GetPrimeNums.primeNums(4));
	}
	@Test
	public void test5(){
		assertEquals(0,GetPrimeNums.primeNums(5));
	}
	@Test
	public void test6(){
		assertEquals(-1,GetPrimeNums.primeNums(6));
	}
	@Test
	public void test7(){
		assertEquals(0,GetPrimeNums.primeNums(7));
	}
	@Test
	public void test8(){
		assertEquals(-1,GetPrimeNums.primeNums(8));
	}
	@Test
	public void test9(){
		assertEquals(-1,GetPrimeNums.primeNums(9));
	}
}
