package part_02.chap_01_complexity;

public class Main {

	/**
	 * for the given int table find an index dividing the table into two parts
	 * equal in terms of their members sums
	 */

	static int[] table = {1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1,0};

	static void equal(int[] table) {
		int
				tableLength = table.length;

		if (tableLength-- >0) {
			int
					a = 0,
					b = 0;

			for (int i = 0; i < tableLength; i++) a += table[i];

			for (int j = tableLength; j > 0; j--) {
				b+= table[j];

				/*if (j > 1)*/ a -= table[j - 1];
				if (a==b) System.out.println(j+" : "+table[j]);
			}
		} else System.out.println("table too short");
	}

	public static void main(String[] args) {
		equal(table);
	}
}