package eraseType;

import java.util.*;
import java.lang.reflect.*;

public class TypeErase{
	public static void main(String[] args) throws IllegalArgumentException, SecurityException, IllegalAccessException, InvocationTargetException, NoSuchMethodException{
		ArrayList<String> arrayList1 = new ArrayList<String>();
		arrayList1.add("abc");
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
		arrayList2.add(123);
		System.out.println(arrayList1.getClass() == arrayList2.getClass());

		ArrayList<Integer> arrayList3 = new ArrayList<Integer>();
		arrayList3.add(1);
		arrayList3.getClass().getMethod("add",Object.class).invoke(arrayList3,"asd");
		for (int i = 0; i<arrayList3.size() ; i++)
			System.out.println(arrayList3.get(i));
	}
}

