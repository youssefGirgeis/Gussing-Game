import java.util.Scanner;

public class Prompter {
	
	private Jar jar;
	Scanner scanner = new Scanner(System.in);
	
	public void promptForAdminstrator(){
		

		System.out.println("ADMINISTRATOR SETUP\n====================");
		System.out.print("Name of items in the Jar: ");

		String itemName = scanner.nextLine();

		System.out.printf("Maximum number of %s in the jar: ", itemName);
		int maxNumber = scanner.nextInt();

		jar = new Jar(itemName, maxNumber);

	}
	
	public void promptForPlayer(){
		
		System.out.println("PLAYER\n=================");
		System.out.printf("Your goal is to guess how many %s are in the jar. Your guess should be between 1 and %d.%n",
				jar.getItemName(), jar.getMaxNumberItems());
		
		jar.guessNumber();
		
	}

}
