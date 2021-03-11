

public class GCD {

	/**
	* GCD of two number
	*/
	public static int rGcd(int a, int b) {

		if ( a == 0 || b == 0)
			return (a + b);

		while ( b != 0 ) {

			if (a > b) {
				 a = a - b;
				// a = a % b;
			} else {
				 b = b - a;
				// b = b % a;
			}
		}

		return a;
	}

	/**
	* recursive approach
	*/
	public static int gcd(int a, int b) {
		if ( a == 0 || b == 0) {
			return (a + b);
		}
		return rGcd(b % a, a);
	}

	/**
	* lcm of two numbers a, b is lcm = (a * b) / gcd
	*/
	public static int lcm(int a, int b) {
		int gcd = rGcd(a, b);
		int lcm = (a * b) / gcd;
		return lcm;
	}


	/**
	* main Mehod to run 
	*/
	public static void main(String[] args) {

		int a = 15;
		int b = 3;
		System.out.printf("lcm = (a * b) / gcd : a=%d, b=%d, a * b = %d\n", a, b, (a*b));
		System.out.println("gdc = " + gcd(15, 3));
		System.out.println("lcm = " + lcm(15, 3));
	}
}