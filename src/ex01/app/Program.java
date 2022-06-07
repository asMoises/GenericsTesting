package ex01.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import ex01.service.CalculationService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		List<Integer> list = new ArrayList<>();
		String path = "/Users/moiss/Documents/Java/List-Integer-Generics.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();

			while (line != null) {
				list.add(Integer.parseInt(line));
				line = br.readLine();
			}

			Integer x = CalculationService.max(list);
			System.out.print("Max: ");
			System.out.println(x);
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
