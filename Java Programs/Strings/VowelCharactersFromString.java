package StringProgramWithMethods;

public class VowelCharactersFromString {

	public static void main(String[] args) 
	{

       String s=new String();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the string");
		 s=sc.nextLine();
		 int vowel = 0;
      for(int i=0;i<s.length();i++)
	{
	     char ch=s.charAt(i);
	     if(ch!=' ')
	     {
	     
	    if((ch=='a')|| (ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
	   
	       vowel++;
		}
	     System.out.println("vowels="+vowel);
	
	}

}
