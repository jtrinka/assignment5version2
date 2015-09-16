import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;
public class Assignment3 {
//
	
	//
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		for(int i = 0; i < 10; i++)
			{
			g.drawRect(10 + i *10, 10+i *10, 50+i * 10, 50+i * 10);
			g.drawOval(240+i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
			
			}
		
	}
	public static void main(String[] args) {
		
		Shapes panel = new Shapes();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(500,  290);
		application.setVisible(true);
		
		
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
	
	for (i = 1; i<2; i++) //start at i is equal to 1 and run until i is equal to 10. Don't run a for loop with a double or float runs 9 times.
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
	//weblogs.java.net
	Random rand = new Random();
    int z = rand.nextInt(50);
    int y = rand.nextInt(50);
    System.out.println("(z > 5) && (y > 5) is " + ((z > 5) && (y > 5)) );
    System.out.println("(z < 5) || (y < 5) is " +  ((z < 5) || (y < 5)) );
    
    // Best for 1 variable
    //int a=0;
	//switch( a ) {
    //case 1: System.out.print("\nNow I'll print one");
    //System.out.println("-and that is a good choice");
    //break causes it to jump out of block
    //case 2-5: System.out.println("\nTwo");
    //break;
    //default: System.out.println("\neither one or two");
    //break;
	//}
    
 
    
	
	return;
	
	
}
	

}
