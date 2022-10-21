public class Exercise3 {
    public static void main(String[] args) {
        int num = 43251;
        int first = num % 10;
        int second = (num - first) % 100 / 10;
        int third = (num - first - second) % 1000 / 100;
        System.out.println(third);
    }
}



