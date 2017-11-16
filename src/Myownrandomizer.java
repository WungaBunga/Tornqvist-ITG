import java.util.Scanner;
import java.util.Random;
          
public class RockPaperScissors 
{
        /** Creates a new instance of RockPaperScissors */
    public static void main (String[] args)
    {
        int rock,paper,scissors;
        int compvar;
        String computerplay="";
        String userplay;
         
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your play(rock, paper, or scissors) below: ");
        userplay = scan.nextLine();
        System.out.println(userplay);
         
         
        Random generator = new Random();
        compvar = generator.nextInt(3);
         
         
        switch(compvar)
        {
            case 0:
                rock=0;
                  System.out.println("Computer play is rock. ");
                
                  break;
             
            case 1:
                paper=1;
                 System.out.println("Computer play is paper. ");
            
                break;
               
                 
            case 2:
                scissors=2;
                System.out.println("Computer play is scissors. ");
                
                break;
         }
        if (userplay.equals("rock"))
       
        {
            System.out.println("Rock crushes scissors. You win! ");
        }
        else
         System.out.println("Paper covers rock. The computer wins! ");
         
        if (userplay.equals("paper"))
        {
            System.out.println("Paper covers rock. You win! ");
        }
        else
         System.out.println("Scissors cuts paper. The computer wins! ");
           
         
        if(userplay.equals("scissors"))
        { System.out.println("Scissors cuts paper. You win!");
        }  
        else
         System.out.println("Rock crushes scissors. The computer wins! ");
    }
}