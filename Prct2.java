package com.java.Devika;

import java.util.Scanner;

public class Prct2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		System.out.println("check prime number");
		System.out.println(isPrime(m));
		System.out.println("twinning");
		isTwin(m);
		System.out.println("abto n");
		isPrim(m);
		System.out.println("range between");
		isPrime(n,m);
		System.out.println("sum of prime number");
		isSumPrime(m);

	}

	private static void isSumPrime(int m) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int j=2;j<=m;j++) {
			if(isPrime(j)) {
			sum+=j;
			}
		}System.out.println(sum);
		
	}

	private static void isPrime(int n, int m) {
		// TODO Auto-generated method stub
		for(int i=n;i<=m;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
		
	}

	private static void isPrim(int n) {
		// TODO Auto-generated method stub
		for(int i=2;i<=n;++i) {
			if(isPrime(i)) {
				System.out.println(i);
			};
			
		}
	}


	private static void isTwin(int n) {
		// TODO Auto-generated method stub;
		for(int i=2;i<=n;i++) {
		if(isPrime(i)&&isPrime(i+2)) {
			System.out.println(i+" "+(i+2));
		}
		}
		
	}

	private static boolean isPrime(int n) {
		// TODO Auto-generated method stub
		int j=2;int count=0;
		while(j<=n/2) {
			if(n%j==0) {
				count++;
				break;
			}
			++j;	
		}
		 if(count==1) {
			return false;
		}
		else
			return true;
		
		
	}

}
