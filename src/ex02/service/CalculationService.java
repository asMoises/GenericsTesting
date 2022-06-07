package ex02.service;

import java.util.List;

public class CalculationService {
	
	public static <T extends Comparable<? super T>> T max(List<T> list) {// <T> means Type of object and extends Comparable Class
		if (list.isEmpty()) {
			throw new IllegalStateException("List can not be empty!");
		}

		T max = list.get(0);
		for (T item : list) {
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}

}
