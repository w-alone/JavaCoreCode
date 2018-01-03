package set;

import java.util.*;

/**
 *This program use a set to print all unique words in System.in;
 *@version 2018-1-3
 *@author w-alone 
 */
public class Item implements Comparable<Item>{
	private String description;
	private int partNumber;

	public Item(String aDescription , int aPartNumber){
		description = aDescription;
		partNumber = aPartNumber;
	}

	public String getDascription(){
		return description;
	}

	public String toString(){
		return description + " " + partNumber;
	}

	public boolean equals(Object otherObject){
		if(this == otherObject)
			return true;
		if(otherObject == null)
			return false;
		if(getClass() != otherObject.getClass())
			return false;
		Item other = (Item)otherObject;
		return Objects.equals(description,other.description) && partNumber == other.partNumber;
	}

	public int hashCode(){
		return Objects.hash(description,partNumber);
	}

	public int compareTo(Item other){
		int diff = Integer.compare(partNumber,other.partNumber);
		return diff != 0?diff:description.compareTo(other.description);
	}
}