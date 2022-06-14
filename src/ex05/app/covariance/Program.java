package ex05.app.covariance;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(5);
		intList.add(10);
		intList.add(3);

		List<? extends Number> list = intList; // intList copied to list

		// list is any type extended from Number (long, bit, short, Integer, etc).
		// intList is an Integer.
		// It is possible to get elements, see:
		Number x = list.get(0);
		System.out.println("x: " + x);
		System.out.println();

		// But it is not possible to add elements:
		// list.add(20);

		int i = 0;
		for (Number item : list) {
			System.out.println(list.get(i) + ", " + item.getClass());
			i += 1;
		}

		// This case is a "covariance", where get operations is OK, but not put
		// operations!

		// It is not possible to get an element to insert in a variable or adding in a
		// list! Just get to print or something like that

	}

}
