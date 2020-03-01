public class TicTacToe {

    public static void main(String[] args) {

        char[][] gameBoard = {

                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},

        };

        printGameBoard(gameBoard);


    }

    public static void printGameBoard(char[][] gameBoard) {
        for(char[] row : gameBoard) {
            for(char value : row) {
                System.out.print(value);
            }
            System.out.println();
        }
    }


}
