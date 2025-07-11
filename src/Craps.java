import java.util.Random;
import java.util.Scanner;

public class Craps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        String playAgain = "";
        boolean done = false;
        do{
            //the game
            //2 random dies to get sum "the point"
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int sum = die1 + die2;

            //Print the table with die and sum
            System.out.println("Die 1\t Die 2\t\t Sum");
            System.out.println(die1 + "\t\t " + die2 + "\t\t\t " + sum);

            if(sum == 2 || sum == 3 || sum ==12){
                //crapping out
                System.out.println("You crapped out with a " + sum);
            } else if (sum == 7 || sum == 11) {
                //natural win
                System.out.println("You got a natural win with "+ sum);
            }else{
                do{
                    //Roll until sum == point or 7
                    done = false;
                    int point = sum;
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    sum = die1 + die2;
                    //display new die roll
                    System.out.println(die1 + "\t\t " + die2 + "\t\t\t " + sum);

                }while (!done)
            }


            //ask to continue
            do{
                done = false;
                //Prompt
                System.out.print("Would you like to play again [Y/N]: ");
                //Input
                playAgain = in.nextLine();
                //Check for Y/N
                if (playAgain.equalsIgnoreCase("Y") || playAgain.equalsIgnoreCase("N")){
                    done = true;
                }
                //Reprompt
                else{
                    System.out.println("You entered " + playAgain + "\nPlease enter either Y or N.");
                }

            }while(!done);
            //If not done make done = false
            if(playAgain.equalsIgnoreCase("Y")){
                done = false;
            }
        }while(!done);
    }
}
