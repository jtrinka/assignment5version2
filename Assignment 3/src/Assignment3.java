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
	int pick = 0;
	int i;
	for (i = 1; i<10; i++) //start at i is equal to 1 and run until i is equal to 10. Don't run a for loop with a double or float runs 9 times.
	{
		System.out.println(i+" times through this loop");
		pick = mySecureRandomgenerator.nextInt(5)+0; //set pick to 0 but we make it equal to any random number
		System.out.println("a number between 0 and 6 is:"+pick); //random number generator is not random, just appears to be random.
		myScanner.nextLine();
	}
	myScanner.close();
	return;
	

}
	

}
