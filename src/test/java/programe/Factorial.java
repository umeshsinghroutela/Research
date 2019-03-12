package programe;

import org.testng.annotations.Test;

import java.math.BigInteger;

public class Factorial {

	@Test
	public static void test() {
		int num=25;
		BigInteger bi = BigInteger.valueOf(num);

		System.out.println(""+ findFactoral(num));
		System.out.println(""+ findFactoral1(bi));
	}

	private static long findFactoral(int n) {

		if (n == 0 || n ==1) {
			return 1;
		}
		else{
			return n*findFactoral(n-1);
		}
	}

	private static BigInteger findFactoral1(BigInteger bigInteger) {

		if ( bigInteger.equals(BigInteger.ZERO) || bigInteger.equals(BigInteger.ONE)) {
			return BigInteger.ONE;
		}
		else{
			return bigInteger.multiply(findFactoral1(bigInteger.subtract(BigInteger.ONE)));

		}
	}
}
	





