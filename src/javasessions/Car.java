package javasessions;

public class Car {
	
	String name = "Honda"; //This is not a good practice to declare the class/global variable with a value.
	//Global or Class variables.Properties of Car class are called variables. The variables defined outside of main method is Global variables and that defined inside the method is local variable. Local variables cannot be called outside of the method and same way global variables also cannot simply be called inside another method
	int price;
	String model;
	String color;
	
	//Global variables will be available throughout the program. In order to access the class variable/class properties/global variable you have to create an object of the same and then access it using the object reference name.
	
	public static void main(String[] args) {
	String name = "Nageena";
	 System.out.println(name); //Local variable
	 
	 //Create Object - Use new keyword
	 
	 Car obj = new Car(); // Here object is RHS i.e, new Car() and obj is the object reference name. Type of this object is Car (non primitive), ie., the class. 
	 //That is y Car c = new Car();
	 obj.name = "BMW";
	 obj.price = 700000;
	 obj.model = "520c";
	 obj.color = "White";
	System.out.println(obj.name);
	System.out.println(obj.name + " " + obj.price + " " + obj.model+ " " + obj.color);
//On creating an object, java will create a photocopy of all the class variables and give it to object.
	
	//There is no limitation in creating an object for class
	//Object reference name cannot be same, it should be different
	
	Car obj1 = new Car();
	System.out.println(obj1.name + " " + obj1.price + " " + obj1.model+ " " + obj1.color);
	//If value is not initialized, you will get the default value i.e, String gives null value and integer returns 0 value.
	
	Car obj2 = new Car();
	obj2.name = "Audi";
	obj2.model = "Q5";
	
	System.out.println(obj2.name + " " + obj2.price + " " + obj2.model+ " " + obj2.color);
	
		
	}

}
