
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sevcm7279
 */
public class A4Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make a scanner
        Scanner input = new Scanner(System.in);

        //make variable for player 1 starting at 1
        int p1 = 1;

        //make variable for player 2 starting at 1
        int p2 = 1;

        //make variables for the turns
        int turn = 1;

        while (p1 != 100 && p2 != 100) {
            if (turn == 1) {
                
                //tell layer one to enter the sum of the dice
                System.out.println("Player 1 enter sum of dice. ");
                
                //store the sum in a variable
                int sum = input.nextInt();
                
                //add the sum to the player's position to change position
                if (sum >= 2 && sum <= 12) {
                    p1 = p1 + sum;
                    
                //tell player one the new position
                    System.out.println("You are now on " + p1);
         

                    //if user lands on a ladder
                    if (p1 == 9) {
                        System.out.println("You hit a ladder!");
                        p1 = 34;
                        System.out.println("You are now on " + p1);
                    }
                    if (p1 == 40) {
                        System.out.println("You hit a ladder!");
                        p1 = 64;
                        System.out.println("You are now on " + p1);
                    }
                    if (p1 == 67) {
                        System.out.println("You hit a ladder! ");
                        p1 = 86;
                        System.out.println("You are now on " + p1);

                        //if user lands on a snake
                    }
                    if (p1 == 54) {
                        System.out.println("You hit a snake!");
                        p1 = 19;
                        System.out.println("You are now on " + p1);
                    }
                    if (p1 == 90) {
                        System.out.println("You hit a snake!");
                        p1 = 48;
                        System.out.println("You are now on " + p1);
                    }
                    if (p1 == 99) {
                        System.out.println("You hit a snake!");
                        p1 = 77;
                        System.out.println("You are now on " + p1);
                    }
                    
                    //switch to next player's turn
                    turn = 2;
                    
                    //if player quits
                }else if (sum == 0){
                    break;
                }
            }else{
                
                //tell player two to enter the sum of dice
                System.out.println("Player 2 enter sum of dice. ");
                
                //store the sum of the dice in a variable
                int sum = input.nextInt();
                
                //add the sum to change position
                if (sum >= 2 && sum <= 12) {
                    p2 = p2 + sum;
                
                //tell player two the new position
                    System.out.println("You are now on " + p2);

                    //if user lands on a ladder
                    if (p2 == 9) {
                        System.out.println("You hit a ladder!");
                        p2 = 34;
                        System.out.println("You are now on " + p2);
                    }
                    if (p2 == 40) {
                        System.out.println("You hit a ladder!");
                        p2 = 64;
                        System.out.println("You are now on " + p2);
                    }
                    if (p2 == 67) {
                        System.out.println("You hit a ladder! ");
                        p2 = 86;
                        System.out.println("You are now on " + p2);

                        //if user lands on a snake
                    }
                    if (p2 == 54) {
                        System.out.println("You hit a snake!");
                        p1 = 19;
                        System.out.println("You are now on " + p2);
                    }
                    if (p2 == 90) {
                        System.out.println("You hit a snake!");
                        p2 = 48;
                        System.out.println("You are now on " + p2);
                    }
                    if (p2 == 99) {
                        System.out.println("You hit a snake!");
                        p2 = 77;
                        System.out.println("You are now on " + p2);
                    }
                    
                    
                    
                    //switch to next player's turn
                    
                    turn = 1;
                  //if player quits
                }else if (sum == 0){
                    break;
            
            //if player one wins, tell user and stop game
            }if (p1 == 100){
                System.out.println("Player one wins!");
                break;
                
            //if player two wins, tell user and stop game    
            }if (p2 == 100){
                System.out.println("Player two wins!");
                break;
            }
        }
    }
                //close scanner
                 input.close();
    }
}
