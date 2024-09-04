package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Complex {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        stackOverFlow();
    }

    public static void stackOverFlow() {
        int scorePlayer1 = 0;
        int scorePlayer2 = 0;

        System.out.println("Please enter your name: ");
        String name = sc.nextLine();
        System.out.println("Please enter your starting score: ");
        int startingScore = readInt(sc);

        //Create Player
        Player player1 = new Player(name, startingScore);
        player1.increaseScore();

        //Visa player1 information
        System.out.println(player1.getName() + " has score " + player1.getScore());
        System.out.printf("%s has score %d\n", player1.getName(), player1.getScore());

        System.out.println("Please enter player twos name: ");
        String player2Name = sc.nextLine();
        System.out.println("You entered player 2 name as " +player2Name);
        System.out.println("Please enter starting score for player 2: ");
        int player2Score = readInt(sc);

        //Create player 2
        Player player2 = new Player(player2Name, player2Score);
        System.out.println(player2.getName() + "´s score is: " + player2.getScore());

    }

    public static int readInt(Scanner scanner) {
        while (true) {
            try {
                int score = sc.nextInt();
                sc.nextLine();
                return score;
            } catch(InputMismatchException e) {
                System.out.println("You can't do that. Try again.");
                sc.nextLine();
            }
        }
    }
}

