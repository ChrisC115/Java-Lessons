
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

class Class {

}
public class ArrayListDemo {

    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println(list);
        System.out.println(list.size());


       //  ArrayList<Integer> list2 = new ArrayList<Double>();

      ///  ArrayList<> list3  = new ArrayList<Integer>(); 


      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
      list.add(5);
      System.out.println(list);
      System.out.println(list.size());


      list.add(1, 5);
      System.out.println(list);


      System.out.println(list.get(1));


      list.remove(1);
      System.out.println(list);

     list.add(1, 5);
     list.add(2, 5);

     list.remove(Integer.valueOf(5));
     System.out.println(list);



     System.out.println("Contains 5: " + list.contains(5));



     Collections.sort(list);
     Integer value =  Collections.binarySearch(list, 4);
     System.out.println(value);
     System.out.println(list);


    Integer[] arr = list.toArray(new Integer[2]);
    for (int val : arr) {
        System.out.print(val + " ");
    }
    System.out.println();


    ArrayList<Integer> splitList = new ArrayList<Integer>(list.subList(3,list.size()-1));
    System.out.println(splitList);
    
    list.clear();
    System.out.println(list);




    
    System.out.println(list.size());

}

    // Create an arrayList with 10 random numbers
    // Remove all odd from that list
    class Challenge1 {
        public static void randomList(){
		ArrayList<Integer> myList = new ArrayList<Integer>();
		int randomNum = 0;
		for(int i = 0; i<10;i++){
			randomNum = (int)(Math.random()*11);
			myList.add(randomNum);
		}
		System.out.println("Random List"+myList);
		for(int j = myList.size() - 1; j >= 0; j--){

			if (myList.get(j)%2 != 0){
				myList.remove(j);
			}
		}
            System.out.println("The New Sorted list" + myList);
        }
    }
}
    class Challenge2 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> guests = new ArrayList<>();

        guests.add("Alice");
        guests.add("Bob");
        guests.add("Charlie");

        while (true) {
            System.out.print("Enter name for the Guest List: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            
            if (guests.contains(input)) {
                System.out.println(input + " is invited!");
            } else {
                System.out.println("Sorry, " + input + " is not on the list.");
            }
        }
        scanner.close();
    }
    }

    // Make a guest list that allows the user to enter names
    // if the name exists tell the user that "this person is invited!"
    // continue until you type exit


    class Challenge3{
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> groceries = new ArrayList<>();

        groceries.add("Milk");
        groceries.add("Bread");
        groceries.add("Eggs");

        System.out.println("Type an item to check if its on your list, or type 'exit' to quit.");

        while (true) {
            System.out.print("\nEnter your food item: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            // Get the index of the item
            int index = groceries.indexOf(input);

            if (index != -1) {
                System.out.println("Found! Index: " + index);
            } else {
                System.out.println("Item is not on the list. Adding " + input + " to the list.");
                groceries.add(input);
            }
        }

        System.out.println("\nThis is the Final List: " + groceries);
        scanner.close();
    }
    }
    // Create a list of grocery items
    // if the user types in a food print out the index
    // If not print "Not Found" and add it to the list
    // continue until you type exit
