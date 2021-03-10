package lab02;
import java.util.Scanner;
public class Triangle {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		int width = n;
		int lenght = 2*n - 1;
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < lenght; j++) {
				if ((j >= n-1-i) && (j <= n-1+i)) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
		keyboard.close();
	}

}
