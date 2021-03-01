package Lab01;
import javax.swing.JOptionPane;
public class Calculate2DoubleNumber {
	public static void main(String[] args) {
		 String strNum1, strNum2;
	        strNum1 = JOptionPane.showInputDialog(null,
	                "Please input the first number:",
	                "Input the first number", JOptionPane.INFORMATION_MESSAGE);
	        strNum2 = JOptionPane.showInputDialog(null,
	                "Please input the second number:",
	                "Input the first number", JOptionPane.INFORMATION_MESSAGE);
	        double num1 = Double.parseDouble(strNum1);
	        double num2 = Double.parseDouble(strNum2);
	        double sum = num1 + num2;
	        double diff = num1 - num2;
	        double product = num1 * num2;
	        double quotient;
	        System.out.printf("Sum: " + sum + "\n");
	        System.out.println("Diff: " + diff + "\n");
	        System.out.println("Product: " + product + "\n");	
	        if (num2 == 0) {
	        	System.out.println("No quotient exists");
	        } else {
	            quotient = num1 / num2;
	            System.out.println("Quotient: " + quotient + "\n");
	        }
	        System.exit(0);
	}
}
