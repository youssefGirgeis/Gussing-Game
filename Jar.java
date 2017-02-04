import java.util.Random;
import java.util.Scanner;

public class Jar {
	
	private String itemName;
	private int maxNumberItems;

	
	public Jar(String itemName, int maxNumberItems){
		this.itemName = itemName;
		this.maxNumberItems = maxNumberItems;
	}
	
	public String getItemName(){
		return itemName;
	}
	
	public int getMaxNumberItems(){
		return maxNumberItems;
	}

	public int fill(){

		Random random = new Random();
		int randomNumber = random.nextInt((maxNumberItems - 1) + 1) + 1;
		//System.out.print(randomNumber);
		return randomNumber; 
	}

	public void guessNumber(){
		
		Scanner scanner = new Scanner(System.in);
		int randomNumber = fill();
		int counter = 0;
		int guess;
		
		do{
			System.out.print("Guess: ");
			guess = scanner.nextInt();
			
			if(guess > maxNumberItems){
				System.out.printf("Your guess must be less than %d.%n", maxNumberItems);
			}else{
				counter++;
				guessHighLow(guess, randomNumber, counter);
			}

		}while(guess != randomNumber);

	}
	
	public void guessHighLow(int guess, int randomNumber, int counter){
		
		if(guess > randomNumber){
			System.out.println("Your guess is too high");
		}else if(guess < randomNumber){
			System.out.println("Your guess is too low");
		}else{
			System.out.printf("Congratulations - you guessed that there are %d %s in the jar! It took you %d guess(es) to get right.",
					randomNumber, itemName, counter);
		}	
	}

}
