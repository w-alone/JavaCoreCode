package set;

import java.util.*;

/**
 *This program use a set to print all unique words in System.in;
 *@version 2018-1-3
 *@author w-alone 
 */

public class TreeSetTest{
	public static void main(String[] args) {
		SortedSet<Item> parts = new TreeSet<>();
		parts.add(new Item("Toaster",1234));
		parts.add(new Item("Widget",5523)); 
		parts.add(new Item("Modem",1235));
		System.out.println(parts);
		NavigableSet<Item> sortByDescription = new TreeSet<>(
			Comparator.comparing(Item::getDascription));
		sortByDescription.addAll(parts);
		System.out.println(sortByDescription);
	}
}
