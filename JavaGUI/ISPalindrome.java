import javax.swing.JOptionPane;

public class PalindromeChecker {
    public static void main(String[] args) {
        String inputNumber = JOptionPane.showInputDialog("Enter a number to check if it's a palindrome:");

        int number;
        try {
            number = Integer.parseInt(inputNumber);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number.");
            return;
        }
        
        
        if (isPalindrome(number)) {
            JOptionPane.showMessageDialog(null, "The number " + number + " is a palindrome.");
        } else {
            JOptionPane.showMessageDialog(null, "The number " + number + " is not a palindrome.");
        }
    }
    
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        
        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        
        return originalNumber == reversedNumber;
    }
}
