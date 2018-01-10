package pair1;

/**
*@version 1.01 2018-1-10
*@author by w-alone
*/

public class PairTest1{
	public static void main(String[] args) {
		String[] words = {"Mary","had","a","little", "lamb"};
		Pair<String> res= ArayAlg.minmax(words);
		System.out.println("min = " + res.getFirst());
		System.out.println("max = " + res.getSecond());
	}
}

class ArayAlg{
	/**
	*Get the min and max element in array
	*@param a an array of strings
	*@return a pair of with the min and max value,or null if a is null or empty
	*/

	public static Pair<String> minmax(String[] a){
		if(a==null || a.length == 0)
			return null;
		String min = a[0];
		String max = a[0];
		for(String e:a){
			if(min.compareTo(e)>0)
				min = e;
			if(max.compareTo(e)<0)
				max = e;
		}
		return new Pair<>(min,max);
	}
}



