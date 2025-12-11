package Strings;

public class shortestPath {
    public static float isShortestPath(String path) {
        int x = 0 , y = 0;
        for(int i=0; i < path.length(); i++) {
            int dir = path.charAt(i);
            // North
            if(dir == 'N') {
                y++;
            } 

            // South 
            if(dir == 'S') {
                y--;
            }

            // East 
            if(dir == 'E') {
                x++;
            }

            // West 
            if(dir == 'W') {
                x--;
            }
        }

        int X2 = x*x;
        int Y2 = y*y;

        return (float) Math.sqrt(X2 + Y2);
    }
    public static void main(String[] args) {    
        String path = "WNEENESENNN";
        System.out.print(isShortestPath(path));
    }
}
