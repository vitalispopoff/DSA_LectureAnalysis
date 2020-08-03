package part_02.chap_01_complexity;

public class Equi {

	/**
	 * for the given int table find an index dividing the table into two parts
	 * equal in terms of their members sums
	 */

	static void equal_01(int[] input) {

		int
			tableLength = input.length;

		if (tableLength-- > 0) {

			int
				a = 0,
				b = 0;

			for (int i = 0; i < tableLength; i++)
				a += input[i];

			for (int j = tableLength; j > 0; j--) {

				b += input[j];
				a -= input[j - 1];

				if (a == b)
					System.out.println("solution found for the index: " + j);
			}
		}

		else
			System.out.println("table too short for a proper solution");
	}

	static void equal_02(int[] input){

		int
			tableLength = input.length;

		if (tableLength > 0){

			int
				a = 0,
				b = 0,
				c;

			for(int i : input)
				a += i;

			for (int j = 1 ; j < tableLength; j++){

				b += input[j - 1];
				c = input[j];

				if (a - (b + c) == b)
					System.out.println("solution for index : " + j);
			}
		}
	}

	public static void main(String[] args) {

		int[]
			table = {1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0};

		equal_01(table);
	}
}