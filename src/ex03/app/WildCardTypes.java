package ex03.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCardTypes {

	public static void main(String[] args) {

		// Wild card Type
		// A list of Object Class is not the super type of any list type!

		// Creating a list of Objects and a list of Integers
		List<Object> myObj1 = new ArrayList<Object>();
		List<Integer> myInteger = new ArrayList<Integer>();
		// myObj = myInteger;

		// this line above is going to be an error! A list of Objects is not
		// a list of Integers or any other kind.
		// it's not possible to do an up casting of types.

		// In anther way, a Integer object is an Object! Look at that:
		Object obj;
		Integer x = 10;
		obj = x; // It's possible to do because they are not a list kind, they are an object
					// kind.

		// ********** Wild Card Types *************
		// or: "Curinga" type
		List<?> myObj2 = new ArrayList<Object>(); // List "?" is a super type of any list type. Is is a wild card type.
		myObj2 = myInteger; // In this case, this line is OK, "myInteger" is a list of Integer and also a
							// sub type of "?"

		// Wild cards void types can be called receiving list of any type. Look at the
		// printList().
		List<Integer> myInts = Arrays.asList(5, 2, 10); // A list of Integer inserting its values.
		printList(myInts); // Calling with Integer type

		List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob"); // A list of Strings inserting its values.
		printList(myStrs);// Calling with a String type

		// The problem: Look at the printList().
	}

	public static void printList(List<?> list) {
		// list.add(3); // causing an error!
		// Look at the line above.
		// In this type of collection (or list), any element can be added!

		for (Object obj : list) {
			System.out.println(obj);
		}
	}

}
