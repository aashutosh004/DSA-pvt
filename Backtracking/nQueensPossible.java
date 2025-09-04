package Backtracking;

public class nQueensPossible {

    // isSafe
    public static boolean isSafe(char board[][], int row, int col)
    {
        // vertical
        for(int i = row-1; i>=0; i--)
        {
            if(board[i][col] == 'Q')
            {
                return false;
            }
        }

        // left diagonal
        for(int i = row-1, j = col-1; i>=0 && j>=0; i--, j--)
        {
            if(board[i][j] == 'Q')
            {
                return false;
            }
        }

        // right diagonals
        for(int i = row-1, j = col+1; i>=0 && j<board.length; i--, j++)
        {
            if(board[i][j] == 'Q')
            {
                return false;
            }
        }
        return true;
    }

    // printBoard
    public static void printBoard(char board[][])
    {
        for(int i = 0; i<board.length; i++)
        {
            for(int j = 0; j<board.length; j++)
            {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // nQueens
    public static boolean nQueens(char board[][], int row)
    {
        // base case
        if(row == board.length)
        {
            return true;
        }

        // work
        for(int j = 0; j<board.length; j++)
        {
            if(isSafe(board, row, j))
            {
                board[row][j] = 'Q';
                if(nQueens(board, row+1))
                {
                    return true;
                } 
                board[row][j] = 'X';
            }
        }
        return false;
    }

    // main
    public static void main(String[] args)
    {
        int n = 3;
        
        // initialization
        char board[][] = new char[n][n];
        for(int i = 0; i<board.length; i++)
        {
            for(int j = 0; j<board.length; j++)
            {
                board[i][j] = 'X';
            }
        }
        if(nQueens(board, 0))
        {
            System.out.println("Solution is Possible");
            printBoard(board);
        }
        else
        {
            System.out.println("Solution is not possible");
        }
    }
}
