import java.util.Scanner;

public class Exercise6 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int count = 0;
        for(int i=0; i<n; i++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            if(x1*x1+y1*y1<=l*l||x2*x2+y2*y2<=l*l)
                count++;
            else {
                int a, b, c;
                int deltaX=x2-x1;
                int deltaY=y2-y1;
                a=deltaY;
                b=-deltaX;
                c=y1*deltaX-x1*deltaY;
                if(c*c<=l*l*(a*a+b*b)&&(-c*b<=(b*b+a*a)*Math.max(y2, y1)&&-c*b>=(b*b+a*a)*Math.min(y2, y1)))
                    count++;
            }
        }
        System.out.println(count/k+1);
    }
}
