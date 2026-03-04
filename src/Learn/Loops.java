package Learn;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//while loop
		
		int i = 1;

		while (i <= 10) {
		    System.out.println("10 x " + i + " = " + (10 * i));
		    i++;
		}
		
		//for loop
		
		for(i=1; i<=10; i++) {
			System.out.println("15 x " + i + " = " + (15 * i));
		}
		 //for each loop
		
		String[] names = {"Alice", "Bob", "Charlie"};

		for (String name : names) {
		    System.out.println(name);
		}

		//patterns
		
         int n = 5;
         for(int k=1;k<=n; k++) {
		
		for(int j=1; j<=n; j++)
		{
			System.out.print("& ");
		}
		System.out.println( );

		}

	
	
	n = 10; 
	 for(int k=1; k<=n; k++) {
			
			for(int j=1; j<=k; j++)
			{
				System.out.print("& ");
			}
			System.out.println( );
	 }
}
}


