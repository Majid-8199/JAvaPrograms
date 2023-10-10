package Exersice;

import java.util.Scanner;

public class PrimeNumber 
	{
		public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int x=0,a= sc.nextInt();
		if(a==0 || a==1) {
			System.out.println(a+" is not a Prime Number.");
		}
		else {
			for(int i=2;i<a/2;i++) {
				if(a%i==0) {
				System.out.println(a+" is not a Prime Number.");
				x=1;
				break;
					}
				}
			}
		if(x==0) {
			System.out.println(a+" is a Prime Number.");
			}
		}
	}