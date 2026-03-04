package Learn;

public class StringsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Mathew Jonas");
		String FName = "Mathew";
		String LName = "Jonas";
		char space = ' ';
		System.out.println(FName+LName);
		//System.out.println(FName-LName);
		System.out.println(LName);
		System.out.println(FName+' '+LName);
		System.out.println(LName+space+FName);
		String FullName = FName+LName;
	
		System.out.println("total number of characters in FullName" + ' '+FullName.length());
		System.out.println("character at second index in FullName is " + FullName.charAt(1));
		System.out.println("character at Fiveth index in FullName is " + FullName.charAt(4));
		String newName = FullName.replace("Mathew","Meghana");
		System.out.println(newName);
		System.out.println(LName);
		System.out.println(FName);
	}

}
