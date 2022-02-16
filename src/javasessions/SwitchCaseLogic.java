package javasessions;

public class SwitchCaseLogic {

	public static void main(String[] args) {
		
		String browser1 = "chrome";
		
		switch (browser1) {
		case "chrome":
			System.out.println("Launch chrome");
			break;
		case "ff":
			System.out.println("launch firefox");
		break;
			
		case "safari":
			System.out.println("launch safari");
			break;
			
		case "ie":
			System.out.println("launch ie");
			break;
			
		default:
	System.out.println("Please enter correct browser " + browser1);
			break;
		}
		
		// Use .toLowerCase() to convert the string to lowercase
		
		String browser2 = "FireFoX";
					
			switch (browser2.toLowerCase()) {
			case "chrome":
				System.out.println("Launch chrome");
				break;
			case "firefox":
				System.out.println("launch firefox");
			break;
				
			case "safari":
				System.out.println("launch safari");
				break;
				
			case "ie":
				System.out.println("launch ie");
				break;
				
			default:
		System.out.println("Please enter correct browser " + browser2);
				break;
					 
		}
			
			//Use .ignoreCase() to ignore the case and compare

	/*		String browser3 = "SaFaRi";
			
			switch (browser3.IgnoreCase()) {
			case "chrome":
				System.out.println("Launch chrome");
				break;
			case "firefox":
				System.out.println("launch firefox");
			break;
				
			case "safari":
				System.out.println("launch safari");
				break;
				
			case "ie":
				System.out.println("launch ie");
				break;
				
			default:
		System.out.println("Please enter correct browser " + browser3);
				break;
					 
		} */
			
			/* 
			Use .toUpperCase() to convert to upper case. Make sure the case is written in uppercase. If not, when the browser value is passed, it will be converted ti upper case and when tries to match the case values which ic not in upper case, a different result will be generated
			Use .trim() to remove the leading and trailing spaces
			i.e, .toUpperCase().trim()
			 */
			
			String browser4 = " Internet Explorer ";
					
					switch(browser4.toUpperCase().trim())
					{
					case "CHROME":
						System.out.println("Launch Chrome");
						break;
						
					case "FIREFOX":
						System.out.println("Launch Firefox");
						break;
						
					case "SAFARI":
						System.out.println("Launch Safari");
						break;
						
					case "INTERNET EXPLORER":
						System.out.println("Launch IE");
						break;
						
						default:
							System.out.println("Please pass correct browser");
						break;
						
					}
						//Remove space in between using replace() method.
						
						String browser5 = " Inter net Expl orer ";						
						
						
						switch(browser5.toUpperCase().replace(" ",""))
						{
						case "CHROME":
							System.out.println("Launch Chrome");
							break;
							
						case "FIREFOX":
							System.out.println("Launch Firefox");
							break;
							
						case "SAFARI":
							System.out.println("Launch Safari");
							break;
							
						case "INTERNETEXPLORER":
							System.out.println("Launch IE");
							break;
							
							default:
								System.out.println("Please pass correct browser");
							break;
						
					}
						
						//Switch case with integer value
						
						int total = 100;
						switch (total)
						{
						case 100:
							System.out.println("A++");
							break;
						case 90:
							System.out.println("A");
							break;
							default:
							System.out.println("Fail");
							break;
						}
						
						//We cannot write a conditional statement in Switch. So in that case, we need to use a nested if condition.
						
						/* Practical examples of Switch case - where it can be used
						 1. User level i.e, admin/supervisor/approver etc , RBAC/Permission
						 2. Test Environments - Dev, Staging, QA, PRe-prod/Prod
						 3. cross browser
						 4. cross devices
						 5. cross cloud: when you want to run your test cases in MS Azure, AWS, GCP, LOCAL machine, Docker etc 
						 6. Localization - multiple languages testing
						 
						 */
						
	} 
	
}
