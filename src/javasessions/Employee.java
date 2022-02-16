package javasessions;

import jdk.jfr.internal.JVM;

public class Employee {

			String name;
		int age;
		double salary;
		
		public static void main(String[] args) {
		
		//Create object inside main method
			Employee e1 = new Employee();
			e1.name = "Ganguly"; //Here, name, age and salary are properties of object e1
			e1.age = 35;
			e1.salary = 12345;
			
			Employee e2 = new Employee();
			e2.name = "Ram";
			e2.age = 29;
			e2.salary = 124;
			
			Employee e3 = new Employee();
			e3.name = "Naveen";
			e3.age = 36;
			e3.salary = 34000000;
			
			System.out.println(e1.name + " "+e1.age+ " "+e1.salary);
			System.out.println(e2.name + " "+e2.age+ " "+e2.salary);
			System.out.println(e3.name + " "+e3.age+ " "+e3.salary);
			
			e1 = e2;
			System.out.println(e1.name + " "+e1.age+ " "+e1.salary);
			System.out.println(e2.name + " "+e2.age+ " "+e2.salary);
			System.out.println(e3.name + " "+e3.age+ " "+e3.salary);
			
			e2=e3;
			System.out.println(e1.name + " "+e1.age+ " "+e1.salary);
			System.out.println(e2.name + " "+e2.age+ " "+e2.salary);
			System.out.println(e3.name + " "+e3.age+ " "+e3.salary);
			
			e3=e1;
			System.out.println(e1.name + " "+e1.age+ " "+e1.salary);
			System.out.println(e2.name + " "+e2.age+ " "+e2.salary);
			System.out.println(e3.name + " "+e3.age+ " "+e3.salary);
			
			//An object can have multiple references
			
			// Here, now e1 doesn't have a reference variable, this is called no object reference in object oriented language like java. i.e, there is an object with no reference variable.
			new Employee().name = "Nivya";
			new Employee().salary = 23.45;
			
		// The above 2 are no object reference. Its not a good practice to create an object with no reference.
			
		//	We have Garbage collector and JVM.class JVM will keep monitoring the heap memory/heap size. When heap size runs out when you keep creating the object, JVM 	will send an instruction to the Garbage Collector to destroy all objects with no reference or null reference.
		// Null reference - 
			//Garbage collector will come inside the heap (GB cannot come inside stack. It is designed only and only for Heap memory). GB will start destroying all objects without object reference. It will not touch any object witha reference. This is called deallocation of memory
			//Allocation of memory is - With help of new keyword, you allocate some memory for the object. GB will deallocate the memory. This is auto mechanism. It is internally decided by Java and JVM controls it.
			//Java has given you a method if you really wants to call GC by your own, you can use
			System.gc(); //Calls GC
			// Calling System.gc()  will not destroy the objects with no reference. It depends on JVM, This will only initiate a call to JVM saying the user wants to clear the memory. If JVM really feels that GC should be called, then only garbage collector will be called and objects with no reference would be destroyed.
			
			//Null reference object:
			Employee e4 = new Employee();
			e4 = null;
			//Here e4 is now pointing to null. the object created now doesn't have a reference. Such kind of object is called null reference object
		//	GC is eligible to destroy both no object reference and null reference objects
			System.out.println(e4.name); //This will throw null pointer exception. Reference is created but reference somehow got null. 
	}

}
