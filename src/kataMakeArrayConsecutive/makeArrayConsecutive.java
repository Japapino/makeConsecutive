package kataMakeArrayConsecutive;

import java.util.ArrayList;
import java.util.List;

public class makeArrayConsecutive {
	public static void main(String[] args) {
		int[] test = { 2, 3, 5, 8, 1 };

		System.out.println(makeArrayConsecutive2(test));

	}

	public static int makeArrayConsecutive2(int[] statues) {
		int lowest = 1000;
		int largest = 0;
		int count = 0;
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
		for (int i = lowest; i < largest; i++) {
			for (int x = 0; x < statues.length; x++) {
				if (statues[x] != i) {
					break; 
				}	
				numbers.add(statues[x]); 
			}
			System.out.println(numbers);
		}
		
		count = numbers.size();

		return count;
	}

}
