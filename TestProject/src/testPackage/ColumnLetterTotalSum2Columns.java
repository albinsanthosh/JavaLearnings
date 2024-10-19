package testPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ColumnLetterTotalSum2Columns {

	public static void main(String args[]) {
		List<List<?>> list = new ArrayList<>();
		list.add(Arrays.asList("A", "B", 3, 4));
		list.add(Arrays.asList("E", "F", 5, 6));
		list.add(Arrays.asList("A", "B", 3, 4));
		list.add(Arrays.asList("A", "F", 5, 6));
		list.add(Arrays.asList("E", "F", 5, 6));
		list.add(Arrays.asList("A", "B", 3, 4));
		list.add(Arrays.asList("A", "X", 7, 8));
		list.add(Arrays.asList("E", "X", 7, 8));
		list.add(Arrays.asList("A", "B", 3, 4));

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
		Map<String, List<Integer>> res = new HashMap<>();
		
		//x is each element in hset
		for (String x : hset) {
			
			//fl is each list in list
			for (List<?> fl : list) {
				
				//Check if set element equals list element
				if (x.equals(fl.get(1))) {
					
					//Checks and updates Map for same set element
					if (res.containsKey(fl.get(1))) {
						int addCol1 = res.get(fl.get(1)).get(0) + (int)fl.get(2);
						int addCol2 = res.get(fl.get(1)).get(1) + (int)fl.get(3);
						List<Integer> tem = new ArrayList<>() ;
						tem.add(addCol1);
						tem.add(addCol2);
						res.put((String) fl.get(1), tem);
					} else {
						int addCol1 = (int)fl.get(2);
						int addCol2 = (int)fl.get(3);
						List<Integer> tem = new ArrayList<>() ;
						tem.add(addCol1);
						tem.add(addCol2);
						res.put((String) fl.get(1), tem);
					}
				} else {

				}

			}
		}
		res.forEach((key, value) -> System.out.println(key + " " + value));
	}

}