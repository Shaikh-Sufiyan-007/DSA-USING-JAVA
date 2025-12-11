public class RemoveDuplicate {
    public static void f(String str, int idx, StringBuilder newStr, boolean[] map) {
        if(idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true) {
            // Duplicate
            f(str, idx+1, newStr, map);
        } else {
            map[currChar-'a'] = true;
            f(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String name = "ssuuffiiyyaann";
        f(name, 0, new StringBuilder(""), new boolean[26]);
    }
}
