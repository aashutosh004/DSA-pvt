package Backtracking;
public class gridWays 
{
     public static int GridWays(int x, int y, int n, int m)
     {
        // base case
        if(x == n-1 || y == m-1)
        {
            return 1;
        }
        else if(x == n || y == m)
        {
            return 0;
        }

        // work
        return GridWays(x+1, y, n, m) + GridWays(x, y+1, n, m);
        // rigth work + down work = total ways
     }
     
     // main
     public static void main(String[] args) 
     {
        System.out.println(GridWays(0, 0, 3, 4));   
     }
}
