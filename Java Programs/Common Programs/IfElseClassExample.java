import java.util.Scanner;

public class IfElseClassExample {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter intger value");  //51
		int a= sc.nextInt();
		
		
		if(a%2 != 0)
		{
			System.out.println(a + "is odd number");  //51 is odd number
		}
		sc.close();
	}

}
