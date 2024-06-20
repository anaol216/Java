import javax.swing.JOptionPane;

public class NumberGuesser {
    public static void main(String[] args) {
        int targetNumber = (int) (Math.random() * 200) + 1;
        
        int guess = -1;
        while (guess != targetNumber) {
            String inputGuess = JOptionPane.showInputDialog("Guess a number between 1 and 200:");
            
            try {
                guess = Integer.parseInt(inputGuess);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number.");
                continue;
            }
            
          
            if (guess < targetNumber) {
                JOptionPane.showMessageDialog(null, "Your guess is too low. Please go up.");
            } else if (guess > targetNumber) {
                JOptionPane.showMessageDialog(null, "Your guess is too high. Please go down.");
            } else {
                JOptionPane.showMessageDialog(null, "Congratulations! You guessed the number correctly.");
            }
        }
    }
}
