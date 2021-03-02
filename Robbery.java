package com.java.Devika;
import java.io.*;
import java.util.*;

	/*
	 * Given a street of N houses (a row of houses), each house having K amount of
	 * money kept inside; now there is a thief who is going to steal this money but
	 * he has a constraint/rule that he cannot steal/rob two adjacent houses. Find
	 * the maximum money he can rob.
	 * 
	 * Example 1:
	 * 
	 * Input: N = 5 , K = 10 Output: 30 Explanation: The Robber can rob from the
	 * first, third and fifth houses which will result in 30. Example 2:
	 * 
	 * Input: N = 2 , K = 12 Output: 12 Explanation: The Robber can only rob from
	 * the first or second which will result in 12. Your Task: You don't need to
	 * read input or print anything. Your task is to complete the function
	 * maximizeMoney() which takes 2 Integers N and K as input and returns the
	 * answer.
	 */

	
		// TODO Auto-generated method stub
		// { Driver Code Starts
		//Initial Template for Java

		

		public class Robbery  {
		    public static void main(String args[]) throws IOException {
		        BufferedReader read =
		            new BufferedReader(new InputStreamReader(System.in));
		        int t = Integer.parseInt(read.readLine());
		        while (t-- > 0) {
		            String St[] = read.readLine().split(" ");
		            int N = Integer.parseInt(St[0]);
		            int K = Integer.parseInt(St[1]);

		            Solution ob = new Solution();
		            System.out.println(ob.maximizeMoney(N,K));
		        }
		    }
		}// } Driver Code Ends


		//User function Template for Java

		class Solution {
		    static int maximizeMoney(int N , int K) {
		        // code here
		        int i=1,count=0;
		        while(i<=N)
		        {
		            i+=2;
		            ++count;
		        }
		         K=count*K;
		        return K;
		    }
		
	}


