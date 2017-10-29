package com.example.test.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.example.test.data.Employee;
import com.example.test.data.Person;
import com.example.test.service.sort.SortByEmployeeName;

public class ArrayListServiceImpl<T extends Person> implements ArrayListService<T>{
	
	private List<T> bucket;
	
	public ArrayListServiceImpl() {
		bucket = new ArrayList<T>();
	}

	@Override
	public void insertFirst(T data) {
		bucket.add(0,data);
	}

	@Override
	public void insertLast(T data) {
		int lastPosition = bucket.size();
		bucket.add(lastPosition, data);
	}

	@Override
	public void insertDataAtPosition(int position, T data) {
		bucket.add(position, data);		
	}

	@Override
	public T getItemAtFirstPosition() {
		return bucket.get(0);
	}

	@Override
	public T getItemAtPosition(int position) {
		return bucket.get(position);
	}

	@Override
	public void printAllItems() {
		Iterator<T> it = bucket.iterator();
		while(it.hasNext()){
			Object ob = it.next();
			if(ob instanceof Employee){
				System.out.println((Employee) ob);
			}
		}
	}
	
	@Override
	public boolean containsObject(T object) {
		return bucket.contains(object);
	}

	@Override
	public void sortTheList(Class<?> comparator) {
		if (comparator != null) {
			switch (comparator.getSimpleName()) {
			case "SortByEmployeeName": 
				System.out.println("sort by name");
				Collections.sort(bucket, new SortByEmployeeName<>());
				break;
			}
		}
	}
}
