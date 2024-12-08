package com;

import java.util.*;
import java.math.*;
import java.util.Random;
import java.util.*;


public class RSA2 {
	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the two prime numbers");
		int p= sc.nextInt();
		int q = sc.nextInt();
		int n = p*q;
		int fi =(p-1)*(q-1);
		System.out.println("Enter the value of e:");
		int e = sc.nextInt();
		while(true) {
			if(findGCD(fi,e)!=1) {
				System.out.println("Enter the valid e value:");
				e =sc.nextInt();
			}else
				break;
		}
			int d = findD(e,fi);
			System.out.println("value of d"+d);
			System.out.println("Enter plain text(numbers)");
			int m= sc.nextInt();
			int c =(int)(Math.pow(m,e)%n);
			System.out.println("cypher text is"+c);
			int x=(int)(Math.pow(c, d)%n);
			System.out.println(" "+x);
			if(x==m) {
				System.out.println("input mathed");
				
			}else {
				System.out.println("input mismathed");
			}
			
		}
		static int findD(int e,int fi) {
			int b;
			for(int i=1;i<=fi;i++) {
				b=(i*e)%fi;
				if(b==1)
					return i;
			}
			return 0;
		}
		
		static int findGCD(int number1,int number2) {
			if(number2==0) {
				return number1;
			}return findGCD(number2,number1%number2);
		}
	}


