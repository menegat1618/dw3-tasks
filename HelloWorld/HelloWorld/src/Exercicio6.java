
public class Exercicio6 {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		for (int cont = 2; cont <= 100; cont++){
			System.out.println(a+b);
			int sum = a+b;
			b = a;
			a = sum;
		}
	}
}
