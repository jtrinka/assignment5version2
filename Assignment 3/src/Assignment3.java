import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;
public class Assignment3 {
//
	
	//
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count=1;
		while(count < 3 )
		{
		count++;
		System.out.print("Enter grade:");
		int studentGrade = input.nextInt(); //resets loop
		if (studentGrade>=90)
			System.out.println("A");
		else
			if (studentGrade>=80)
				System.out.println("B");
			else
				if (studentGrade>=70)
					System.out.println("C");
				else
					if (studentGrade>=60)
						System.out.println("D");
					else
						
						System.out.println("F");
		
	}
		
	
	Scanner myScanner = new Scanner(System.in);
	SecureRandom mySecureRandomgenerator = new SecureRandom();
	int pick;
	
	int i;
	int x;
	try{Thread.sleep(4000);}
	catch (Exception e){};
	System.out.println("Roll a 1, no points gained or lost. 2 gain 2 points. 3 lose 1 point. 4 roll gain 4 points. 5 your opponent gets 5 points. 6 get 6 points. First one to 10 points or over wins");
	
	for (i = 1; i<1000; i++) //start at i is equal to 1 and run until i is equal to 10. Don't run a for loop with a double or float runs 9 times.
	{
		pick = mySecureRandomgenerator.nextInt(6)+1; //set pick to 0 but we make it equal to any random number
		try{Thread.sleep(1500);}
		catch (Exception e){};
		System.out.println(i+" rolls used");
		try{Thread.sleep(1500);}
		catch (Exception e){};
		System.out.println("The number rolled is "+pick); //random number generator is not random, just appears to be random.
		// from www.stackoverflow.com
		String str=Integer.toString(pick);
		str = myScanner.nextLine();
		try{Thread.sleep(3000);}
		catch (Exception e){};
		if (pick==1) //double equal signs for test
			System.out.println("Nothing");
		else
			if(pick==2)
		System.out.println("Gain 2 points");
		else
			if(pick==3)
				System.out.println("Lose 1 Point");
			else 
				if(pick==4)
					System.out.println("Gain 4 Points");
				else 
					if(pick==5)
						System.out.println("Your opponent gains 2 points");
					else 
						if(pick==6)
							System.out.println("Gain 6 Points");
	}
	myScanner.close();
	return;
	

}
	

}
