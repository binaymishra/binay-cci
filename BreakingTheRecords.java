/**
*
* https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
*
*  Binay Mishra <binaymishramca@gmail.com>
* 
* 
*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class BreakingTheRecords {

	public static void main(String[] args) {

		int[] scores = {10, 5, 20, 20, 4, 5, 2, 25, 1};

		int[] result = breakingRecords(scores);

		System.out.println(Arrays.toString(result));

	}

	 // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {

    	if(null == scores || scores.length == 0)
    		return new int[2];

    	int[] result = new int[2];
    	int min = scores[0];
		int max = scores[0];
		int countMax=0;
		int countMin=0;

    	for (int i=1; i<scores.length; i++) {

    		if(scores[i] < min ) {
    			min = scores[i];
    			countMin++;
    		}

    		if(scores[i] > max) {
    			countMax++;
    			max = scores[i];
    		}

    	}

    	result[0] = countMax;
    	result[1] = countMin;

    	return result;
    }

}