package com.example.test.simpleservice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.example.test.SimpleTest;

public class ArrayListOperationsServiceImpl implements ArrayListOperationsService {
	private List<String> items;
	
	/**
	 * its always a good idea to code to parent 
	 * i.e., it is also correct you can create 
	 * ArrayList<String> items = new ArrayList<String>
	 * 
	 * its always a best practice to code to parent 
	 * this gives a code a polymorphism 
	 * **/
	public ArrayListOperationsServiceImpl() {
		items = new ArrayList<>();
	}
	
	@Override
	public void insertFirst(String string) {
		if(string != null){
			
		}
	}

	@Override
	public void insertAtSpecificLocation(String string, int location) {
		try{
			nullCheck(string);
			items.add(location,string);
		}catch(NullPointerException e){
			System.out.println(e.getMessage());
			insertAtSpecificLocation(validItem(), location);
		}
	}

	
	/**
	 * @author praveen
	 * @param String
	 * @return void
	 * **/
	@Override
	public void insert(String string) {
		try{
			nullCheck(string);
			items.add(string);
		}catch(NullPointerException e){
			System.out.println(e.getMessage());
			insert(validItem());
		}
	}

	@Override
	public String getFirst() {
		if(items == null || items.size() ==0 ){
			System.out.println("list is empty");
			return "";
		}
		return items.get(0);
	}

	@Override
	public String getLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getItemAtLocation(int location) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printAllListItems() {
		if(items != null && items.size() > 0){
			System.out.println("The ArrayList contents are");
			int i = 0;
			for(String item: items){
				System.out.println(i+" : "+item);
				i++;
			}
		}
		System.out.println();
	}
	
	
	private String validItem(){
		try {
			System.out.println("Enter Correct String");
			return SimpleTest.getInputFromConsole();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return validItem();
		}
	}
	
	private void nullCheck(String string) throws NullPointerException{
		if(string == null || string.equals("")){
			throw new NullPointerException("The item to be inserted cannot be null or empty");
		}
	}
}
