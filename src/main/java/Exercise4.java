public class Exercise4 {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        System.out.println(getDistance(-2, 4, 14, 12));
        int x1 = 2;
        int x2 = 14;
        int y1 = 4;
        int y2 = 12;
        int a  = x1 - x2;
        int b = y1 - y2;

    }
}
