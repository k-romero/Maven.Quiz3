package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        String[] result = new String[3];
        for (int i = 0; i < 3; i++) {
            result[i] = board[value][i];
        }
        return result;
    }

    public String[] getColumn(Integer value) {
        String[] result = new String[3];
        for (int i = 0; i < 3; i++) {
            result[i] = board[i][value];
        }
        return result;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        if (getRow(rowIndex)[0] == getRow(rowIndex)[1]
                && getRow(rowIndex)[1] == getRow(rowIndex)[2]) {
            return true;
        }

        return false;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        if (getColumn(columnIndex)[0] == getColumn(columnIndex)[1]
                && getColumn(columnIndex)[1] == getColumn(columnIndex)[2]) {
            return true;
        }

        return false;
    }

    public String getWinner() {
        String winner = "";
        for (int i = 0; i < 3; i++) {
            if(isColumnHomogeneous(i)){
                winner = getColumn(i)[0];
                break;
            }
            else if(isRowHomogenous(i)){
                winner = getRow(i)[0];
                break;
            }
        }

        if(topLeftBotRightCheck("X")){
            winner = "X";
        } else if(topRightBotLeftCheck("X")){
            winner = "X";
        } else if(topLeftBotRightCheck("O")){
            winner = "O";
        } else if(topRightBotLeftCheck("O")){
            winner = "O";
        }

        return winner;
    }

    public String[][] getBoard() {
        return null;
    }

    public boolean topLeftBotRightCheck(String playerPiece) {
        boolean outcome = false;
        for (int i = 0; i <= 2; i++) {
            if (!board[i][i].equals(playerPiece)) {
                outcome = false;
                break;
            } else {
                outcome = true;
            }
        }
        return outcome;
    }

    //    Diagonal (/)
    public boolean topRightBotLeftCheck(String playerPiece) {
        boolean outcome = false;
        int count = 0;
        for (int i = 2; i >= 0; i--) {
            if (!board[count][i].equals(playerPiece)) {
                outcome = false;
                break;
            } else {
                outcome = true;
                count++;
            }
        }
        return outcome;
    }
}
