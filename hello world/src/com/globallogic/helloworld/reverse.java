package com.globallogic.helloworld;

import java.util.Scanner;

public class reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch;
		String nest = "";
		for(int i=str.length()-1;i>=0;i--){
			ch = str.charAt(i);
			nest = nest+ch;
		}
		System.out.println("Reverse string: "+ nest);
	}
}
