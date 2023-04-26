package com.training.example.java.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestLinkedListImplementation {

	public static void main(String[] args) {

		List<String> list = new LinkedList<String>(); // 1 - good to use - we can change the
		
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

	}
}
