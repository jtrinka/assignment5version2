import javax.swing.JOptionPane;

public class Assignment4 {
	public static void main(String[] args) {
		
		String size = JOptionPane.showInputDialog("Enter how many students are in your class"); //creates a string JOptionPane to set the size of the array
	    int newsize = Integer.parseInt(size); //makes the size entered into an integer

	    JOptionPane.showMessageDialog(null,"You have a class size of "+newsize+"."); //displays how big the array is going to be
	    averagecalculationdialogbox(newsize);
	    nameentry(newsize);

	    
	}

		//www.mathstackexchange.com
		   private static void averagecalculationdialogbox(int newsize) {
		   
			   
			   int array[] = new int [newsize]; //creates a new array based off the size specified. This is parameter passing.
			    int sum=0;
			    int average=0;
			    	    for (int a=0; a<array.length;a++) //for an integer a which is equal to 0 to start, run the loop until a is greater than the array length.
			    	    {
			    	        array[a] = Integer.parseInt(JOptionPane.showInputDialog("Enter the grade each student got on their exam["+a+"].")); //prompt
			    sum +=array[a]; //sum each entry into the array with past entries
			    average = sum/newsize; //calculates the average grade the class received.
			    			    	    }
			    	    JOptionPane.showMessageDialog(null, "The average grade received was " + average, 
					            "The class average", JOptionPane.PLAIN_MESSAGE);


			    }
		   private static void nameentry(int newsize){
		   String array2[] = new String[newsize]; 
		   for (int a=0; a<array2.length;a++) //for an integer a which is equal to 0 to start, run the loop until a is greater than the array length.
   	    {
   	        array2[a] = JOptionPane.showInputDialog("Enter the name of each student["+a+"]."); //prompt
   	     JOptionPane.showMessageDialog(null, "The student's name is " + array2[a], 
		            "The class average", JOptionPane.PLAIN_MESSAGE);

   			    	    }
}}
		 // end class InitArray


