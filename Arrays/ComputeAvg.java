package Arrays;

import java.util.Scanner;

public class ComputeAvg {
    public static void main(String[] args) {
        double sum = 0.0; double avg = 0.0;
        Scanner keyboard = new Scanner(System.in);
        int[] test = new int[5];
        for(int idx = 0; idx < test.length; idx++) {
            test[idx] = keyboard.nextInt();
        }
        for(int i = 0; i<test.length; i++) {
            sum = sum + test[i];
            avg = sum / test.length;
        }
        System.out.println("There are " + test.length + "students in the class" + "\n The sum of their scores is " + sum + "\n Their average is " + avg);

    }
}
