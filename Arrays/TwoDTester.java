import java.util.Scanner;

public class TwoDTester {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] nums = new int[3][2];

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums[i].length; j++) {
                System.out.println("Enter a value for row: " + i + ", and column: " + j);
                nums[i][j] = input.nextInt();
            }
        }
        System.out.println("\n");
        for (int j = 0; j < nums.length; j++) {
            for (int i = 0; i < nums[i].length; i++) {
                System.out.print(nums[j][i] + " ");
            } // end for
            System.out.println();
        } // end for
        input.close();
    }
}
