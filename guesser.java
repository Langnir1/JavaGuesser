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
			System.out.print("Test: " + choice);
			
			if(choice.equals("0")){
				System.out.println("Bye!");
				keepGoing = false;
			}
		}

	}
}
