class Solution {
    //to check the position is safe for the queen or not
    public static boolean isSafe(int row, int col, String[][] board) {

        //vertical check
        for(int i=0; i<board.length; i++) {
            if(board[i][col]=="Q") {
                return false;
            }
        }

        //horizontal check
        for(int i=0; i<board.length; i++) {
            if(board[row][i]=="Q") {
                return false;
            }
        }

        //top left check
        for(int i=row,j=col; i>=0 && j>=0; i--,j--) {
            if(board[i][j]=="Q") {
                    return false;
            }
        }

        //top right check
        for(int i=row,j=col; i>=0 &&j<board.length; i--,j++) {
            if(board[i][j]=="Q") {
                    return false;
            }
        }

        //bottom left check
        for(int i=row,j=col; i<board.length && j>=0; i++,j--) {
            if(board[i][j]=="Q") {
                    return false;
            }
        }

        //bottom right check
        for(int i=row,j=col; i<board.length && j<board.length; i++,j++) {
            if(board[i][j]=="Q") {
                    return false;
            }
        }
        return true;
    }


    public static void saveBoard(List <List <String>> allBoards, String board[][]) {
        String row;
        List <String> newBoard = new ArrayList<>();

        for(int i=0; i<board.length; i++) {
            row = "";
            for(int j=0; j<board.length; j++) {
                if(board[i][j]=="Q") {
                    row += "Q";
                } else {
                    row += ".";
                }
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }

    //recursive function 
    public static void helper(List<List <String>> allBoards, String board[][], int col) {
        if(col == board.length) {
            saveBoard(allBoards, board);
            return;
        }
        for(int row=0; row<board.length; row++) {
            if(isSafe(row, col, board)) {
                board[row][col] = "Q";
                helper(allBoards, board, col+1);
                board[row][col] = ".";
            }
        }
    }

    //main function 
    public static List<List <String>> solveNQueens(int n) {
        List<List <String>> allBoards = new ArrayList<>();
        String board[][] = new String[n][n];
        helper(allBoards,board,0);
        return allBoards;
    }
}