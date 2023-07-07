import java.io.*;
import java.util.Scanner;

public class Main {
    public static void gameOver(int points) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to continue? \n   Yes 1 \n   No 2");
        int iWantToContinue = sc.nextInt();
        if (iWantToContinue == 1) {
            System.out.println("Here are the themes: \n   1.Football \n   2.History\n   3.True or False\n   4.Games\n   5.Countries");
            System.out.print("Which theme would you choose? ");
            int decider = sc.nextInt();
            switch (decider) {
                case 1:
                    firstTheme(points);
                case 2:
                    secondTheme(points);
                case 3:
                    thirdTheme(points);
                case 4:
                    fourthTheme(points);
                case 5:
                    fifthTheme(points);
            }
        } else {
            System.exit(0);
        }
    }

    public static void answeredEverythingCorrectly(int points) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Congratulations! You answered everything correctly. Your total points are: " + points);
        System.out.println("Would you like to continue? \n   Yes 1 \n   No 2");
        int iWantToContinue = sc.nextInt();
        if (iWantToContinue == 1) {
            System.out.println("Here are the themes: \n   1.Football \n   2.History\n   3.True or False\n   4.Games\n   5.Countries");
            System.out.print("Which theme would you choose? ");
            int decider = sc.nextInt();
            switch (decider) {
                case 1:
                    firstTheme(points);
                case 2:
                    secondTheme(points);
                case 3:
                    thirdTheme(points);
                case 4:
                    fourthTheme(points);
                case 5:
                    fifthTheme(points);
            }
        } else {
            System.exit(0);
        }
    }

    public static void firstTheme(int points) {
        Scanner sc = new Scanner(System.in);

        try (BufferedReader reader = new BufferedReader(new FileReader("firstThemeQuestions.csv"))) {

            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                {
                    if (parts.length == 7) {
                        String questionNumber = parts[0];
                        String question = parts[1];
                        String answerA = parts[2];
                        String answerB = parts[3];
                        String answerC = parts[4];
                        String answerD = parts[5];
                        int correctAnswer = Integer.parseInt(parts[6]);
                        System.out.println(questionNumber + "\n " + question + "\n   Answer 1: " + answerA + "\n   Answer 2: " + answerB + "\n   Answer 3: " + answerC + "\n   Answer 4: " + answerD);
                        int answer = sc.nextInt();
                        while (answer < 1 || answer > 4) {
                            System.out.println("Incorrect input!");
                            System.out.println("Try again: ");
                            answer = sc.nextInt();
                        }

                        if (answer != correctAnswer) {
                            System.out.println("Wrong answer!");
                            System.out.println("The correct answer was number: " + correctAnswer);
                            System.out.println("Your points are: " + points + "\n");
                            gameOver(points);
                        } else {
                            System.out.println("Correct answer!");
                            points++;
                            System.out.println("Your points are: " + points + "\n");
                        }
                    }
                }
            }
            answeredEverythingCorrectly(points);
        } catch (IOException e) {
            System.out.println("грешка при четене/писане на þайлове: " + e.getMessage());
        }
    }

    public static void secondTheme(int points) {
        Scanner sc = new Scanner(System.in);

        try (BufferedReader reader = new BufferedReader(new FileReader("secondThemeQuestions.csv"))) {

            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                {
                    if (parts.length == 7) {
                        String questionNumber = parts[0];
                        String question = parts[1];
                        String answerA = parts[2];
                        String answerB = parts[3];
                        String answerC = parts[4];
                        String answerD = parts[5];
                        int correctAnswer = Integer.parseInt(parts[6]);
                        System.out.println(questionNumber + "\n " + question + "\n   Answer 1: " + answerA + "\n   Answer 2: " + answerB + "\n   Answer 3: " + answerC + "\n   Answer 4: " + answerD);
                        int answer = sc.nextInt();
                        while (answer < 1 || answer > 4) {
                            System.out.println("Incorrect input!");
                            System.out.println("Try again: ");
                            answer = sc.nextInt();
                        }

                        if (answer != correctAnswer) {
                            System.out.println("Wrong answer!");
                            System.out.println("The correct answer was number: " + correctAnswer);
                            System.out.println("Your points are: " + points + "\n");
                            gameOver(points);
                        } else {
                            System.out.println("Correct answer!");
                            points++;
                            System.out.println("Your points are: " + points + "\n");
                        }
                    }
                }
            }
            answeredEverythingCorrectly(points);
        } catch (IOException e) {
            System.out.println("грешка при четене/писане на þайлове: " + e.getMessage());
        }
    }

    public static void thirdTheme(int points) {
        Scanner sc = new Scanner(System.in);

        try (BufferedReader reader = new BufferedReader(new FileReader("thirdThemeQuestions.csv"))) {

            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                {
                    if (parts.length == 5) {
                        String questionNumber = parts[0];
                        String question = parts[1];
                        String answerA = parts[2];
                        String answerB = parts[3];
                        int correctAnswer = Integer.parseInt(parts[4]);
                        System.out.println(questionNumber + "\n " + question + "\n   Answer 1: " + answerA + "\n   Answer 2: " + answerB);
                        int answer = sc.nextInt();
                        while (answer < 1 || answer > 2) {
                            System.out.println("Incorrect input!");
                            System.out.println("Try again: ");
                            answer = sc.nextInt();
                        }

                        if (answer != correctAnswer) {
                            System.out.println("Wrong answer!");
                            System.out.println("The correct answer was: " + correctAnswer);
                            System.out.println("Your points are: " + points + "\n");
                            gameOver(points);
                        } else {
                            System.out.println("Correct answer!");
                            points++;
                            System.out.println("Your points are: " + points + "\n");
                        }
                    }
                }
            }
            answeredEverythingCorrectly(points);
        } catch (IOException e) {
            System.out.println("грешка при четене/писане на þайлове: " + e.getMessage());
        }
    }

    public static void fourthTheme(int points) {
        Scanner sc = new Scanner(System.in);

        try (BufferedReader reader = new BufferedReader(new FileReader("fourthThemeQuestions.csv"))) {

            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                {
                    if (parts.length == 7) {
                        String questionNumber = parts[0];
                        String question = parts[1];
                        String answerA = parts[2];
                        String answerB = parts[3];
                        String answerC = parts[4];
                        String answerD = parts[5];
                        int correctAnswer = Integer.parseInt(parts[6]);
                        System.out.println(questionNumber + "\n " + question + "\n   Answer 1: " + answerA + "\n   Answer 2: " + answerB + "\n   Answer 3: " + answerC + "\n   Answer 4: " + answerD);
                        int answer = sc.nextInt();
                        while (answer < 1 || answer > 4) {
                            System.out.println("Incorrect input!");
                            System.out.println("Try again: ");
                            answer = sc.nextInt();
                        }

                        if (answer != correctAnswer) {
                            System.out.println("Wrong answer!");
                            System.out.println("The correct answer was number: " + correctAnswer);
                            System.out.println("Your points are: " + points + "\n");
                            gameOver(points);
                        } else {
                            System.out.println("Correct answer!");
                            points++;
                            System.out.println("Your points are: " + points + "\n");
                        }
                    }
                }
            }
            answeredEverythingCorrectly(points);
        } catch (IOException e) {
            System.out.println("грешка при четене/писане на þайлове: " + e.getMessage());
        }
    }

    public static void fifthTheme(int points) {
        Scanner sc = new Scanner(System.in);

        try (BufferedReader reader = new BufferedReader(new FileReader("fifthThemeQuestions.csv"))) {

            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                {
                    if (parts.length == 7) {
                        String questionNumber = parts[0];
                        String question = parts[1];
                        String answerA = parts[2];
                        String answerB = parts[3];
                        String answerC = parts[4];
                        String answerD = parts[5];
                        int correctAnswer = Integer.parseInt(parts[6]);
                        System.out.println(questionNumber + "\n " + question + "\n   Answer 1: " + answerA + "\n   Answer 2: " + answerB + "\n   Answer 3: " + answerC + "\n   Answer 4: " + answerD);
                        int answer = sc.nextInt();
                        while (answer < 1 || answer > 4) {
                            System.out.println("Incorrect input!");
                            System.out.println("Try again: ");
                            answer = sc.nextInt();
                        }

                        if (answer != correctAnswer) {
                            System.out.println("Wrong answer!");
                            System.out.println("The correct answer was number: " + correctAnswer);
                            System.out.println("Your points are: " + points + "\n");
                            gameOver(points);
                        } else {
                            System.out.println("Correct answer!");
                            points++;
                            System.out.println("Your points are: " + points + "\n");
                        }
                    }
                }
            }
            answeredEverythingCorrectly(points);
        } catch (IOException e) {
            System.out.println("грешка при четене/писане на þайлове: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to my quiz. Here are the rules: \n   Rule 1: You get shown 5 themes, you can choose which one you want to try. \n   Rule 2: Every theme has 5 questions with 2 or 4 answers. The game lasts until you make a mistake.\n   Rule 3: You have to answer with the number before the answer. \n   Rule 4: If you want to you can choose another theme after completing the first one.");
        System.out.println();
        System.out.println("Here are the themes: \n   1.Football \n   2.History\n   3.True or False\n   4.Games\n   5.Countries");
        System.out.println();
        System.out.print("Which theme would you choose? ");
        int points = 0;
        int decider = sc.nextInt();
        System.out.println();
        switch (decider) {
            case 1:
                firstTheme(points);
            case 2:
                secondTheme(points);
            case 3:
                thirdTheme(points);
            case 4:
                fourthTheme(points);
            case 5:
                fifthTheme(points);
        }
    }
}