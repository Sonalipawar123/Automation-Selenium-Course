package ControlStatementProgram;

//weekday number to calculate the weekday name
public class SwitchCaseExample {

	public static void main(String[] args) {
		
		int day =8;
		
	switch(day)
		{
		 case 1:
		     System.out.println("Monday");
		     break;
		 case 2:
			 System.out.println("Tuesday");
			 break;
		 case 3:
			  System.out.println("Wednesday");
				break;
		 case 4:
			  System.out.println("Thursday");
				break;
		 case 5:
			  System.out.println("Friday");
				break;
		 case 6:
			  System.out.println("Saturday");
				break;
		 case 7:
			  System.out.println("Sunday");
			  break;
	
			  
// there is no match then go the dafult			  
       default:
        	 System.out.println("Looking forward to the weekend");

		}
	}

}
