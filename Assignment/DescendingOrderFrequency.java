package evaluation;

import java.util.Scanner;

public class DescendingOrderFrequency {
	public static void main(String[] args) {
		DescendingOrderFrequency object = new DescendingOrderFrequency();
		object.arrange();
	}

	private void arrange() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Array Length");
		int length = scanner.nextInt();
		int[] array = new int[length];
		System.out.println("Enter Array");
		for (int index = 0; index < length; index++) {
			array[index] = scanner.nextInt();
		}
		int[] frequency = new int[length];
		int visited = -1;

		// finding frequencies
		for (int index = 0; index < length; index++) {
			int count = 1;
			for (int endindex = index + 1; endindex < length; endindex++) {
				if (array[index] == array[endindex]) {
					count++;
					frequency[endindex] = visited;
				}
			}
			if (frequency[index] != visited) {
				frequency[index] = count;
			}
		}

		// swapping based on frequencies
		for (int index = 0; index < length; index++) {
			for (int endindex = index + 1; endindex < length; endindex++) {
				if (frequency[index] < frequency[endindex]) {
					int temp = frequency[endindex];
					frequency[endindex] = frequency[index];
					frequency[index] = temp;

					int arraytemp = array[endindex];
					array[endindex] = array[index];
					array[index] = arraytemp;
				}
			}
		}

		for (int index = 0; index < length; index++) {
			if (frequency[index] != visited) {
				int temp = array[index];
				for (int endindex = 0; endindex < frequency[index]; endindex++) {
					System.out.print(temp + " ");
				}
			}
		}
	}
}
