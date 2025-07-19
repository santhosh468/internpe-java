import java.util.Random;
import java.util.Scanner;
class RockPaperScissors{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.println("Welcome to Rock, Paper, Scissors!");
            String[] choices={"r","p","s"};
            String computerChoice=choices[new Random().nextInt(choices.length)];

           
            System.out.print("Enter your choice (r/p/s): ");
            String userChoice;

            while(true){
                userChoice=sc.nextLine().toLowerCase();
                if(userChoice.equals("r") || userChoice.equals("p") || userChoice.equals("s")){
                    break;
                } else {
                    System.out.print("Invalid choice. Please enter r, p, or s: ");
                }
            }

            System.out.println("Computer choice: " + computerChoice);

            if(userChoice.equals(computerChoice)){
                System.out.println("It's a tie!");
            } else if((userChoice.equals("r") && computerChoice.equals("s")) ||
                    (userChoice.equals("p") && computerChoice.equals("r")) ||
                    (userChoice.equals("s") && computerChoice.equals("p"))){
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
            
            System.out.println("Thank you for playing!");

            System.out.println("Play again? (y/n): ");
            String playAgain = sc.nextLine().toLowerCase();
            if(!playAgain.equals("y")){
                System.out.println("Goodbye!");
                break;
            }

        }

        sc.close(); 
    }
}
