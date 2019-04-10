// open.kattis.com/problems/aboveaverage
import java.util.Scanner;

public class AboveAverage {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Scanner in = new Scanner(System.in);
        int numCases = in.nextInt();
        in.nextLine();
        System.out.println();
        
        for (int p = 0; p < numCases; p++) {
            
            int numStudents = in.nextInt();
            int[] grades = new int[numStudents];
            double average = 0;
            for (int i = 0; i < numStudents; i++) {
                grades[i] = in.nextInt();
                average += grades[i];
            }
            in.nextLine();
            
            average /= numStudents;
            int count = 0;
            for (int i = 0; i < grades.length; i++) {
                if (grades[i] > average) {
                    count++;
                }
            }
            
            double num = (double) count / numStudents;
            num *= 100;
            System.out.println(String.format("%.3f", num) + "%");
            
            
        }

    }

}
