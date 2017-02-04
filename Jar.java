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

		int randomNumber = fill();
		int counter = 0;

		Scanner scanner = new Scanner(System.in);


		
		do{

			System.out.print("Guess: ");
			int guess = scanner.nextInt();
			counter++;

		}while(guess != randomNumber);

		System.out.println("Congratulations - you guessed that there %d %s in the jar! It took you %d guess(es) to get right.",
			randomNumber, itemName, counter);

	}
}