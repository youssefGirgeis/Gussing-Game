import java.util.Scanner;
import java.util.Random;

public class Jar{

	private String itemName;
	private int maxNumberItems;

	
	public Jar(String itemName, int maxNumberItems){
		this.itemName = itemName;
		this.maxNumberItems = maxNumberItems;
	}

	public int fill(){

		Random random = new Random();
		int randomNumber = random.nextInt(maxNumberItems + 1);
		return randomNumber; 
	}

	public void guessNumber(){

		Scanner scanner = new Scanner(System.in);

		System.out.printf("Your goal is to guess how many %s are in the jar. Your Guess shoud be between 1 and %d.%n",
		itemName, maxNumberItems);

		//System.out.println("Ready? (press ENTER to start gussing)");
		//scanner.nextLine();
		

	}
}