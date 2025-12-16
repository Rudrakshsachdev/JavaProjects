import java.util.Random;
import java.awt.GridLayout;
import javax.swing.*;

public class NumberGuessingGUI extends JFrame {

    int numToGuess;
    int maxAttempts;
    int attempts = 0;
    int score = 100;
    int maxNumber;

    JLabel messageLabel, scoreLabel, attemptsLabel;
    JTextField guessField;
    JButton guessButton, playAgainButton;
    JComboBox<String> difficultyBox;

    Random rand = new Random();

    public NumberGuessingGUI() {

        setTitle("--- Number Guessing Game ---");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 1));

        difficultyBox = new JComboBox<>(new String[] {
            "Easy (1-50, 7 attempts)",
            "Medium (1-100, 6 attempts)",
            "Hard (1-200, 5 attempts)"
        });

        messageLabel = new JLabel("Select Difficulty and enter your guess", JLabel.CENTER);
        scoreLabel = new JLabel("Score: 100", JLabel.CENTER);
        attemptsLabel = new JLabel("Attempts left: 0", JLabel.CENTER);

        guessField = new JTextField();
        guessButton = new JButton("Submit Guess");
        playAgainButton = new JButton("Play Again");
        playAgainButton.setEnabled(false);

        add(difficultyBox);
        add(messageLabel);
        add(guessField);
        add(guessButton);
        add(scoreLabel);
        add(attemptsLabel);
        add(playAgainButton);

        startGame();

        guessButton.addActionListener(e -> checkGuess());
        playAgainButton.addActionListener(e -> startGame());

        setVisible(true);
    }

    void startGame() {
        attempts = 0;
        score = 100;
        guessField.setText("");

        int choice = difficultyBox.getSelectedIndex();

        switch (choice) {
            case 0:
                maxNumber = 50;
                maxAttempts = 7;
                break;
            case 1:
                maxNumber = 100;
                maxAttempts = 6;
                break;
            case 2:
                maxNumber = 200;
                maxAttempts = 5;
                break;
            default:
                maxNumber = 100;
                maxAttempts = 6;
        }

        numToGuess = rand.nextInt(maxNumber) + 1;

        messageLabel.setText("Guess a number between 1 and " + maxNumber);
        scoreLabel.setText("Score: " + score);
        attemptsLabel.setText("Attempts left: " + maxAttempts);

        guessButton.setEnabled(true);
        playAgainButton.setEnabled(false);
    }

    void checkGuess() {
        try {
            int userGuess = Integer.parseInt(guessField.getText());
            attempts++;

            if (userGuess > numToGuess) {
                messageLabel.setText("📈 Too High!");
                score -= 10;
            } else if (userGuess < numToGuess) {
                messageLabel.setText("📉 Too Low!");
                score -= 10;
            } else {
                messageLabel.setText("🎉 Correct! You Win!");
                endGame();
                return;
            }

            if (attempts >= maxAttempts) {
                messageLabel.setText("❌ Game Over! Number was " + numToGuess);
                endGame();
            }

            scoreLabel.setText("Score: " + score);
            attemptsLabel.setText("Attempts left: " + (maxAttempts - attempts));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number!");
        }
    }

    void endGame() {
        guessButton.setEnabled(false);
        playAgainButton.setEnabled(true);
    }

    public static void main(String[] args) {
        new NumberGuessingGUI();
    }
}
