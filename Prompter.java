import java.util.Scanner;

public class Prompter{


	public void promptForAdminstrator(){
		Scanner scanner = new Scanner(System.in);

		System.out.println("ADMINISTRATOR SETUP\n====================");
		System.out.print("Name of items in the Jar: ");

		String itemName = scanner.nextLine();

		System.out.printf("Maximum number of %s in the jar: ", itemName);
		int maxNumber = scanner.nextInt();

		Jar jar = new Jar(itemName, maxNumber);

		System.out.printf("Your goal is to guess how many %s are in the jar. Your Guess shoud be between 1 and %d",
			itemName, maxNumber);

	}
}