package ex06.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Object> objs = new ArrayList<>();

		int opt = 0;
		while (opt == 0) {
			System.out.println("Entre the next data: ");
			String data = sc.nextLine();

			try {
				int x = Integer.parseInt(data);
				objs.add(x);
				if (x == 0) {
					opt = 1;
				}
			} catch (Exception e) {
				try {
					Double y = Double.parseDouble(data);
					objs.add(y);
				} catch (Exception i) {
					objs.add(data);
				}
			}

		}
		printLists(objs);
		System.out.println("Exit!");
		sc.close();
	}

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
