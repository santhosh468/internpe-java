# Rock, Paper, Scissors Game 🎮

A simple command-line Rock, Paper, Scissors game implemented in Java! Challenge the computer and test your luck in this classic game.

## 🚀 Features

- User-friendly CLI interface.
- Computer picks randomly between Rock (r), Paper (p), or Scissors (s).
- Robust input validation—prompts until a valid option is entered.
- Automatic result detection: win, lose, or tie.
- Option to play multiple rounds.

## 📝 How to Run

### Prerequisites

- Java Development Kit (JDK) installed.

### Steps

1. **Save the code below as `RockPaperScissors.java`:**

    ```
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
    ```

2. **Compile the code:**

  ```
  javac RockPaperScissors.java
  ```

3. **Run the game:**
  ```
  java RockPaperScissors
  ```


## 🎲 How to Play

1. When prompted, enter:
 - `r` for rock
 - `p` for paper
 - `s` for scissors
2. See if you win, lose, or tie!
3. Choose to play again or exit.

Happy playing! 🚀

