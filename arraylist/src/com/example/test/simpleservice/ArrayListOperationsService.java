package com.example.test.simpleservice;

public interface ArrayListOperationsService {
	void insertFirst(String string) throws NullPointerException;
	void insertAtSpecificLocation(String string, int location)throws NullPointerException;
	void insert(String string)throws NullPointerException;
	String getFirst();
	String getLast();
	String getItemAtLocation(int location);
	void printAllListItems();
}
