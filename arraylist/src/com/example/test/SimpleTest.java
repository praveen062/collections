package com.example.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.example.test.simpleservice.ArrayListOperationsService;
import com.example.test.simpleservice.ArrayListOperationsServiceImpl;

public class SimpleTest {
	private static  ArrayListOperationsService service ;
	public static void main(String[] args) throws IOException {
		service = new ArrayListOperationsServiceImpl();
		System.out.println("Program is Running...................");
		System.out.println("Press 'C' to continue... ");
		System.out.println("Press E to exit.");
		String controlEnter= getInputFromConsole();
		while(controlEnter.equals("")){
			controlEnter= getInputFromConsole();
		}
		if(!controlEnter.equals('E')){
			menuOptions();
		}
		System.out.println("Successfully Exited");
	}
	
	private static void menuOptions() throws IOException{
		boolean flag = true;
		while(flag){
			printMenuOptions();
			int choice = getStringAsInteger(getInputFromConsole());
			switch(choice){
			case 1:System.out.println("Enter an item to insert"); 
				service.insert(getInputFromConsole());
				break;
			case 2:
			case 3:
			case 4:
			case 5:
			case 6: service.printAllListItems();
				break;
			case 10: flag = false;
			break;
			default: break;
			}
		}
	}
	
	private static void printMenuOptions(){
		System.out.println("Select Options given below");
		System.out.println("1. Insert Item");
		System.out.println("2. Insert Item at location 0");
		System.out.println("3. Insert Item at particular location");
		System.out.println("4. Print First Element");
		System.out.println("5. Print Last Element");
		System.out.println("6. Print all Elements in list");
		System.out.println("7. Print Item At particular location");
		System.out.println("10. Exit");
	}
	
	private static int getStringAsInteger(String inputString){
		try{
			return Integer.parseInt(inputString);
		}catch(NumberFormatException e){
			System.out.println("Enter correct choice");
			return -1; 
		}
	}
	
	public static String getInputFromConsole() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputString= br.readLine();
		return inputString;
	}
}
