package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int startAmount;
		double winChance;
		int winLimit;
		int currentAmount;
		int winCount = 0;
		int ruinCount = 0;
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter start amount: ");
		startAmount = input1.nextInt();
		
		System.out.println("Enter win probability: ");
		winChance = input1.nextDouble();
		
		System.out.println("Enter win limit: ");
		winLimit = input1.nextInt();
		
		System.out.println("Enter total simulations ");
		int totalSimulations = input1.nextInt();

		for(int i = 1; i <= totalSimulations; i++){
			currentAmount = startAmount;
			int j = 0;
				while (currentAmount > 0 && currentAmount < winLimit) {
					double win = Math.random();
					//System.out.println(win);
					if (win < winChance) {
					currentAmount ++;
					}
					else {
						currentAmount --;
					}
					j++;
				}

				
			if (currentAmount > 0){
				 winCount++;
			}
			else {
				ruinCount++;
			}
			//currentAmount = startAmount;
			if (currentAmount == 0) {
				System.out.println("Simulation " + i + ": " + j + " LOSE");
			}
			else {
				System.out.println("Simulation " + i + ": " + j + " WIN");
			}
			
			//System.out.println("Simulation " + i + ": " + j);	
			
			//j is always increasing, we have to reset it	
			}
		
		
		

		System.out.println("Win amount = " + winCount + " Ruin amount = " + ruinCount);
		
	}

	
}
