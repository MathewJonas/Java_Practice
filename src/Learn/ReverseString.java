package Learn;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "I'm Studing the Automation Testing";
		// *String out = "sihT si noitamotuA gnitseT sretsaM margorP";

		String[] arr1 = str1.split(" ");

		for (String name : arr1) {
			printReverse(name);
			System.out.print(" ");
		}

	}

	public static void printReverse(String str1) {
		
		String result = "";
		
		for (int i = str1.length() - 1; i >= 0; i--) {
			result = result + str1.charAt(i);
		}

		System.out.print(result);
	}
}

