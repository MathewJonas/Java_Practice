package CollectionsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> name = new ArrayList<String>();
		name.add("mathew");
		name.add("Jonas");
		name.add("Mark");
		//name.add("0.45");
		System.out.println(name);

		System.out.println("Total names are " + name.size());
		System.out.println("First names is " + name.get(0));

		// Remove the data - Jonas
		name.remove(1);
		System.out.println(name);

		// adding name

		name.add("Henry");
		System.out.println(name);

		// updating the data

		name.set(2, "Mary");
		System.out.println(name);

		// Iterate through the array list

		for (String n : name) {
			System.out.println(n);
		}

		// Using for loop
		for (int i = 0; i < name.size(); i++) {
			System.out.println(name.get(i));
		}
			
			name.add("Mathew");
			System.out.println(name);
			
			 //To Sort the ArrayList
			Collections.sort(name);
			System.out.println(name);
			
			
			// Concatenate Two Lists
			List<String> Names2 = new ArrayList<>();

			Names2.add("Mary");
			Names2.add("Glory");
			
			name.addAll(Names2);
			System.out.println(name);
			
			// Validate that Mary  is present in the Array List
			if(name.contains("Mary")) {
				System.out.println("Present");
			}else {
				System.out.println("Not Present");
			}
		}

	}


