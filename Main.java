import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void gameOver(int score) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to continue? \n   Yes 1 \n   No 2");
        int continueChoice = sc.nextInt();
        if (continueChoice == 1) {
            System.out.println("Here are the themes: \n   1.Football \n   2.History\n   3.True or False\n   4.Games\n   5.Countries");
            System.out.print("Which theme would you choose? ");
            int themeChoice = sc.nextInt();
            playTheme(themeChoice, score);
        } else {
            System.exit(0);
        }
    }

    public static void answeredEverythingCorrectly(int score) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Congratulations! You answered everything correctly. Your total score is: " + score);
        System.out.println("Would you like to continue? \n   Yes 1 \n   No 2");
        int continueChoice = sc.nextInt();
        if (continueChoice == 1) {
            System.out.println("Here are the themes: \n   1.Football \n   2.History\n   3.True or False\n   4.Games\n   5.Countries");
            System.out.print("Which theme would you choose? ");
            int themeChoice = sc.nextInt();
            playTheme(themeChoice, score);
        } else {
            System.exit(0);
        }
    }

    public static void processMultipleChoiceQuestion(String questionNumber, String question, String answerA, String answerB, String answerC, String answerD, int correctAnswer, int score) {
        List<String> answers = new ArrayList<>(Arrays.asList(answerA, answerB, answerC, answerD));
        Collections.shuffle(answers);
        Scanner sc = new Scanner(System.in);
        System.out.println(questionNumber + "\n " + question);
        for (int i = 0; i < answers.size(); i++) {
            System.out.println("   Answer " + (i + 1) + ": " + answers.get(i));
        }
        int answer = sc.nextInt();
        while (answer < 1 || answer > 4) {
            System.out.println("Incorrect input!");
            System.out.println("Try again: ");
            answer = sc.nextInt();
        }

        if (answers.get(answer - 1).equals(answerA)) {
            answer = 1;
        } else if (answers.get(answer - 1).equals(answerB)) {
            answer = 2;
        } else if (answers.get(answer - 1).equals(answerC)) {
            answer = 3;
        } else if (answers.get(answer - 1).equals(answerD)) {
            answer = 4;
        }

        if (answer != correctAnswer) {
            System.out.println("Wrong answer!");
            System.out.println("The correct answer was number: " + correctAnswer);
            System.out.println("Your score is: " + score + "\n");
            gameOver(score);
        } else {
            System.out.println("Correct answer!");
            score++;
            System.out.println("Your score is: " + score + "\n");
            playTheme(Integer.parseInt(questionNumber), score);
        }
    }

    public static void processTrueFalseQuestion(String questionNumber, String question, String answerA, String answerB, int correctAnswer, int score) {
        List<String> answers = new ArrayList<>(Arrays.asList(answerA, answerB));
        Collections.shuffle(answers);
        Scanner sc = new Scanner(System.in);
        System.out.println(questionNumber + "\n " + question);
        for (int i = 0; i < answers.size(); i++) {
            System.out.println("   Answer " + (i + 1) + ": " + answers.get(i));
        }
        int answer = sc.nextInt();
        while (answer < 1 || answer > 2) {
            System.out.println("Incorrect input!");
            System.out.println("Try again: ");
            answer = sc.nextInt();
        }

        if (answers.get(answer - 1).equals(answerA)) {
            answer = 1;
        } else if (answers.get(answer - 1).equals(answerB)) {
            answer = 2;
        }

        if (answer != correctAnswer) {
            System.out.println("Wrong answer!");
            System.out.println("The correct answer was: " + correctAnswer);
            System.out.println("Your score is: " + score + "\n");
            gameOver(score);
        } else {
            System.out.println("Correct answer!");
            score++;
            System.out.println("Your score is: " + score + "\n");
            playTheme(Integer.parseInt(questionNumber), score);
        }
    }

    public static void playTheme(int themeNumber, int score) {
        Scanner sc = new Scanner(System.in);
        String fileName = themeNumber + "thThemeQuestions.csv";
        List<String> questions = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
                questions.add(line);
            }

            Collections.shuffle(questions);

            for (String question : questions) {
                String[] parts = question.split(",");
                if (parts.length == 7) {
                    String questionNumber = parts[0];
                    String questionText = parts[1];
                    String answerA = parts[2];
                    String answerB = parts[3];
                    String answerC = parts[4];
                    String answerD = parts[5];
                    int correctAnswer = Integer.parseInt(parts[6]);
                    processMultipleChoiceQuestion(questionNumber, questionText, answerA, answerB, answerC, answerD, correctAnswer, score);
                } else if (parts.length == 5) {
                    String questionNumber = parts[0];
                    String questionText = parts[1];
                    String answerA = parts[2];
                    String answerB = parts[3];
                    int correctAnswer = Integer.parseInt(parts[4]);
                    processTrueFalseQuestion(questionNumber, questionText, answerA, answerB, correctAnswer, score);
                }
            }

            answeredEverythingCorrectly(score);
        } catch (IOException e) {
            System.out.println("Error while reading/writing files: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to my quiz. Here are the rules: \n   Rule 1: You get shown 5 themes, you can choose which one you want to try. \n   Rule 2: Every theme has 5 questions with 2 or 4 answers. The game lasts until you make a mistake.\n   Rule 3: You have to answer with the number before the answer. \n   Rule 4: If you want to you can choose another theme after completing the first one.");
        System.out.println();
        System.out.println("Here are the themes: \n   1.Football \n   2.History\n   3.True or False\n   4.Games\n   5.Countries");
        System.out.println();
        System.out.print("Which theme would you choose? ");
        int score = 0;
        int themeChoice = sc.nextInt();
        System.out.println();
        playTheme(themeChoice, score);
    }
}
