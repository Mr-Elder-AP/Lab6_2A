/**
 * @(#)Square.java
 *
 *
 * @author 
 * @version 1.00 2014/10/2
 */


public class Square {

	int size = 0;
	
	int[][] table;
	
    public Square(int size) {
    	this.size = size;  
    	table = new int[size][size]; 
    }
    
   	public void readTable()
   	{
   		for(int i = 0; i < size; i++)
   		{
   			for(int j = 0; j < size; j++)
   			{
   				table[i][j] = GetInfo.getInt("Enter value for Coordinate(" + i + ", " + j + ")");
   			}
   		}
   	}
   	
   	public void printTable()
   	{
   		String builder = "";
   		
   		for(int i = 0; i < size; i++)
   		{
   			for(int j = 0; j < size; j++)
   			{
   				builder += table[i][j] + "  ";
   			}
   			
   			builder += "\n";
   		}
   		
   		GetInfo.showMessage(builder);
   	}
   	
   	public int getRowSum(int row)
   	{
   		int sum = 0;
   		
   		for(int i = 0; i < size; i++)
   		{
   			sum += table[row][i];
   		}
   		
   		return sum;
   	}
   	
   	public int getColumnSum(int column)
   	{
   		int sum = 0;
   		
   		for(int i = 0; i < size; i++)
   		{
   			sum += table[i][column];
   		}
   		
   		return sum;
   	}
    
    public int getDiagonalSum(int row, int col)
    {
    	int sum = 0;
    	
    	for(int i = row; i < size; i++)
    	{
    		sum += table[i][i];
    	}
    	
    	return sum;
    }
    
    public int getDiagonalSumBackwards()
    {
    	int sum = 0;
    	
    	int col = 0;
    	for(int i = size-1; i >= 0; i--)
    	{
    		sum += table[i][col];
    		col++;
    	}
    	
    	return sum;
    }
    
    public void printInfo()
    {
    	String builder = "";
    	
    	for(int i = 0; i < size; i++)
    	{
    		builder += "Row " + i + "'s sum is " + getRowSum(i) + "\n";
    	}
    	
    	builder += "\n\n";
    	
    	for(int i = 0; i < size; i++)
    	{
    		builder += "Column " + i + "'s sum is " + getColumnSum(i) + "\n";
    	}
    	
    	builder += "\nMain Diagonal is " + getDiagonalSum(0, 0);
    	builder += "\nOther Diagonal is " + getDiagonalSumBackwards();
    	
    	GetInfo.showMessage(builder);
    }
    
    public boolean isMagic()
    {
    	int theSum = getRowSum(0);
    	System.out.println(theSum);
    	
    	for(int i = 0; i < size; i++)
    	{
    		System.out.println(getRowSum(i));
    		if(getRowSum(i) != theSum)
    		{
    			return false;
    		}
    	}
    	
    	for(int i = 0; i < size; i++)
    	{
    		System.out.println(getColumnSum(i));
    		if(getColumnSum(i) != theSum)
    		{
    			return false;
    		}
    	}
    	
    	System.out.println(getDiagonalSum(0, 0));
    	System.out.println(getDiagonalSumBackwards());
    	
    	if(getDiagonalSum(0, 0) != theSum)
    		return false;
    		
    	if(getDiagonalSumBackwards() != theSum)
    		return false;
    		
    	
    	return true;
    }
    
}