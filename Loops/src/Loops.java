import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira um numero: ");
		int n1 = teclado.nextInt();
		int i = 1;
		while(i<=n1) {
		System.out.println("O número inserido foi: "+i);
		i++;
		}
		teclado.close();

	}

}
