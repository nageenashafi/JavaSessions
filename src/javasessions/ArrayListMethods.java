package javasessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		ArrayList<String> empList = new ArrayList<String>();
		empList.add("Naveen");
		empList.add("Tom");
		empList.add("Aarav");
		empList.add("Arnav");
		
		System.out.println(empList);
		
		//To sort. Inbuilt libraries are available
		//Collections class is available. Sort method is available which will automatically sort the entire data or entire list
		
	Collections.sort(empList);
for(int i=empList.size()-1; i>=0; i--)
{
	System.out.println(empList.get(i));
	}
	
	//Or
	
	ArrayList<String> empList1 = new ArrayList<String>();
	empList1.add("Ganguly");
	empList1.add("Dravid");
	empList1.add("Sachin");
	empList1.add("Vettori");
	
	System.out.println(empList1);
	System.out.println("----------------");
	Collections.sort(empList1);
	System.out.println(empList1);
	System.out.println("----------------");
	Collections.sort(empList1, Collections.reverseOrder());
	System.out.println(empList1);
	Collections.sort(empList, Collections.reverseOrder());
	System.out.println(empList);
	
	System.out.println("---------------");
	
	//Merge 2 ArrayLists
	ArrayList<String> trList = new ArrayList<String>();
	trList.add("Richard");
	trList.add("Rhodes");
	trList.add("Akram");
	trList.addAll(empList1);
	System.out.println(trList);

	//Inorder to create an array list and store data using a single statement
	
	ArrayList<Integer> ar = new ArrayList<>();
	List<Integer> data = Arrays.asList(10,20,30);
	System.out.println(data);
	List<String> names = Arrays.asList("Selmu", "Kathu", "Kathy");
	System.out.println(names);
	
	//Static arrays - different ways of declaration
	
	int d[] = new int[3];//new keyword
	d[0] = 10;
	int dd[] = { 1,2,3,4,5,6};
	System.out.println(dd.length);
	int ddd[] = new int[] {22,33,44,55};
	
	System.out.println(ddd.length);
	System.out.println(ddd[2]);
	
	}
	
}

