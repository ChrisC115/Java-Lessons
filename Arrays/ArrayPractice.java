package Arrays;

public class ArrayPractice {
    public static void main(String args[]) {
        int[] array = {-20, 19, 1, 5, -1, 27, 19, 5};
        int min = array[0];

        
        for(int index=0; index<array.length; index++)
            if (array[index] < min)
                min = array[index];

        System.out.println("The minimum of this array is: " + min);

        int target = 6;
        int[] numbers = {0,2,4,6,8}; 
        boolean targetFound = false;

        for ( int index = 0; index < numbers.length; index++) {
            if(numbers[index] == target) {
                targetFound = true;
                break;
            }
        }
        System.out.println("\nTarget Found: " + targetFound);

        int[] number = {0,0,0,1,0};
        boolean allSame = true;
        for(int index=1; index < number.length; index++ ) {
            if(number[0] != number[index] ) {
                allSame = false;
                break;
            }
        }
        System.out.println("\nAll elements the same? " + allSame);

        String[] names = {"Goerge", "Jill", "Xinyi", "Ravi"};
        for(String name: names) {
            System.out.println(name);
        }


    }




}
