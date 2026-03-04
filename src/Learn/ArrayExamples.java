package Learn;

public class ArrayExamples {

	public static void main(String[] args) {
		int [] numbers = {2,56, 56, 64};
	String[] names = {"mathew", "jonas", "meghana"};
		System.out.println("first index number is" +" "+ numbers[0]);
		System.out.println("Second index name is" +" "+ names[1]);
		char[] vowels = {'a', 'e' ,'i','o','u'};
        String str1 = "This is sample string";
		
		//create the array of words from above string
		
		String[] words = str1.split(" "); // {"This","is"."sample","string"}
	 System.out.println(words[2]);
	 System.out.println(words[3]);
	 String str2 = "Today is Sunday and I am feeling lucky";
		
		//String out1 = "Today is Sunday";
		//String out2 = "I am feeling lucky";
		                                                       
		String out1 = str2.split("and")[0];    //{"Today is Sunday", "I am feeling lucky"}
		String out2 = str2.split("and")[1];
		
		System.out.println(out1.trim()); //trim() used to remove spaces at the beginning and end
		System.out.println(out2.trim());
		
		 String str3 = "Today is Sunday and I am feeling lucky";
		 String[] outSplit = str3.split(" ");
		System.out.println(outSplit[1]);
		System.out.println(str3);
		String split1 = str3.split(" ")[3];
		System.out.println(split1);
		
		String str4 = "Today is Sunday and I am feeling lucky";
		String[] outSplit1 = str4.split("(?=\\band\\b)"); //Split the string at a position where the next word is exactly and, but do not remove and from the result.

		for (String part : outSplit1) {
		    System.out.println(part.trim());
		}


	}

}
