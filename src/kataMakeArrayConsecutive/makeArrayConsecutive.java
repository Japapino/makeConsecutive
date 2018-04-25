package kataMakeArrayConsecutive;

import java.util.ArrayList;
import java.util.List;

public class makeArrayConsecutive {
	public static void main(String[] args) {
		int[] test = { 2, 3, 5, 8, 1 };
		//467 : ans = 3
		
		System.out.println(makeArrayConsecutive2(test));

	}

	public static int makeArrayConsecutive2(int[] statues) {
		int lowest = 1000;
		int largest = 0;
		for (int i = 0; i < statues.length; i++) {
			if (statues[i] < lowest) {
				lowest = statues[i];
			}
			if (statues[i] > largest) {
				largest = statues[i];
			}
		}

		System.out.println("lowest: " + lowest);
		System.out.println("largest: " + largest);

		List<Integer> numbers = new ArrayList<>();
		System.out.println("Before: " + numbers);
		
		for (int i = 0; i < statues.length; i++) {
			numbers.add(statues[i]); 
		}
		
		List<Integer> count1 = new ArrayList<>();
		
		for (int i = lowest; i < largest; i++) {
				if (!numbers.contains(i)) {
					count1.add(i); 
				}	
			
			System.out.println(count1);
		}
		

		return count1.size();
	}

}
