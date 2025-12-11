import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = input.nextLine();
        System.out.println(name);

        System.out.println("Enter your age");
        String age = input.nextLine();

        int ageConverted = Integer.parseInt(age);
        System.out.println("Next year " + name + " will be: " + (ageConverted + 1));

        System.out.println("What is your height in meters?");
        double height = Double.parseDouble(input.nextLine());
        System.out.println("You are " + height + " meters tall.");

    }
}
//Challenge 1

class Email {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("What are the words in your email adress");
        String[] email = new String[] { input.nextLine(), input.nextLine()}; 
        int[] number = {Integer.parseInt(input.nextLine()), Integer.parseInt(input.nextLine())};
        int numberBest = number[0] + number[1];

        System.out.println("Your email is " + email[0] + email[1] + numberBest + "@gmail.com");

    }

//Challenge 2

class Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What are your two numbers");
        double[] numbers = new double[] {Double.parseDouble(input.nextLine()), Double.parseDouble(input.nextLine())};
        Double newNumber = numbers[0] / numbers[1];

        System.out.println("You are " + newNumber + " meters tall.");

    }

}

// Chalenge 3
class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double diameter = Double.parseDouble(input.nextLine());

        double Area = Math.PI * (diameter * diameter); 
        System.out.print("The area is " + Area);

}
}

}