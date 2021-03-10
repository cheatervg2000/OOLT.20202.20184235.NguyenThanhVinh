package lab02;
import java.util.Scanner;
import java.util.Arrays;
public class SortArray {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
        System.out.print("Length of the Array : ");
        int n = keyboard.nextInt();
        int[] arr = new int[n];
        System.out.print("Member of the Array : ");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] =" , i);
            arr[i] = keyboard.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Softed array : ");
        show(arr);
        keyboard.close();
    }

    public static void show(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("sum = " + sum(arr));
        System.out.println("average = " + average(arr));
    }
    public static int sum(int[] arr){
    	int s = 0;
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
        }
        return s;
    }
    public static double average(int[] arr){
       return sum(arr)/arr.length;
	}

}
