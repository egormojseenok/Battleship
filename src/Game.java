import java.util.Scanner;

public class Game {
    public void start() {
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        System.out.println("Player 1, place your ships on the game field\n");
        player1.battlefield.printPlayerField();
        player1.battlefield.getInput();
        System.out.println("Pass the move to another play\n");

        System.out.println("Player 2, place your ships on the game field\n");
        player2.battlefield.printPlayerField();
        player2.battlefield.getInput();
        System.out.println("Pass the move to another play\n");

        while (player1.battlefield.checkShip() == player2.battlefield.checkShip()) {
            player2.battlefield.printPlayerFogField();
            System.out.println("----------------------------------");
            player1.battlefield.printPlayerField();
            System.out.println("Player 1, it's your turn:\n");
            int coord1Num;
            int letter1Position;
            String letter1;
            do {
                Scanner scanner = new Scanner(System.in);
                String line = scanner.nextLine();
                letter1 = line.charAt(0) + "";
                coord1Num = line.length() == 3 ? Integer.parseInt(line.charAt(1) + "" + line.charAt(2)) :
                        Integer.parseInt(line.charAt(1) + "");
                letter1Position = player1.battlefield.getLetterIndex(letter1);
            } while (player2.battlefield.wrongCoordinateForShot(letter1,letter1Position,coord1Num));
            if (player2.battlefield.PlayerField[letter1Position][coord1Num] == "O") {
                player1.battlefield.PlayerFogField[letter1Position][coord1Num] = "X";
                player2.battlefield.PlayerField[letter1Position][coord1Num] = "X";
                System.out.println("You hit a ship!\n");
            } else {
                player1.battlefield.PlayerFogField[letter1Position][coord1Num] = "M";
                player2.battlefield.PlayerField[letter1Position][coord1Num] = "M";
                System.out.println("You missed!\n");
            }
            if (!player2.battlefield.checkShip()) {
                break;
            }
            System.out.println("Pass the move to another play\n");
//======================================================================================
            player1.battlefield.printPlayerFogField();
            System.out.println("----------------------------------");
            player2.battlefield.printPlayerField();
            System.out.println("Player 2, it's your turn:\n");
            int coord1Num2;
            int letter1Position2;
            String letter12;
            do {
                Scanner scanner1 = new Scanner(System.in);
                String line = scanner1.next();
                letter12 = line.charAt(0) + "";
                coord1Num2 = line.length() == 3 ? Integer.parseInt(line.charAt(1) + "" + line.charAt(2)) :
                        Integer.parseInt(line.charAt(1) + "");
                letter1Position2 = player1.battlefield.getLetterIndex(letter12);
            } while (player1.battlefield.wrongCoordinateForShot(letter12,letter1Position2,coord1Num2));
            if (player1.battlefield.PlayerField[letter1Position2][coord1Num2] == "O") {
                player2.battlefield.PlayerFogField[letter1Position2][coord1Num2] = "X";
                player1.battlefield.PlayerField[letter1Position2][coord1Num2] = "X";
                System.out.println("You hit a ship!\n");
            } else {
                player2.battlefield.PlayerFogField[letter1Position2][coord1Num2] = "M";
                player1.battlefield.PlayerField[letter1Position2][coord1Num2] = "M";
                System.out.println("You missed!\n");
            }
            if (!player1.battlefield.checkShip()) {
                break;
            }
            System.out.println("Pass the move to another play\n");
        }
        player2.battlefield.end();
    }


}
