package map;

import java.util.*;

public class MapTest{
	public static void main(String[] args) {
		Map<String,Integer> scores = new HashMap<>();
		scores.put("Amy",10);
		scores.put("Bob",20);
		scores.put("Cell",30);
		scores.put("Dell",40);

		System.out.println(scores);

		scores.remove("Amy");

		scores.put("Dell",123);

		System.out.println(scores.get("Bob"));

		scores.forEach((k,v)->System.out.println("key= "+k+" ,value= "+v));
	}
}