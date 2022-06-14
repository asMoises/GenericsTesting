package ex05.app.contravariance;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Object> myObjs = new ArrayList<>();
		myObjs.add("Maria");
		myObjs.add("Alex");

		List<? super Number> myNums = myObjs; // myObjs copied to myNums
		// myNums is any type super Number (in this case, myNums is an Object, because
		// Object is the only super type of Number).

		myNums.add(10); // myNums can add elements because it is a sub type of Number
		myNums.add(3.14);
		myNums.add(6.28);

		// Number x = myNums.get(0);
		// myNums can not get element to insert or do some operation, just to print!
		// That because it is necessary to pass by Number type to get to Object.
		// At these two Strings cases, the list was copied bringing the values "Maria"
		// and Alex,they were not added by get.add().
	

		// printing...
		int i = 0;
		for (Object o : myNums) {
			System.out.println(myNums.get(i) + ", " + o.getClass());
			i += 1;
		}

		// This case is a "contravariance"
	}
}
