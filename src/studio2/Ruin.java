package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int startAmount;
		double winChance;
		int winLimit;
		int currentAmount;
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter start amount: ");
		startAmount = input1.nextInt();
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter win probability: ");
		winChance = input1.nextDouble();
		
		Scanner input3 = new Scanner(System.in);
		System.out.println("Enter win limit: ");
		winLimit = input1.nextInt();
		
		int winCount = 0;
		int ruinCount = 0;
		
		
		Scanner input4 = new Scanner(System.in);
		System.out.println("Enter total simulations ");
		int totalSimulations = input4.nextInt();
		int j = 0;
		for(int i = 0; i < totalSimulations; i++){
			currentAmount = startAmount;

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
			/***if (j == 0) {
				System.out.println("Simulation " + i + ": " + j)
			}***/
			System.out.println("Simulation " + i + ": " + j);	

		}
		
		
		

		System.out.println("Win amount = " + winCount + "Ruin amount = " + ruinCount);
		
	}

	
}