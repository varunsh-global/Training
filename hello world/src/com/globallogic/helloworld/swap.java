package com.globallogic.helloworld;

import java.lang.Math;
import java.util.Scanner;



public class swap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		b = a+b;
		a = Math.abs(a-b);
		b = Math.abs(a-b);
		System.out.printf("After swapping a and b are: " + a+" "+b);
	}

}
