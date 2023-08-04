
public class TestTable {

	public static void main(String[] args) {
		
		int a = Integer.parseInt(args[0]);

		int[][] table = new int[a][a];

		for (int i = 0; i < table.length; i++) {

			for (int j = 0; j < table.length; j++) {

				table[i][j] = (i + 1) * (j + 1);

				System.out.print(table[i][j] + "\t");

			}

			System.out.println();
			System.out.println();

		}

	}

}
