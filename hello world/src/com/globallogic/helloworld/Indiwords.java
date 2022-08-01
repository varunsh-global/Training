package com.globallogic.helloworld;

import java.util.*;

/* Program to reverse individual words in a string seperated by delimeter */

public class Indiwords {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String st=",.' 	";
	    int i=0;
	    String str="";
	    for(int j=0;j<s.length();j++){
	    	if(st.contains(s.charAt(j)+"")==true){
	    		StringBuffer sb=new StringBuffer(s.substring(i,j));
	    		str+=((sb.reverse()).toString())+s.charAt(j);
	    		i=j+1;
	    	}
	    	}
	    StringBuffer sb=new StringBuffer(s.substring(i));
		str+=sb.reverse();
		System.out.println(str);
		sc.close();
	}
}
