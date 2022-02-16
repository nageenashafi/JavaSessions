package javasessions;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//If you want to store multiple values in the same variable, use array. Primitive datatypes can store only one value at a time
		//Array:
		//Used to store multiple similar type of data/values. i.e, all integers should be stored in an int array, all strings should be stored inside a string array, a double in a double array, all chars in a char array
		
		
		//How to declare an array
		
		//1. Create an integer array. Variable with one square bracket [] is known as an array variable
		
		 int a[] = new int[4]; //If you want to an array to store 4 variables. This will create 4 sections in memory for variable a. 
		 //Here 4 is the length or size of array.
		 //Since integer type, memory allocation is 4 bytes each so total 4*4 = 16 bytes
		 //For an array, it is always a continuous memory allocation.
		 //li = 0
	     //len = 4
		 //hi = len - 1 = 3
		 //len = hi+1 = 4
		 
		 a[0] = 10;
		 a[1] = 20;
		 a[2] = 30;
		 a[3] = 40;
		 
		System.out.println(a[0]);
		System.out.println(a[3]);
	//	System.out.println(a[4]); //This will give AIOB - Array Index Out of Bound Exception. Reason for this exception is a[4] doen't even exist in memory. There is no memory allocation for a[4] 
		
	//	a[4] = 50; //AIOB in this step itself. while trying to store the value since a[4] doen't even exist, AIOB is displayed
	//	System.out.println(a[4]);
	//	System.out.println(a[-1]);//AIOB. In Java, negative indexing is not allowed. the lowest index should always start with 0. This is possible in Python. Itis called concept of slicing. We can go in backward direction.
		
		System.out.println(a[0]+a[2]);//40
		//to print all the values of array - use for loop - Index based for loop
		
		System.out.println("-------------------");
		for(int i=0; i<4; i++)
		{
		
		System.out.println(a[i]);

	}
		System.out.println("-------------------");
		//use the variable length to get the length of array
		System.out.println(a.length);
		System.out.println("-------------------");
		for(int j=0; j<a.length;j++)
		{
			System.out.println(a[j]);
		}
		System.out.println("-------------------");
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("-------------------");
		int len=a.length;
		for(int i=0; i<=len-1; i++)
		{
			System.out.println(a[i]);
		}
		
		//For each loop. Also known as enhanced loop
		//Syntax - Check for type of data in array. i.e, since here it is integer, write int. Write any variable say representing an element. Put a colon:.then write array variable name without sqaure bracket
		
		System.out.println("------using For Each loop/Enhanced for loop-------------");
		
		for(int e: a)
		{
			System.out.println(e);
		}
		//Performance is almost the same.
		
		//we use a.length for static array to get the size of array. In Array list, we use .size() to get the size of array
		
		System.out.println("----------Display numbers in reverse order-------------");
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.println(a[i]);
		
		}
		
		//limitations of array
			//1. the size of array is fixed/static --> which in turn causes either limited space or wastage of space. To overcome this, we use dynamic array
				//2. Stores only similar type of data. 
		
		System.out.println("-------");
		System.out.println(a);
		System.out.println("-------------");
		System.out.println(Arrays.toString(a));
		
		//double array
		
		System.out.println("-------------");
		
		double d[] = new double[2];
		d[0]=12.33;
		d[1]=23.44;
		for(double e:d)
		{
			System.out.println(e);
		}
		System.out.println(Arrays.toString(d));
		
		//Character array
		
		System.out.println("-------------");
		
		char c[] = new char[4];
		c[0] = 'a';
		c[1]='b';
		c[2]='1';
		c[3]='2';
		System.out.println(c[0]+c[1]);
		System.out.println(c[1]+c[2]);
		System.out.println(c[2]+c[3]);
		System.out.println(Arrays.toString(c));
		
		System.out.println("-------------");
		
		//String array
		String emp[] = new String[3];
		emp[0] = "Naveen";
		emp[1] = "Tom";
		emp[2] = "Krish";
		for(String e:emp)
		{
			System.out.println(e);
		}
		System.out.println("-------------");
		System.out.println(Arrays.toString(emp));
		
		System.out.println("-------------");
		
int b[] = {1,2,3,4};
System.out.println(b[3]);
String str[] = new String[5];
str[1] = "Java";
System.out.println(str[0]);
System.out.println(str[1]);
System.out.println(str[2]);
String str2[] = {"Jack", "And", "Jill Went"};
System.out.println(str2[0]);
//System.out.println(str2[3]); //AIOB

System.out.println("-------------");

//Object array
//Any type of data can be stored in an object array
Object student[] = new Object[5];
student[0]="Nageena";
student[1]="33";
student[2]="Female";
student[3]="200000";
student[4]="Software Lead";
for(int i=0;i<student.length;i++)
{
	System.out.println(student[i]);
}
System.out.println("-------------");

Object student1[]= new Object[6];
student1[0] = "Shan";
student1[1] = "39";
student1[2]="Male";
student1[3]="300000";
student1[4]="true";

for(Object e:student1)
{
	System.out.println(e);
}

System.out.println(Arrays.toString(student1));

//default values
//int/long/short/byte: 0
//double or float : 0.0
//boolean : false
//character: space
//String : null
//Object : null
//For every class, default value of all the classes is null. Object is a class, String is a class. Default value is null.

}
}
