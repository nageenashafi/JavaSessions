package javasessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
	//ArrayList is an inbuilt class which is already available in java like Ctring class, Object class etc
	//	Arraylist is a kind of collection
		//ArrayList class - default class
		//dynamic array
		//it may store difff types of data i.e, int, double, string , object etc
		
	//Create object of ArrayList
		
		ArrayList ar = new ArrayList();
		
		System.out.println(ar.size());
		ar.add(100);//0
		ar.add(200);//1
		System.out.println(ar.size());
		ar.add("Tom");//2
		ar.add("ABC");//3
		
		//li=0
		//hi=3
		//len/size = hi+1 = 4
				
		System.out.println(ar.size());//4
		ar.add(300);//4
		System.out.println(ar.size());//5
		System.out.println(ar.get(0));//100
	//	System.out.println(ar.get(-1));//Index out of bound exception
	//	System.out.println(ar.get(5));//Index out of bound exception
		
		ArrayList ar1 = new ArrayList(20);
		ArrayList ar2 = new ArrayList(5);
		ar2.add(100);
		ar2.add(200);
		ar2.add("null");
		ar2.add("null");
		
		System.out.println(ar2.size());
		System.out.println(ar2.get(0));
		System.out.println(ar2.get(2));
		System.out.println(ar2.get(3));
		ar2.add(4,300);
//	    ar2.add(9,400);//Index OutofBound exception;Should always be continous memory allocation. ArrayList is order based collection or index based collection. not non order based collection.Always maintains an order
		ar2.add(5,1000);
		System.out.println(ar2.get(4));
		System.out.println(ar2.get(5));
		ar2.add(3, "Replace");
		System.out.println(ar2.get(3));
		ar2.add(6, 1100);
		System.out.println(ar2.get(6));
		System.out.println(ar2.size());
		
		ArrayList prod = new ArrayList();
		prod.add("A");//0
		prod.add("B");
		prod.add("C");
		prod.add("D");//3
		prod.add("E");//4
		System.out.println(prod.size());
		System.out.println(prod.get(3));
		prod.remove(3);
		System.out.println(prod.size());
		System.out.println(prod.get(3));
		
		//Define ArrayList wit Generics
		//int ArrayList
	ArrayList<Integer> marks= new ArrayList<Integer>();//Integer is Wrapper class	
	//marks.add(2.33); not allowed to use any other data type
	marks.add(100);
	ArrayList<Double> sal = new ArrayList<Double>();
	sal.add(12345.66);
	ArrayList<String> empList = new ArrayList<String>();
	empList.add("Tom");
//	empList.add(1); Integer is not supported
 //   empList.add('A');	Character is not supported
	empList.add("Naveen");
	empList.add("Naveen");
	empList.add("Naveen");
	
	//Print Directly
	
	System.out.println(empList);
	
	//Print using for each loop
	
	for(String e:empList)
	{
		System.out.println(e);
	
	}
	for(int i=0;i<empList.size();i++)
	{
		System.out.println(empList.get(i));
	}
	
	ArrayList<Object> empData= new ArrayList<Object>();
	empData.add("Tom");
	empData.add(25);
	empData.add('M');
	empData.add(12345.67);
	empData.add(true);
	
	//to print all the values from arraylist
	for(int i=0; i<=empData.size()-1;i++)
	{
		System.out.println(empData.get(i));
		for(String e:empList)
		{System.out.println(empData);
	}
	
	//for each loop
	for(Object e:empData)
	{
	System.out.println(e);
	
	}
	
	//call empData directly. print arraylist directly
	
		
System.out.println(empData);
	
	
		
		
		

	}

}
}

