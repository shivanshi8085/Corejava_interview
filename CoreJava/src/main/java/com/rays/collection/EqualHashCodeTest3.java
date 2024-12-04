package com.rays.collection;

import java.util.ArrayList;
import java.util.List;

public class EqualHashCodeTest3 {
	public static void main(String[] args) {
		
		EqualHashCode e1 = new EqualHashCode(1, "Shivanshi", 120);
		EqualHashCode e2 = new EqualHashCode(1, "Shivanshi", 120);
		EqualHashCode e3 = new EqualHashCode(1, "Shivanshi", 120);
		EqualHashCode e4 = new EqualHashCode(10, "Shivanshi", 120);


		List l = new ArrayList();
		l.add(e1);
		l.add(e4);
		//l.add(e4);
		System.out.println(l);
		l.remove(e2);
		System.out.println(l);
		
	}

}
