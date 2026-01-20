public class JavaArrayPractice4 {
    public static void main(String args[]) {

        //Challenge 1
        double[] winner = new double[18];
        //Challenge 2
        int[] first_array = {1,2,3,5,7,11,13,17};
        //Challenge 3
        int[] num = new int[20];
        for(int i=0; i < num.length; i++) {
            num[i] = num[i]*2;
        }
        //Challenge 4
        int[][] maze = new int[30][40];
        //Challenge 5
        int[][] loop = new int[16][32];
        for(int[] l : loop) {
            for(int j : l) {
                System.out.println(j);
            }
        }
     //Challenge 6 prints out the whole number for number
     //Challenge 7 prints 0
     //Challenge 8 prints 12, 8, 6, 8, 6, 4   
    }
}
