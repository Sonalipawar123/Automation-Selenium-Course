
public class ForLoopWithArray {

	public static void main(String[] args) {

		
		int a[] ={1,2,3,4,5};
        int b[] ={6,7,8,9,10};
        
        int j = b.length - 1;
        // initialization; condition; increament/decrement;
        
        for(int i=0; i < a.length; i++)
        {
            System.out.print(a[i] + "  ");
            System.out.println(b[i]);
            j--;
        }
	}

}
