package com.example.test.service.sort;

import java.util.Comparator;

import com.example.test.data.Person;

public class SortByEmployeeName<T extends Person> implements Comparator<T> {

	@Override
	public int compare(T o1, T o2) {
		if(o1 == null || o1.getName() == null)
			return 0;
		else if(o2 == null || o2.getName() == null)
			return 0;
		else{
			return  o1.getName().compareToIgnoreCase(o2.getName());
		}
	}

}
