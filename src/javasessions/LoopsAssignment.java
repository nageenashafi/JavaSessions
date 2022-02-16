package javasessions;

public class LoopsAssignment {

	public static void main(String[] args) {
	int i;
	for (i=1; i<=5; i++)
	{
		System.out.println("I am Batman");
	}
	System.out.println("-------------------");
	//for loop
	for (i=1;i<10;i++)
	{
		System.out.println("I am Batman"+i);
	}
	System.out.println("-------------------");
	//while loop
	i=1;
	while(i<10)
	{
	System.out.println("I am Batman"+i);
	i++;
	}
	System.out.println("-------------------");
	//do while loop
	int j=1;
	do
	{
		System.out.println("I am Batman"+j);
		j++;
	}while(j<10);
	
	System.out.println("-------------------");
	
	//Print 10 to 1
		//for loop
		for (i=10;i>0;i--)
		{
			System.out.println(i);
		}
		System.out.println("-------------------");
		int k=10;
		while(k>=1)
		{
			System.out.println(k);
			k--;
		}
		System.out.println("-------------------");
		int l=10;
		do
		{
			System.out.println(l);
			l--;
		}while(l>0);
		System.out.println("-------------------");
		//Hello World using While Loop
		i=1;
		while(i<=10)
		{
			System.out.println("Hello World");
			i++;
		}
		System.out.println("-------------------");
		//print 1 to 10 using while loop but quit if multiple of 7 is encountered
		int m=1;
		while(m<=10)
		{
			if(m%7!=0)
			{
				System.out.println(m);
			}
			else
			{
				break;
			}
				m++;
		}
		}

	
	
	
}
