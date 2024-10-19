package testPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ColumnLetterTotalSum {

	public static void main(String args[]) {
		List<List<?>> list = new ArrayList<>();
		list.add(Arrays.asList("A", "B", 3, "D"));
		list.add(Arrays.asList("E", "F", 5, "F"));
		list.add(Arrays.asList("A", "B", 3, "D"));
		list.add(Arrays.asList("A", "F", 5, "T"));
		list.add(Arrays.asList("E", "F", 5, "F"));
		list.add(Arrays.asList("A", "B", 3, "D"));
		list.add(Arrays.asList("A", "X", 7, "R"));
		list.add(Arrays.asList("E", "X", 7, "F"));
		list.add(Arrays.asList("A", "B", 3, "D"));

		//Sorting List
		list.sort((l1, l2) -> ((String) l1.get(1)).compareTo((String) l2.get(1)));
		list.forEach(System.out::println);
		System.out.println();

		//Forming a set to remove duplicate for 2 column
		Set<String> hset = new HashSet<>();
		for (List<?> x : list) {
			hset.add((String) x.get(1));
		}

		//Creating a map for storing key(Letter) & value(sum total of corresponding key value)
		Map<String, Integer> res = new HashMap<>();
		for (String x : hset) {
			System.out.println(x);
			for (List<?> fl : list) {
				if (x.equals(fl.get(1))) {
					if (res.containsKey(fl.get(1))) {
						int add = res.get(fl.get(1)) + (int)fl.get(2);
						res.put((String) fl.get(1), add);
					} else {
						res.put((String) fl.get(1), (Integer) fl.get(2));
					}
				} else {

				}

			}
		}
		res.forEach((key, value) -> System.out.println(key + " " + value));
	}

}