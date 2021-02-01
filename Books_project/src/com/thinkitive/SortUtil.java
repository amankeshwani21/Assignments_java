package com.thinkitive;
import java.util.Collections;
import java.util.List;

import com.thinkitive.CompareBooksByName;
import com.thinkitive.CompareBooksByPrice;

public class SortUtil {

	public static void sortByName(List list) {

		Collections.sort(list, new CompareBooksByName());
	}

	public static void sortByPrice(List list) {

		Collections.sort(list, new CompareBooksByPrice());
	}

}
