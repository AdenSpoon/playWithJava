package playWithJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class waterBucket {
	public static int[] bucket = {};
	
	public static int coFactor(int[] a) {
		int factor = Integer.MAX_VALUE;
		int new_factor = Integer.MAX_VALUE;
		for(int i = 0;i<a.length; i++) {
			for(int j = i+1; j<a.length;j++) {
			     new_factor = findFactor(a[i],a[j]);
			     if(factor > new_factor)
			    	 factor = findFactor(a[i], a[j]);
			}
		}
		return factor;
	}
	public static int findFactor(int a, int b) {
		if(a<0||b<0) {System.out.println("The method can only find factors belong to positive integers");return -1;}
		while(a!=b) {
		if(a > b) a = a - b;
		 	else  b = b - a;
		}
		return a;
	}
	
	public static int[] minOpArr(int[] Bucket, int coFactor) {
		int[] res =  new int[max(Bucket)+1];
		int b = coFactor;
		Set<Integer> probValue = new HashSet<Integer>();
		Queue<ArrayList<Integer>> bfsQue = new LinkedList<ArrayList<Integer>>();
		
		while(b<=max(Bucket)){
			res[b] = Integer.MAX_VALUE;
			b += coFactor;
		}
		for(int i=1; i<res.length; i++) {
			if(res[i]==0) res[i] = -1;
			else probValue.add(i);
		}
		int step = 0;
		while(!probValue.isEmpty()) {
			step++;
			
			
		}
		
		return res;
	}
	public static Queue<ArrayList<Integer>> bfsHelper(Queue<ArrayList<Integer>> bQueue) {
		
		return bQueue;
	}
	
	public static int max(int[] a) {
		int max = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			max = max<a[i]?a[i]:max;
		}
		return max;
	}

	public static void main(String[] args) {
		waterBucket.bucket = new int[]{3,6,9};
		//System.out.println(waterBucket.coFactor(bucket));
		int[] res = waterBucket.minOpArr(bucket, waterBucket.coFactor(bucket));
		for(int i=1; i<res.length; i++)
			System.out.println(res[i]);

		
		
	}
	
	

}
