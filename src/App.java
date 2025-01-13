import java.util.Random;
import java.util.Scanner;

public class App
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        String wantToPlay="YES";
        //first while loop will check you want to play or not .
        while(wantToPlay.equals("YES"))
        {
            Random ran=new Random();
            int comGuess=ran.nextInt(1000);
            int guess;
            int trys=0;
            //second while loop will check you guessed it correct or not.
            while(true)
            {
                
                System.out.print("Guess a number between 1 to 1000 :");
                guess=sc.nextInt();
                trys++;
             if(comGuess==guess){
                System.out.println("\n You Guessed The Correct Number."+"  >>>>>  BOOYAH!!  <<<<<  \n");
                System.out.println("You tried "+trys+" times.\n");
                break;
             }
             else if(comGuess>guess){
              System.out.println("You Guessed Too Low.");
             }
             else{
                System.out.println("You Guessed Too High.");

             }
             
            }
            System.out.print(" \n \nWant to play again (enter Yes else enter any thing):");
            wantToPlay=sc.next();
            wantToPlay=wantToPlay.toUpperCase();

        }
        sc.close();
    }
}
