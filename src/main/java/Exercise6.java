public class Exercise6 {
        static class Pair {
            int first, second;
            public Pair(int first, int second) {
                this.first = first;
                this.second = second;
            }
        }
        static void lineFromPoints (Pair B, Pair A)
        {
            int a = A.second - B.second;
            int b = A.first - B.first;
            int c = a * (A.first) + b * (B.second);

            if (b < 0) {
                System.out.println("Прямая, проходящая через точки B и A, равна: " + a + "x - " + b + "y = " + c);
            } else {
                System.out.println("Прямая, проходящая через точки B и A, равна: " + a + "x + " + b + "y = " + c);
            }
        }
        public static void main (String[]args)
        {
            Pair B = new Pair(3, 2);
            Pair A = new Pair(2, 6);
            lineFromPoints(B, A);
        }
    }

