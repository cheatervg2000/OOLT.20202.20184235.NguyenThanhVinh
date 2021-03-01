package Lab01;
import javax.swing.JOptionPane;
public class TheFirstdegreeEquationWithOneVariable {
	public static void main(String[] args) {
        String strNum1, strNum2;
        strNum1 = JOptionPane.showInputDialog(null,
                "Please input the first number:",
                "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null,
                "Please input the second number:",
                "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        double a = Double.parseDouble(strNum1);
        double b = Double.parseDouble(strNum2);
        if (a == 0){
            if (b == 0){
                System.out.println("All value of x is accepted!");
            } else {
                System.out.println("No variable exists");
            }
        }
        System.out.println("x = " + b/a);
        System.exit(0);
	}
}
