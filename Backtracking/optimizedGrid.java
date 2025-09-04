package Backtracking;

public class optimizedGrid 
{
    // factorial
    public static int fact(int n)
    {
        // base case
        if(n == 0 || n == 1)
        {
            return 1;
        }
        else if(n<0)
        {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }

        // work 
        int fact1 = n * fact(n-1);
        return fact1;
    }

    // gridWays
    public static int gridWays(int n, int m)
    {
        // work
        int totalWays = ((n-1)+(m-1));
        int nume = fact(totalWays);
        int denom = fact(n-1) * fact(m-1);
        int result = nume/denom;
        return result;
    }

    // main
    public static void main(String[] args) 
    {
        System.out.println(gridWays(3, 4));   
    }
}
