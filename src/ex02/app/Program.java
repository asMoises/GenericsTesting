package ex02.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import ex02.entities.Product;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();
		String path = "/Users/moiss/Documents/Java/List-Product_Generics.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();

			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			// at the end of this while structure I get a full list of products

			Product x = ex02.service.CalculationService.max(list);
			System.out.print("Most expensive: ");
			System.out.println(x);
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
