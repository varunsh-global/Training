package com.globallogic.sets;
import java.util.Comparator;


class Sortid implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getId()>o2.getId()){
			return 1;
		}
		else if(o1.getId()<o2.getId()){
			return -1;
		}
		else{
			return 0;
		}
	}
	
}
public class sortbyid {

}