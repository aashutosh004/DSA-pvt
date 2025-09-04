package Backtracking;
public class findPermutations {

    public static void findPerm(String str, String ans)
    {
        // base case
        if(str.length() == 0)
        {
            System.out.println(ans);
            return;
        }
        // work
        for(int i = 0; i<str.length(); i++)
        {
            char curr = str.charAt(i);

            // "abcde" --> "ab" + "de", c is at i index so its excluded
            String NewStr = str.substring(0, i) + str.substring(i+1);
            findPerm(NewStr, ans+curr);
        }
    }
    public static void main(String[] args)
    {
        String str = "abc";
        findPerm(str, "");
    }
}
