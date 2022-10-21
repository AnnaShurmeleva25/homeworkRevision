public class Exercise5 {
    public static void main(String[] args) {
        int a = 9;
        int b = 9;
        int rad = 4;
        double ck = rad * 2 / Math.sqrt(2);
        if (a < ck && b < ck) {
            System.out.println("Отверстие закрыть можно");
        } else {
            System.out.println("Отверстие больше картонки");
        }
    }
}

