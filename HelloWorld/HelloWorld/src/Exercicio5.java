
public class Exercicio5 {
	public static void main(String[] args) {
		int fatorial;
		long fat;
		for (int n = 1; n<=50; n++){
			if (n == 1){
				System.out.println(1);
			} else {
				fat = n * (n-1);
				for (fatorial= n-1; fatorial>1; fatorial--){
					fat = fat * (fatorial-1);
				}
				System.out.println(fat);
			}
		}
	}
}
