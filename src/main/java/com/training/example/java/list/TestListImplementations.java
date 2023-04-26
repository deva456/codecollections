package com.training.example.java.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.training.example.java.data.Employee;

public class TestListImplementations {
	
	public static void main(String[] args) {
		// ArrayList<String> list = new ArrayList(); // 2

				List<String> list = new ArrayList<String>(); // 1 - good to use - we can change the
																// implementation class without
																// affecting the code.

				// inform the compiler to do type-safety check
				// list.add(new Integer(10));
				// list.add(new Employee("john", "developer", 25, 67677));

				// add two object to the collection
				list.add(new String("Name A"));
				list.add(new String("Name B"));
				// display the data from the collection
				System.out.println(list); // list.toString()

				// add "Name C" to the collection - element will be added at the end
				list.add(new String("Name C"));
				System.out.println(list); // list.toString()

				// add "Name D" to the first position
				// set() or add(index, element)

				list.add(0, "Name D");
				System.out.println(list); // list.toString()

				list.add(2, "Name E");
				System.out.println(list); // list.toString()

				// Search for "Name A" in the collection
				String toBeSearched = "Name A";
				System.out.println(list.contains(toBeSearched));

				// Retrieve element from the 2 position
				// raise the classCastException with no GENERICS
				// Integer returnedString = (Integer) list.get(2);
				// System.out.println(returnedString.doubleValue());
				String returnedString = list.get(2);
				System.out.println(list); // list.toString()

				// Retrieve element by name from the collection
				// I donot have any get(Object)
				// solution - forEach(Functional Interface) or Iterator() or for or forEach loop

				// size() - count of element in the list
				System.out.println("For Loop");
				for (int i = 0; i < list.size(); i++) {
					String str = list.get(i);
					System.out.println(" "+ str.toUpperCase());
				}

				System.out.println("\n\n ForEach Loop");
				for (String string : list) {
					System.out.println(" " + string.toUpperCase());
				}
				
				System.out.println("\n\n Using Iterator ");
				Iterator<String> itr =  list.iterator();
				while(itr.hasNext()) { // elements inside the list ? YEs
					
				String str = itr.next();
				System.out.println(" " + str.toUpperCase());
				}
				
				
				// Java 8 forEach() method
				// Consumer interface = void apply(t):      (String s) -> {syso(s))
				System.out.println("\n\n Using Lambdas");
				list.forEach((str) -> System.out.println(str.toUpperCase()));
				
				
				
				
				
				
				
	}
}
