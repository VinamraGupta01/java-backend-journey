//TOTAL PERMUTATIONS=n!
/* 
class Backtracking {
    public static void printPermutation(String str,String perm,int pos){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            printPermutation(newStr,perm+currChar,pos+1);
        }
    }
    public static void main(String args[]){
        String str="ABC";
        printPermutation(str,"",0);
    }
}
*/

//N-QUEENS PROBLEM 
/*
class Backtracking {
    static int N = 4;
    public static void solve(char[][] board, int row){
        if (row == N) {
            printBoard(board);
            System.out.println();
            return;
        }
        for (int col = 0; col < N; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';   //PLACE
                solve(board, row + 1);   //RECURSE
                board[row][col] = '.';   //BACKTRACK
            }
        }
    }
    public static boolean isSafe(char[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q')
                return false;
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < N; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }
        return true;
    }
    public static void printBoard(char[][] board) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        char[][] board = new char[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = '.';
            }
        }
        solve(board, 0);
    }
}
*/

//SUDOKU SOLVER 
class Backtracking {
    public static boolean solveSudoku(int[][] board) {
        // FIND EMPTY CELLS
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == 0) {
                    // TRY NUMBERS FROM 1 TO 9
                    for (int num = 1; num <= 9; num++) {
                        if (isSafe(board, row, col, num)) {
                            board[row][col] = num;   
                            if (solveSudoku(board))
                                return true;
                            board[row][col] = 0;     // BACKTRACK
                        }
                    }
                    return false;  
                }
            }
        }
        return true; // SOLVED
    }
    // SAFETY CHECK
    public static boolean isSafe(int[][] board, int row, int col, int num) {
        // ROW CHECK
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num)
                return false;
        }
        // COLUMN CHECK
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num)
                return false;
        }
        // 3x3 BOX CHECK
        int startRow = row - row % 3;
        int startCol = col - col % 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[startRow + i][startCol + j] == num)
                    return false;
            }
        }
        return true;
    }
    // PRINT BOARD
    public static void printBoard(int[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int[][] board = {
            {3, 0, 6, 5, 0, 8, 4, 0, 0},
            {5, 2, 0, 0, 0, 0, 0, 0, 0},
            {0, 8, 7, 0, 0, 0, 0, 3, 1},
            {0, 0, 3, 0, 1, 0, 0, 8, 0},
            {9, 0, 0, 8, 6, 3, 0, 0, 5},
            {0, 5, 0, 0, 9, 0, 6, 0, 0},
            {1, 3, 0, 0, 0, 0, 2, 5, 0},
            {0, 0, 0, 0, 0, 0, 0, 7, 4},
            {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
        if (solveSudoku(board)) {
            printBoard(board);
        } else {
            System.out.println("No solution exists");
        }
    }
}
