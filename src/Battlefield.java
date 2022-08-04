import java.util.Scanner;
enum VehicleTypes {
    AIRCRAFT,
    BATTLESHIP,
    SUBMARINE,
    CRUISER,
    DESTROYER
}
public class Battlefield {
    public String[][] PlayerField;
    public String[][] PlayerFogField;
    public Battlefield() {
        PlayerField = new String[][]{
                {" ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"},
                {"A", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
                {"B", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
                {"C", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
                {"D", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
                {"E", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
                {"F", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
                {"G", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
                {"H", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
                {"I", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
                {"J", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"}
        };
        PlayerFogField = new String[][]{
                {" ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"},
                {"A", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
                {"B", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
                {"C", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
                {"D", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
                {"E", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
                {"F", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
                {"G", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
                {"H", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
                {"I", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
                {"J", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"}
        };
    }

    public void getInput() {
            Scanner scanner = new Scanner(System.in);
            getAircraftInput(scanner);
            getBattleshipInput(scanner);
            getSubmarineInput(scanner);
            getCruiserInput(scanner);
            getDestroyerInput(scanner);
    }
    public void getAircraftInput(Scanner scanner) {
        String coord1;
        String coord2;
        int coord1Num;
        int coord2Num;
        String letter1;
        String letter2;
        System.out.println("\nEnter the coordinates of the Aircraft Carrier (5 cells):\n");
        do {
            String line = scanner.nextLine();
            coord1 = line.split(" ")[0];
            coord2 = line.split(" ")[1];

            letter1 = coord1.charAt(0) + "";
            letter2 = coord2.charAt(0) + "";

            coord1Num = coord1.length() == 3 ? Integer.parseInt(coord1.charAt(1) + "" + coord1.charAt(2)) :
                    Integer.parseInt(coord1.charAt(1) + "");
            coord2Num = coord2.length() == 3 ? Integer.parseInt(coord2.charAt(1) + "" + coord2.charAt(2)) :
                    Integer.parseInt(coord2.charAt(1) + "");
        } while (error(letter1, letter2, coord1Num, coord2Num, VehicleTypes.AIRCRAFT));

        changeCells(letter1, letter2, coord1Num, coord2Num);
        printPlayerField();
    }

    public void getBattleshipInput(Scanner scanner) {
        String coord1;
        String coord2;
        int coord1Num;
        int coord2Num;
        String letter1;
        String letter2;
        System.out.println("\nEnter the coordinates of the Battleship (4 cells):\n");

        do {
            String line = scanner.nextLine();
            coord1 = line.split(" ")[0];
            coord2 = line.split(" ")[1];

            letter1 = coord1.charAt(0) + "";
            letter2 = coord2.charAt(0) + "";

            coord1Num = coord1.length() == 3 ? Integer.parseInt(coord1.charAt(1) + "" + coord1.charAt(2)) :
                    Integer.parseInt(coord1.charAt(1) + "");
            coord2Num = coord2.length() == 3 ? Integer.parseInt(coord2.charAt(1) + "" + coord2.charAt(2)) :
                    Integer.parseInt(coord2.charAt(1) + "");
        } while (error(letter1, letter2, coord1Num, coord2Num, VehicleTypes.BATTLESHIP));

        changeCells(letter1, letter2, coord1Num, coord2Num);
        printPlayerField();
    }

    public void getSubmarineInput(Scanner scanner) {
        String coord1;
        String coord2;
        int coord1Num;
        int coord2Num;
        String letter1;
        String letter2;
        System.out.println("\nEnter the coordinates of the Submarine (3 cells):\n");

        do {
            String line = scanner.nextLine();
            coord1 = line.split(" ")[0];
            coord2 = line.split(" ")[1];

            letter1 = coord1.charAt(0) + "";
            letter2 = coord2.charAt(0) + "";

            coord1Num = coord1.length() == 3 ? Integer.parseInt(coord1.charAt(1) + "" + coord1.charAt(2)) :
                    Integer.parseInt(coord1.charAt(1) + "");
            coord2Num = coord2.length() == 3 ? Integer.parseInt(coord2.charAt(1) + "" + coord2.charAt(2)) :
                    Integer.parseInt(coord2.charAt(1) + "");
        } while (error(letter1, letter2, coord1Num, coord2Num, VehicleTypes.SUBMARINE));

        changeCells(letter1, letter2, coord1Num, coord2Num);
        printPlayerField();

    }
    public void getCruiserInput(Scanner scanner) {
        String coord1;
        String coord2;
        int coord1Num;
        int coord2Num;
        String letter1;
        String letter2;
        System.out.println("\nEnter the coordinates of the Cruiser (3 cells):\n");

        do {
            String line = scanner.nextLine();
            coord1 = line.split(" ")[0];
            coord2 = line.split(" ")[1];

            letter1 = coord1.charAt(0) + "";
            letter2 = coord2.charAt(0) + "";

            coord1Num = coord1.length() == 3 ? Integer.parseInt(coord1.charAt(1) + "" + coord1.charAt(2)) :
                    Integer.parseInt(coord1.charAt(1) + "");
            coord2Num = coord2.length() == 3 ? Integer.parseInt(coord2.charAt(1) + "" + coord2.charAt(2)) :
                    Integer.parseInt(coord2.charAt(1) + "");
        } while (error(letter1, letter2, coord1Num, coord2Num, VehicleTypes.CRUISER));

        changeCells(letter1, letter2, coord1Num, coord2Num);
        printPlayerField();

    }

    public void getDestroyerInput(Scanner scanner) {
        String coord1;
        String coord2;
        int coord1Num;
        int coord2Num;
        String letter1;
        String letter2;
        System.out.println("\nEnter the coordinates of the Destroyer (2 cells):\n");

        do {
            String line = scanner.nextLine();
            coord1 = line.split(" ")[0];
            coord2 = line.split(" ")[1];

            letter1 = coord1.charAt(0) + "";
            letter2 = coord2.charAt(0) + "";

            coord1Num = coord1.length() == 3 ? Integer.parseInt(coord1.charAt(1) + "" + coord1.charAt(2)) :
                    Integer.parseInt(coord1.charAt(1) + "");
            coord2Num = coord2.length() == 3 ? Integer.parseInt(coord2.charAt(1) + "" + coord2.charAt(2)) :
                    Integer.parseInt(coord2.charAt(1) + "");
        } while (error(letter1, letter2, coord1Num, coord2Num, VehicleTypes.DESTROYER));


        changeCells(letter1, letter2, coord1Num, coord2Num);
        printPlayerField();

    }
    public void printPlayerField(){
        for (String[] chars : PlayerField) {
            for (String letter : chars) {
                switch (letter) {
                    case "~": {
                        System.out.print("~ ");
                        break;
                    }
                    case "O": {
                        System.out.print("O ");
                        break;
                    }
                    case "M": {
                        System.out.print("M ");
                        break;
                    }
                    case "X": {
                        System.out.print("X ");
                        break;
                    }
                    default:
                        System.out.print(letter + " ");
                        break;
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public void printPlayerFogField() {
        for (String[] chars : PlayerFogField) {
            for (String letter : chars) {
                switch (letter) {
                    case "~": {
                        System.out.print("~ ");
                        break;
                    }
                    case "O": {
                        System.out.print("O ");
                        break;
                    }
                    case "M": {
                        System.out.print("M ");
                        break;
                    }
                    case "X": {
                        System.out.print("X ");
                        break;
                    }
                    default:
                        System.out.print(letter + " ");
                        break;
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public void changeCells(String letter1, String letter2, int num1, int num2) {
        int letter1Position = getLetterIndex(letter1);
        int letter2Position = getLetterIndex(letter2);
        if (isVertical(letter1, letter2, num1, num2)) {
            for (int i = Math.min(letter1Position, letter2Position); i <= Math.max(letter1Position, letter2Position); i++) {
                PlayerField[i][num1] = "O";
            }
        } else {
            for (int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++) {
                PlayerField[letter1Position][i] = "O";
            }
        }
    }

    public boolean isVertical(String letter1, String letter2, int num1, int num2) {
        return (!letter1.equals(letter2)) && (num1 == num2);
    }

    public int getLetterIndex(String letter) {
        for (int i = 1; i < PlayerField.length; i++) {
            if (letter.equalsIgnoreCase(PlayerField[i][0])) {
                return i;
            }
        }
        return -1;
    }
    public boolean tooclose(String letter1, String letter2, int num1, int num2) {
        int letter1Position = getLetterIndex(letter1);
        int letter2Position = getLetterIndex(letter2);
        int minletterPosition = Math.min(letter1Position, letter2Position) - 1;
        int maxletterPosition = Math.max(letter1Position, letter2Position) + 1;
        if (maxletterPosition >= 11) {
            maxletterPosition = 10;
        }
        int minnum = Math.min(num1, num2);
        int maxnum = Math.max(num1, num2);
        if (maxnum >= 11) {
            maxnum = 10;
        }
        for (int i = minletterPosition; i <= maxletterPosition; i++) {
            for (int j = minnum; j <= maxnum; j++) {
                if (PlayerField[i][j] == "O") {
                    System.out.println("\nError! You placed it too close to another one. Try again:\n");
                    return true;
                }
            }
        }
        return false;
    }
    public boolean error(String letter1, String letter2, int num1, int num2, VehicleTypes type) {
        if (getLetterIndex(letter1) == -1 || getLetterIndex(letter2) == -1) {
            System.out.println("\nError! Wrong ship location! Try again:\n");
            return true;
        }
        int letter1Position = getLetterIndex(letter1);
        int letter2Position = getLetterIndex(letter2);
        if (((letter1Position != letter2Position) && (num1 != num2))) {
            System.out.println("\nError! Wrong ship location! Try again:\n");
            return true;
        }
        if (tooclose(letter1, letter2, num1, num2)) {
            return true;
        }
        if (isVertical(letter1, letter2, num1, num2)) {
            switch (type) {
                case AIRCRAFT: {
                    if ((Math.abs(letter1Position - letter2Position) + 1) != 5) {
                        System.out.println("\nError! Wrong length of the Aircraft Carrier! Try again:\n");
                        return true;
                    }
                    break;
                }
                case BATTLESHIP: {
                    if ((Math.abs(letter1Position - letter2Position) + 1) != 4) {
                        System.out.println("\nError! Wrong length of the Battleship! Try again:\n");
                        return true;
                    }
                    break;
                } case SUBMARINE: {
                    if ((Math.abs(letter1Position - letter2Position) + 1) != 3) {
                        System.out.println("\nError! Wrong length of the Submarine! Try again:\n");
                        return true;
                    }
                    break;
                }
                case CRUISER: {
                    if ((Math.abs(letter1Position - letter2Position) + 1) != 3) {
                        System.out.println("\nError! Wrong length of the Cruiser! Try again:\n");
                        return true;
                    }
                    break;
                }
                case DESTROYER: {
                    if ((Math.abs(letter1Position - letter2Position) + 1) != 2) {
                        System.out.println("\nError! Wrong length of the Destroyer! Try again:\n");
                        return true;
                    }
                    break;
                }
            }
        } else {
            switch (type) {
                case AIRCRAFT: {
                    if ((Math.abs(num1 - num2) + 1) != 5) {
                        System.out.println("\nError! Wrong length of the Aircraft Carrier! Try again:\n");
                        return true;
                    }
                    break;
                }
                case BATTLESHIP: {
                    if ((Math.abs(num1 - num2) + 1) != 4) {
                        System.out.println("\nError! Wrong length of the Battleship! Try again:\n");
                        return true;
                    }
                    break;
                }
                case SUBMARINE: {
                    if ((Math.abs(num1 - num2) + 1) != 3) {
                        System.out.println("\nError! Wrong length of the Submarine! Try again:\n");
                        return true;
                    }
                    break;
                }
                case CRUISER: {
                    if ((Math.abs(num1 - num2) + 1) != 3) {
                        System.out.println("\nError! Wrong length of the Cruiser! Try again:\n");
                        return true;
                    }
                    break;
                }
                case DESTROYER: {
                    if ((Math.abs(num1 - num2) + 1) != 2) {
                        System.out.println("\nError! Wrong length of the Destroyer! Try again:\n");
                        return true;
                    }
                    break;
                }

            }

        }
        return false;

    }

    public boolean wrongCoordinateForShot(String letter1, int letter1Position, int coord1Num) {
        if (getLetterIndex(letter1) == -1) {
            System.out.println("\nError! Wrong ship location! Try again:\n");
            return true;
        }
        if (letter1Position >= 11 || coord1Num >= 11 || coord1Num < 0) {
            System.out.println("Error! You entered the wrong coordinates! Try again:");
            return true;
        }
        return false;
    }
    public boolean checkShip() {
        for (String[] chars : PlayerField) {
            for (String letter : chars) {
                if (letter == "O")
                    return true;
            }
        }
        return false;
    }
    public void end() {
        int count1= 0;
        for (String[] chars : PlayerField) {
            for (String letter : chars) {
                if (letter == "O")
                    count1++;
            }
        }
        if(count1 == 0) {
            System.out.println("player2 win");
        } else System.out.println("player1 win");
    }

}
