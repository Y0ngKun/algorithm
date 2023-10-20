import java.util.Arrays;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
class Solution {
	public int solution(int[][] lines) {
		List<Integer>listA = new ArrayList<Integer>();
		List<Integer>listB = new ArrayList<Integer>();
		List<Integer>listC = new ArrayList<Integer>();

		List<int[]>du = new ArrayList<int[]>();
		List<int[]>du2 = new ArrayList<int[]>();
		List<int[]>du3 = new ArrayList<int[]>();  
		
		try {
			for (int i = lines[0][0]; i <= lines[0][1]; i++) {
				listA.add(i);
			}
			for (int i = lines[1][0]; i <= lines[1][1]; i++) {
				listB.add(i);
			}
			for (int i = lines[2][0]; i <= lines[2][1]; i++) {
				listC.add(i);
			}
		} catch (IndexOutOfBoundsException e) {
			
		}

		for (int i = 0; i < listA.size()-1; i++) {
				for (int j = 0; j < listB.size(); j++) {
					if (listA.get(i)==listB.get(j) && j != listB.size()-1) {
						if(listA.get(i)+1 == listA.get(i+1)) {
						du.add( Arrays.asList(listA.get(i),listA.get(i+1)).stream().mapToInt(Integer::intValue).toArray());
						}
					}
				}
			}
		for (int i = 0; i < listA.size()-1; i++) {
			for (int j = 0; j < listC.size(); j++) {
				if (listA.get(i)==listC.get(j) && j != listC.size()-1) {
					if(listA.get(i)+1 == listA.get(i+1)) {
					du2.add( Arrays.asList(listA.get(i),listA.get(i+1)).stream().mapToInt(Integer::intValue).toArray());
					}
				}
			}
		}
		for (int i = 0; i < listB.size()-1; i++) {
			for (int j = 0; j < listC.size(); j++) {
				if (listB.get(i)==listC.get(j) && j != listC.size()-1) {
					if(listB.get(i)+1 == listB.get(i+1)) {
					du3.add( Arrays.asList(listB.get(i),listB.get(i+1)).stream().mapToInt(Integer::intValue).toArray());
					}
				}
			}
		}

		Set<List<Integer>> set = new HashSet<List<Integer>>();
		for (int i = 0; i < du.size(); i++) {
			set.add( Arrays.stream(du.get(i)).boxed().collect(Collectors.toList()) );
		}
		for (int i = 0; i < du2.size(); i++) {
			set.add( Arrays.stream(du2.get(i)).boxed().collect(Collectors.toList()) );
		}
		for (int i = 0; i < du3.size(); i++) {
			set.add( Arrays.stream(du3.get(i)).boxed().collect(Collectors.toList()) );
		}
		return set.size();

	}
}