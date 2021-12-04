package ControlStatementProgram;

public class PatternProgramsecond {

	public static void main(String[] args) {

		
	//pyramid pattern program	

        for(int i=0; i<5; i++)
        {
            for(int k=4; k>i; k--)
            {
                System.out.print("  ");    
            }
            for(int j=0; j<=i; j++)
            {
                System.out.print(" * ");    
            }
                System.out.println();
        }
    
	}

}
