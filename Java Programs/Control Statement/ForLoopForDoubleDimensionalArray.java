package ControlStatementProgram;

public class ForLoopForDoubleDimensionalArray {

	public static void main(String[] args) {

        int arr[][] ={{10,20,30}, {40,50,60, 70, 80, 90}};
        // index 1st = 2, index 2nd = 3;
        
        for(int i=0; i < arr.length; i++)
        {
            for(int j=0; j < arr[i].length; j++)
            {
                System.out.println(arr[i][j]);    
            }
        }
    
		
	}

}
