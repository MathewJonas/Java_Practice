package Learn;

import java.util.Scanner;


public class ConditionsJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int y;
		System.out.println("Enter the value of X:");
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		
		System.out.println("Enter the value of X:");

		y = scan.nextInt();
		
		if(x==y) {
			System.out.println("Matched");
		
		}
		else
		{
			System.out.println("not matched");
		}
	//get two strings from user and compare it
	
	String name1;
	String name2;
	System.out.println("enter first name");
	name1 = scan.next();
	System.out.println("enter second name");
	name2 = scan.next();
	if(name1.equals(name2))
	{
		System.out.println("correct");
	}
	else {
		System.out.println("incorrect");
	}
	if(name1.equalsIgnoreCase(name2))
	{
		System.out.println("correct");
	}
	else {
		System.out.println("incorrect");
	}
	
	
	}

}
