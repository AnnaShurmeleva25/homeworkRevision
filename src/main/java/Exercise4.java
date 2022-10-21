public class Exercise4 {
    public static void add(float x1, float x2, float y1, float y2, float z1, float z2) {
        double d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2) + Math.pow((z2 - z1), 2));
        System.out.println("Distance is " + d);
    }

    // Driver code
    public static void main(String[] args) {
        float x1 = 2;
        float y1 = -5;
        float z1 = 7;
        float x2 = 3;
        float y2 = 4;
        float z2 = 5;
        add(x1, x2, y1, y2, z1, z2);
    }
}


