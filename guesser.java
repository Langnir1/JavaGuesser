import java.util.*;

public class guesser{
	public static void main(String[] args){
		 menu();
	}

	public static void menu(){
		Scanner input = new Scanner(System.in);
		boolean keepGoing = true;

		while(keepGoing){
			System.out.println("\nWelcome to the menu!");
			System.out.println("0) Quit");
			System.out.println("1) Human Guesser");
			System.out.println("2) Computer Guesser");
			System.out.print("What would you like to do? ");

			String choice = input.nextLine();
			System.out.println("Test: " + choice);
			
			if(choice.equals("0")){
				System.out.println("Bye!");
				keepGoing = false;
			}

			else if(choice.equals("1")){
				System.out.println("Test response, get rid of later");
				humanGuesser();
			}

			else if(choice.equals("2")){
				System.out.println("Test for computerGuesser");
				//computerGuesser();
			}
			else{
				System.out.println("Please pick an acceptable response");
			}
		}

	}

	public static void humanGuesser(){
		Scanner input = new Scanner(System.in);
		boolean keepGoing = true;
		
		int number = (int)(Math.random() * 101);
		System.out.println(number);
		int count = 1;
		
		while(keepGoing){
			System.out.println();
			System.out.println(count + ") Guess a number between 0 to 100:  ");
			int guess = input.nextInt();
			input.nextLine();
			
			if(count > 7){
				System.out.println("You've exceeded 7 tries, you lose.");
				keepGoing = false;
			}
			else if(guess < number){
				System.out.println("Too low, try again!");
				count++;
			}
			else if(guess > number){
				System.out.println("Too high, try again");
				count++;
			}
			else{
				System.out.println("Congradulations! You got it in " + count + " tries!");
				keepGoing = false;
			}
		}
	}
}
