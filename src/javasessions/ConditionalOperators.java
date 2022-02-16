package javasessions;

public class ConditionalOperators {

	public static void main(String[] args) {

		// Any number starting with 0 is octal number. Base of octal no is 8 and decimal
		// is 8

		byte b = 056; // 0*8^2+5*8^1+6*8^0 = 46
		System.out.println(b);
		byte c = 065; // 0*8^2+6*8^1+6*8^0 = 53
		System.out.println(c);
		// byte d= 098; - This gives error. The range of octal number is 1-7. Every
		// digit should be less than 8

		// Conditional Operators or Statement
		// Whenever a comparison has to be done using 2 primitive data types, you need
		// to use ==. This always represent boolean value. It gives a true or false.

		int a = 10;
		int d = 20;
		System.out.println(a == b);

		int e = 10;
		int f = 10;
		System.out.println(e == f);

		// inside an if condition paranthesis should always contain a boolean value
		// comparison operator - ==
		if (a == b) {
			System.out.println("PASS");

		} else {
			System.out.println("FAIL");
		}

		if (e == f) {
			System.out.println("This is PASS");
		} else {
			System.out.println("This is FAIL");
		}

		// Dead Code : Else part is never executed. So else part is never executed,
		// hence else part is a dead code

		if (true) {
			System.out.println("Hi");
		} else {
			System.out.println("Bye");
		}

		boolean flag = true;
		if (flag) {
			System.out.println("Selenium");
		} else {
			System.out.println("UFT");
		}
		flag = false;
		if (flag)
			System.out.println("Selenium");
		else
			System.out.println("UFT");

		double d1 = 12.33;
		double d2 = 12.34;
		if (d1 == d2) {
			System.out.println("Both are equal");
		} else
			System.out.println("d1 and d2 are not equal");

		String s1 = "Hello";
		String s2 = "Hello";
		// String is a class and class is coming under non-primitive category. Always
		// use a .equals method for non-primitive comparison. Never use a == for string
		// comparison.
		if (s1.equals(s2)) {
			System.out.println("Both are equal");
		} else {
			System.out.println("Both are not equal");
		}

		String s3 = "Hello ";
		if (s1.equals(s3))
			System.out.println("Both are equal");
		else
			System.out.println("Both are not equal");
		String s4 = "HEllo";
		if (s1.equals(s4))
			System.out.println("Equals");
		else
			System.out.println("s1 and s4 not equal");
		if (s1.equalsIgnoreCase(s4))
			System.out.println("s1 and s4 are equal");
		else
			System.out.println("Not equal");

		if (s1 == s2) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		// Conditional operator <=
		int total = 90;
		if (total <= 90)
			System.out.println("Grade A");
		else
			System.out.println("Grade B");
		int total2 = 95;
		// Nested if
		if (total2 <= 100) {
			if (total2 >= 95)
				System.out.println("Grade A+");
		} else
			System.out.println("Grade A");
		int total3 = 85;
		if (total3 <= 100) {
			if (total3 >= 95)
				System.out.println("Grade A+");
			else
				System.out.println("Grade A");
		}
String browser = "chrome";
if(browser.equals("chrome"))
{
	System.out.println("launch chrome");
}
if(browser.equals("ff"))
		{
	System.out.println("launch ff");
		}
if(browser.equals("safari"))
		{
	System.out.println("launch safari");
		}
		if(browser.equals("ie"))
		{
			System.out.println("launch ie");
		}
		else
			System.out.println("Please pass the correct browser");
	}

}
