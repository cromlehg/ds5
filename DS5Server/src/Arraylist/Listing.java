package Arraylist;

import java.util.ArrayList;

public class Listing {

	public static void main(String[] args) {

		ArrayList testList = new ArrayList();
		testList.add(54);
		testList.add("London");
		testList.add(10);
		testList.add("Moscow");

		System.out.println(testList.get(1));
		
		
		System.out.println(testList.size());
		
		testList.remove(3);
		
		System.out.println(testList.size());
		
		testList.clear();
		
		System.out.println(testList.size());
		
	}

}
