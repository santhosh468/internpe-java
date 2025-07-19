import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String play="yes";
		
		while(play.equals("yes")) {
			Random rand=new Random();
			int rand_num=rand.nextInt(100);
			int g=-1;
			int t=0;
			
			while(rand_num!=g) {
				System.out.println("Enter any number between 1 and 100: ");
				g=sc.nextInt();
				t++;
				
				if(g==rand_num) {
					System.out.println("Your guessed correctly in "+t+" times!!");
					System.out.println("Congrats!");
					System.out.println("Would you like to play again?(yes or no): ");
					play=sc.next().toLowerCase();
				}
				else if(g>rand_num) {
					System.out.println("Your guess is higher. Try again!");
				}
				else {
					System.out.println("Your guess is lower. Try again!");
				}
			}
		}
		sc.close();
	}
}
