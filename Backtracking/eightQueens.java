package Backtracking;
public class eightQueens
{

    // count
    static int count = 0;
    
    // printBoard
    public static void printBoard(char board[][])
    {
        System.out.println("------ Chess Board ------");
        for(int i = 0; i<board.length; i++)
        {
            for(int j = 0; j<board.length; j++)
            {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // isSafe
    public static boolean isSafe(char board[][], int row, int col)
    {
        // vertical upward
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

        // right diagonal
        for(int i = row-1, j = col+1; i>=0 && j<board.length; i--, j++)
        {
            if(board[i][j] == 'Q')
            {
                return false;
            }
        }
        return true;
    }

    // nQueens
    public static void nQueens(char board[][], int row)
    {
        // base case
        if(row == board.length)
        {
            printBoard(board);
            count++;
            return;
        }
        // work
        for(int j = 0; j<board.length; j++)
        {
            if(isSafe(board, row, j))
            {
                board[row][j] = 'Q';
                nQueens(board, row+1);
                // backtracking
                board[row][j] = 'X';
            }
        }
    }

    // Main
    public static void main(String args[])
    {
        int n = 4;
        // initialization
        char board[][] = new char[n][n];
        for(int i = 0; i<board.length; i++)
        {
            for(int j = 0; j<board.length; j++)
            {
                board[i][j] = 'X';
            }
        }

        // printBoard(board);

        nQueens(board, 0);

        // count print
        System.out.println("Total number of ways = " + count);
    }
}