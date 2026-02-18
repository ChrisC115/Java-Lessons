// ENCAPSULATION and Getters and Setters
// Read: https://www.w3schools.com/java/java_encapsulation.asp

import java.util.Scanner;

public class GetSetTester {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //create a new object for my GetSet class
        GetSet player1 = new GetSet();
        GetSet player2 = new GetSet();

        System.out.println(player1.getUsername()); //displays default username value of null
        player1.setUsername("pineappleghost333"); //sets (or mutates) username to new value
        System.out.println(player1.getUsername()); //displays new username 

        player1.setRank("Noob"); 
        System.out.println(player1.getRank()); 

        player1.setID("7721"); 
        System.out.println(player1.getID()); 
       
        player2.setUsername("ironmouse6741"); //sets (or mutates) username to new value
        System.out.println(player2.getUsername()); //displays new username 

        player2.setRank("Pro"); 
        System.out.println(player2.getRank()); 

        player2.setID("9981"); 
        System.out.println(player2.getID()); 

        if(player1.getUsername().equals("pineappleghost333")) {
            System.out.println("You are an admin");
        } else {
            System.out.println("Access denied");
        }


        // taking in user input
        GetSet player3 = new GetSet();
        System.out.print("Enter a username: ");
        String userInput = input.nextLine();
        player3.setUsername(userInput);
        
        System.out.print("Enter a rank (Noob, Pro, God, Hacker, Bruh, Novice): ");
        String userRank = input.nextLine();
        player3.setRank(userRank);

        System.out.print("Enter your ID: ");
        String userID = input.nextLine();
        player3.setID(userID);

        System.out.println(player3.getUsername()); //displays new username 
        System.out.println(player3.getRank()); //displays new Rank
        System.out.println(player3.getID()); //displays new ID

         if(player3.getRank().equals("God")) {
            System.out.println("You are a God");
        } else if(player3.getRank().equals("Hacker")) {
            System.out.println("You are a Hacker");
        } else if(player3.getRank().equals("Pro")) {
            System.out.println("You are a Pro");
        } else if(player3.getRank().equals("Noob")) {
            System.out.println("You are a Noob");
        } else if(player3.getRank().equals("Bruh")) {
            System.out.println("You are a Bruh");
        } else if(player3.getRank().equals("Novice")) {
            System.out.println("You are a Novice");
        }
    } 
}

class GetSet{
    //instance variables; attributes; making the instance 'private' enforces ENCAPSULATION
    private String username = "No user name";
    private String rank = "No rank";
    private String id = "No ID";


    //accesor methods aka GETTERS:
    public String getUsername(){
        return username;
    }
    
    //mutator methods aka SETTERS
    public void setUsername(String newUsername){
        this.username = newUsername;
    }

    public String getRank(){
        return rank;
    }
    //mutator methods aka SETTERS
    public void setRank(String newRank){
        this.rank = newRank;
    }

    public String getID(){
        return id;
    }
    //mutator methods aka SETTERS
    public void setID(String newID){
        this.id = newID;
    }

}

