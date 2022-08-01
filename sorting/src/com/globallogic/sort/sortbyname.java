package com.globallogic.sort;
import java.util.*;

class Sortname implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

public class sortbyname {

}
