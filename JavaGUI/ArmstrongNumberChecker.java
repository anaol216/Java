import javax.swing.JOptionPane;

public class ArmstrongNumberChecker {
    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number:"));
        if (isArmstrongNumber(number)) {
            JOptionPane.showMessageDialog(null, number + " is an Armstrong number.");
        } else {
            JOptionPane.showMessageDialog(null, number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrongNumber(int num) {
        int originalNumber = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int remainder = num % 10;
            sum += Math.pow(remainder, digits);
            num /= 10;
        }

        return originalNumber == sum;
    }
}
