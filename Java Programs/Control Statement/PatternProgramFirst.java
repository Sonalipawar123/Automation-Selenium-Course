package ControlStatementProgram;

public class PatternProgramFirst {

	public static void main(String[] args) {
// Asending order star pattern program
		
        for(int i=0; i < 5; i++)
        {
            for(int j=4; j >= i; j--)
            {
                System.out.print("*");    
            }
                System.out.println();
        }
	}

}
