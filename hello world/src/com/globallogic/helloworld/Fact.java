package com.globallogic.helloworld;
import java.util.*;

public class Fact {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==0 || n==1){
			System.out.println(1);
		}
		int ans = n;
		while(n>1){
			n--;
			ans = ans*(n);
		}
		System.out.println(ans);
	}
}
