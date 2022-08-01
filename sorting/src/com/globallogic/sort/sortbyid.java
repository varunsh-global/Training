package com.globallogic.sort;
import java.util.*;


class SortRollno implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.getRollno()>o2.getRollno()){
			return 1;
		}
		else if(o1.getRollno()<o2.getRollno()){
			return -1;
		}
		else{
			return 0;
		}
	}
	
}
public class sortbyid {

}
