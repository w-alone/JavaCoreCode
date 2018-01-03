package set;

import java.util.*;

/**
 *This program use a set to print all unique words in "System.in";
 *@version 2018-1-3
 *@author w-alone 
 */

public class SetTest{
	public static void main(String[] args) {
		Set<String> words = new HashSet<>();
		try(Scanner in = new Scanner(System.in)){
			while(in.hasNext()){
				String word = in.next();
				words.add(word);
			}
		}
//		Iterator<String> iter = words.iterator();
		for(String e : words)
			System.out.println(e);
		System.out.println(words.size() + " distinct words!");
	}
}
