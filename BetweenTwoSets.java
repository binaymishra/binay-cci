
/**
* https://www.hackerrank.com/challenges/between-two-sets/problem
*
* Binay Mishra<binaymishramca@gmail.com>
* 
*
* 	1. find the LCM of all the integers of array A.
*	2. find the GCD of all the integers of array B.
*	3. Count the number of multiples of LCM that evenly divides the GCD.
*
*
*
* 
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class BetweenTwoSets {

	public static void main(String[] rgs) {

		// 10 10
		// 100 99 98 97 96 95 94 93 92 91
		// 1 2 3 4 5 6 7 8 9 10
		// Expected Output 0

		// 3 2
		// 2 3 6
		// 42 84
		// Expected Output 2

		List<Integer> a = Arrays.asList(100, 99, 98, 97, 96, 95, 94, 93, 92, 91);
		List<Integer> b = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		int count = getTotalX(a, b);
		System.out.println("count = " + count);

	}

	 public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here

	 	int a_gcd = gcdIntegers(a);
	 	System.out.println("a_gcd = " + a_gcd);
	 	int a_lcm = lcmIntegers(a);
	 	System.out.println("a_lcm = " + a_lcm);

	 	int b_gcd = gcdIntegers(b);
	 	System.out.println("b_gcd = " + b_gcd);

	 	int count = 0;
	 	
	 	for(int i=a_lcm; i<=b_gcd; i+=a_lcm) {
	 		if(b_gcd % i == 0) {
	 			System.out.printf("%d mod %d\n", a_gcd, i);
	 			count++;
	 		}
	 	}

	 	return count;

    }


    public static int gcdIntegers(List<Integer> arr) {
		if (null == arr || arr.size() == 0)
			return 0;
		else {
			int gcd = arr.get(0);
			for(int i=1; i<arr.size(); i++) {
				gcd = gcd(gcd, arr.get(i));
			}
			return gcd;
		}
	}

    public static int gcd(int a, int b) {
		if ( a == 0 || b == 0) {
			return (a + b);
		}
		return gcd(b % a, a);
	}

	public static int lcmIntegers(List<Integer> arr) {
		if (null == arr || arr.size() == 0)
			return 0;
		else {
			int lcm = arr.get(0);
			for(int i=1; i<arr.size(); i++) {
				lcm = lcm(lcm, arr.get(i));
			}
			return lcm;
		}
	}

	public static int lcm(int a, int b) {
		int gcd = gcd(a, b);
		int lcm = (a * b) / gcd;
		return lcm;
	}
}