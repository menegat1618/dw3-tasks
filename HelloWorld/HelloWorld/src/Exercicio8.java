
public class Exercicio8 {
	public static void main(String[] args) {
		int sum;
		for (int n = 0; n<=5; n++){
			for (int mult = 1; mult<=n; mult++){
				sum = n * mult;
				System.out.print(sum);
				System.out.print(' ');
			}
			System.out.println();
		}
	}
}
