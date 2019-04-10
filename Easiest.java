// open.kattis.com/problems/easiest
import java.util.Scanner;

public class Easiest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()) {

            int num = in.nextInt();
            in.nextLine();

            if (num == 0)
                break;

            int i = 11;

            while (true) {

                String n = "" + num;
                String p = "" + (num * i);

                int sum1 = getSum(num);
                int sum2 = getSum(num * i);

                if (sum1 == sum2) {
                    System.out.println(i);
                    break;
                }

                i++;

            }

        }

    }

    static int getSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }

}
