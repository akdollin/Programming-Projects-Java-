//Akiva Dollin-acd2164
//oracle class to determine how many
//bulls and cows you should have
//as well as generating a random computer solution

import java.util.Random;

public class Oracle
{

	private String generatedNumber; //through the randomizer method

	public Oracle()
	{
		//initialize instance variables
		generatedNumber = "";	
	}

	public int getBulls(String userGuess)
	{
		int bulls = 0;
		for (int i = 0; i < 4; i++)
		{
			for (int n = 0; n < 4; n++)
			{ //to compare the number
				if (generatedNumber.charAt(i) == userGuess.charAt(n))  
				{
					if (i == n)  //to compare the spot
					{
						bulls++;
					}
				}
			}
			
		}

		System.out.println("Bulls = " + bulls);
		return bulls;
	}
	
	public int getCows(String userGuess)
	{
		// will search the solution, if they share a number at different indices that is a cow
		int cows = 0;
		for(int n = 0; n < 4; n++) 
		{
			if(userGuess.indexOf(generatedNumber.charAt(n)) != -1)
			if(userGuess.indexOf(generatedNumber.charAt(n)) != n)
				cows++;
		}
	
		System.out.println("Cows = " + cows);
		return cows;
	}

	public void generateNumber() 
	{
		Random generator = new Random();
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;

		while(a==b|a==c|a==d|b==c|b==d|c==d)
		{
			a = generator.nextInt(10);
			b = generator.nextInt(10); 
			c = generator.nextInt(10); 
			d = generator.nextInt(10); 
		}
		generatedNumber = "" + a+b+c+d;
		System.out.println(generatedNumber);
	}
}