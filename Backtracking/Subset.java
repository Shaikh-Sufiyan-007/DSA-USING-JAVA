package Backtracking;

public class Subset {
    public static void f(String str, String ans, int i) {
        if(i == str.length()) {
            if(ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        f(str, ans+str.charAt(i), i+1);
        f(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        f(str, "", 0);
    } 
}
