package ex01.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import ex01.entities.Product;
import ex01.service.CalculationService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		String path = "/Users/moiss/Documents/Java/in1.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			
			while(line!=null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0],Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			Product x = CalculationService.max(list);
			System.out.print("Most expensive: ");
			System.out.println(x);
		}
		catch(IOException e) {
			System.out.println("Error: "+e.getMessage());
		}

	}

}
