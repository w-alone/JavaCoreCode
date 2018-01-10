package pair2;

import java.time.*;

/**
 *@version 1.02 2018-1-10
 *@author w-alone 
 */

public class PairTest2{
	public static void main(String[] args) {
		LocalDate[] birthdays = {
				LocalDate.of(1906, 12, 9),
				LocalDate.of(1815, 12, 10),
				LocalDate.of(1901, 12, 1),
				LocalDate.of(1910, 11, 20),
		};
		Pair<LocalDate> mm = ArrayAlg.minmax(birthdays);
		System.out.println("min = " + mm.getFirst());
		System.out.println("max = " + mm.getSecond());
	}
}

class ArrayAlg{
	public static <T extends Comparable> Pair<T> minmax(T[] a){
		if(a == null || a.length == 0)
			return null;
		T min = a[0];
		T max = a[0];
		for(int i =1 ; i < a.length; i++) {
			if(min.compareTo(a[i]) > 0) min = a[i];
			if(min.compareTo(a[i]) < 0) max = a[i];
		}
		return new Pair<>(min,max);
	}
}
