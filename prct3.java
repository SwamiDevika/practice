package com.java.Devika;

import java.util.Scanner;

public class prct3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int n= scan.nextInt();
		factor(n);

	}

	private static void factor(int n) {
		// TODO Auto-generated method stub
		for(int i=1;i<=n;++i) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
			
	}

}
