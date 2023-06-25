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
            }
        } else {
            System.exit(0);
        }
    }

    public static void firstTheme(int points) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Question 1: \n What is Ronaldo's number?");
        System.out.println("   1. 4\n   2. 8\n   3. 7\n   4. 13");
        int answer1 = sc.nextInt();
        while (answer1 < 1 || answer1 > 4) {
            if (answer1 < 1 || answer1 > 4) {
                System.out.println("Incorrect input!");
                System.out.println("Try again: ");
                answer1 = sc.nextInt();
            }
        }

        switch (answer1) {
            case 1, 2, 4:
                System.out.println("Wrong answer!");
                System.out.println("Your points are: " + points);
                gameOver(points);
            case 3:
                System.out.println("Correct answer!");
                points++;
                System.out.println("Your points are: " + points);

        }
        System.out.println("Question 2: \n How many people are there in a football team?");
        System.out.println("   1. 5\n   2. 6\n   3. 21\n   4. 11");
        int answer2 = sc.nextInt();

        while (answer2 < 1 || answer2 > 4) {
            if (answer2 < 1 || answer2 > 4) {
                System.out.println("Incorrect input!");
                System.out.println("Try again: ");
                answer2 = sc.nextInt();
            }
        }
        switch (answer2) {
            case 1, 2, 3:
                System.out.println("Wrong answer!");
                System.out.println("Your points are: " + points);
                gameOver(points);
            case 4:
                System.out.println("Correct answer!");
                points++;
                System.out.println("Your points are: " + points);
        }

        System.out.println("Question 3: \n Which football team is based in the Bulgarian city Razgrad?");
        System.out.println("   1. Ludogoretz\n   2. Manchester United\n   3. Barcelona\n   4. Levski");
        int answer3 = sc.nextInt();
        while (answer3 < 1 || answer3 > 4) {
            if (answer3 < 1 || answer3 > 4) {
                System.out.println("Incorrect input!");
                System.out.println("Try again: ");
                answer3 = sc.nextInt();
            }
        }
        switch (answer3) {
            case 2, 3, 4:
                System.out.println("Wrong answer!");
                System.out.println("Your points are: " + points);
                gameOver(points);
            case 1:
                System.out.println("Correct answer!");
                points++;
                System.out.println("Your points are: " + points);

        }
        System.out.println("Question 4: \n Which football team is based in the Bulgarian city Razgrad?");
        System.out.println("   1. Ludogoretz\n   2. Manchester United\n   3. Barcelona\n   4. Levski");
        int answer4 = sc.nextInt();
        while (answer4 < 1 || answer4 > 4) {
            if (answer4 < 1 || answer4 > 4) {
                System.out.println("Incorrect input!");
                System.out.println("Try again: ");
                answer4 = sc.nextInt();
            }
        }
        switch (answer4) {
            case 2, 3, 4:
                System.out.println("Wrong answer!");
                System.out.println("Your points are: " + points);
                gameOver(points);
            case 1:
                System.out.println("Correct answer!");
                points++;
                System.out.println("Your points are: " + points);
        }
        System.out.println("Question 5: \n What is Ronaldo's number?");
        System.out.println("   1. 4\n   2. 8\n   3. 7\n   4. 13");
        int answer5 = sc.nextInt();
        while (answer5 < 1 || answer5 > 4) {
            if (answer5 < 1 || answer5 > 4) {
                System.out.println("Incorrect input!");
                System.out.println("Try again: ");
                answer5 = sc.nextInt();
            }
        }

        switch (answer5) {
            case 1, 2, 4:
                System.out.println("Wrong answer!");
                System.out.println("Your points are: " + points);
                gameOver(points);
            case 3:
                System.out.println("Correct answer!");
                points++;
                System.out.println("Your points are: " + points);
        }
        answeredEverythingCorrectly(points);
    }

    public static void secondTheme(int points) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Question 1: \n What is Ronaldo's number?");
        System.out.println("   1. 4\n   2. 8\n   3. 7\n   4. 13");
        int answer1 = sc.nextInt();
        while (answer1 < 1 || answer1 > 4) {
            if (answer1 < 1 || answer1 > 4) {
                System.out.println("Incorrect input!");
                System.out.println("Try again: ");
                answer1 = sc.nextInt();
            }
        }

        switch (answer1) {
            case 1, 2, 4:
                System.out.println("Wrong answer!");
                System.out.println("Your points are: " + points);
                gameOver(points);
            case 3:
                System.out.println("Correct answer!");
                points++;
                System.out.println("Your points are: " + points);
        }
        answeredEverythingCorrectly(points);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to my quiz. Here are the rules: \n   Rule 1: You get shown 5 themes, you can choose which one you want to try. \n   Rule 2: Every theme has 6 questions with 2 or 4 answers. The game lasts until you make a mistake.\n   Rule 3: If you want to you can choose another theme after completing the first one.");
        System.out.println();
        System.out.println("Here are the themes: \n   1.Football \n   2.History\n   3.True or False\n   4.Games\n   5.Countries");
        System.out.println();
        System.out.print("Which theme would you choose? ");
        int points = 0;
        int decider = sc.nextInt();
        switch (decider) {
            case 1:
                firstTheme(points);
            case 2:
                secondTheme(points);
        }
    }
}