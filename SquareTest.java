/**
 * @(#)SquareTest.java
 *
 *
 * @author 
 * @version 1.00 2014/10/2
 */


public class SquareTest {

    public static void main(String[] args)
    {
    	int currentVal = -1;
    	Square square;
    	
    	while((currentVal = GetInfo.getInt("Enter the size of the magic square. Enter -1 to end.")) != -1)
    	{
    		square = new Square(currentVal);
    		
    		//Read into the table
    		square.readTable();
    		
    		//Print the table
    		square.printTable();
    		
    		//Print the information of the table
    		square.printInfo();
    		
    		if(square.isMagic())
    		{
    			GetInfo.showMessage("It's a magic square!");
    		}else
    			GetInfo.showMessage("It's not a magic square (Sad face emoticon)");
    		
    	}
    	
    
    	
    }
    
    
}