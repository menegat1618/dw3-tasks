
public class Exercicio4 {
	public static void main(String[] args) {
		int fatorial;
		int fat;
		for (int n = 1; n<=10; n++){
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
