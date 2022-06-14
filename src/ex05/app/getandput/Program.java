package ex05.app.getandput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BooleanSupplier;

import javax.sound.sampled.BooleanControl;

public class Program {

	public static void main(String[] args) {

		// copying elements from a specific list to a more generic list

		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<String> myStrs = Arrays.asList("Maria", "Alex");
		List<Object> myObjs = new ArrayList<Object>();

		copy(myInts, myObjs);
		copy(myDoubles, myObjs);
		copyStr(myStrs, myObjs);

		printLists(myObjs);

	}

	// (List<? extends Number> source), this is the first argument.
	// Any kind extended from Number. It is a more specific type!

	// (List<? super Number> destiny), this is the second argument.
	// Any kind of Number or Object (because Object is the unique super type of
	// Number), or any kind of Number.

	// At the first argument, it must to be a Number to be copied to a more generic
	// list at the second argument.

	// This void method can be called sending any kind of number to be copied to a
	// more generic destiny list.
	public static void copy(List<? extends Number> anyNumber, List<? super Number> myObjs) {
		for (Number number : anyNumber) { // for each element at source list
			myObjs.add(number); // destiny list add to its self.
		}
	}

	// This void method can be called sending any kind of strings to be copied to a
	// more generic destiny list.
	public static void copyStr(List<? extends String> source, List<? super String> myObjs) {
		for (String str : source) { // for each element at source list
			myObjs.add(str); // destiny list add to its self.
		}
	}

	// This void method can be called to print entire destiny list.
	public static void printLists(List<? extends Object> myObjs) {
		int i = 0;
		System.out.println("The full list of Objects: ");
		for (Object o : myObjs) {
			String type = "" + o.getClass();
			System.out.println(type.substring(16, type.length()) + ": " + myObjs.get(i));
			i += 1;
		}
	}
}
