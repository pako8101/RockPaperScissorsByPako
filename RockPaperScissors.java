import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private static final String Rock = "rock";
    private static final String Scissors = "scissors";
    private static final String Paper = "paper";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose [r]ock, [p]aper or [s]cissors: ");
        String playerMove = scanner.nextLine();

        if (playerMove.equals("rocks") || playerMove.equals("r")) {
            playerMove = Rock;
        } else if (playerMove.equals("scissors") || playerMove.equals("s")) {
            playerMove = Scissors;

        } else if (playerMove.equals("paper") || playerMove.equals("p")) {
            playerMove = Paper;

            }else {
            System.out.println("Invalid input. Try again....");
            return;
        }
        Random random = new Random();
        int compRandomNumber = random.nextInt(4);
        String comMove = "";
        switch (compRandomNumber) {
            case 1:
                comMove = Rock;
                break;
            case 2:
                comMove = Paper;
                break;
            case 3:
                comMove = Scissors;
                break;
        }
            System.out.printf("The computer choose: %s.%n", comMove);
        if (playerMove.equals(Rock)&&comMove.equals(Scissors)
        ||  playerMove.equals(Paper)&&comMove.equals(Rock)||
        playerMove.equals(Scissors)&& comMove.equals(Paper)){
            System.out.println("You win.");
        } else if (comMove.equals(Rock)&&playerMove.equals(Scissors)
                ||  comMove.equals(Paper)&&playerMove.equals(Rock)||
                comMove.equals(Scissors)&& playerMove.equals(Paper)) {
            System.out.println("You lose.");
        }else {
            System.out.println("This game was draw.");
        }

    }
        }
