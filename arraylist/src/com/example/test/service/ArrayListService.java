package com.example.test.service;

import java.util.Comparator;

import com.example.test.data.Person;

public interface ArrayListService<T extends Person> {
	void insertFirst(T data);
	void insertLast(T data);
	void insertDataAtPosition(int position,T data);
	T getItemAtFirstPosition();
	T getItemAtPosition(int position);
	boolean containsObject(T object);
	void printAllItems();
	void sortTheList(Class<?> comparator);
}
