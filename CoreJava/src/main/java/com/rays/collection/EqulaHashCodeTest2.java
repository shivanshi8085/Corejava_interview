package com.rays.collection;

import java.util.HashSet;
import java.util.Set;

public class EqulaHashCodeTest2 {
	public static void main(String[] args) {
		EqualHashCode e1 = new EqualHashCode(1, "Shivanshi", 120);
		EqualHashCode e2 = new EqualHashCode(1, "Shivanshi", 120);
		EqualHashCode e3 = new EqualHashCode(1, "Shivanshi", 120);
		EqualHashCode e4 = new EqualHashCode(10, "Shivanshi", 120);

		Set s = new HashSet();
		s.add(e1);
		s.add(e2);
		s.add(e3);
		System.out.println(s);
		s.remove(e2);
		//s.add(e4);
		System.out.println(s);

	}

}
