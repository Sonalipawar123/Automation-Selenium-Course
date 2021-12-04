package StringProgramWithMethods;

public class StringCompareToIgnoreCaseMethod {

	public static void main(String[] args) 
	{
        String str = new String("Selenium");
        String str1 = new String("Selenium");

        int compare1 = str.compareToIgnoreCase(str1);
        System.out.println(compare1);

	}

}
