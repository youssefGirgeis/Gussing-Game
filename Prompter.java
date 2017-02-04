import java.util.Scanner;

public class Prompter{


	public void promptForQuestions(){
		Scanner scanner = new Scanner(System.in);

		System.out.println("ADMINISTRATOR SETUP\n====================");
		System.out.print("Name of items in the Jar: ");

		String itemName = scanner.nextLine();

		System.out.printf("Maximum number of %s in the jar: ", itemName);
		int maxNumber = scanner.nextInt();

		Jar jar = new Jar(itemName, maxNumber);
	} 
}