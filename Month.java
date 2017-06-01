package chapter6;

/*Amanda Kaufman
Chapter 6
Programming Challenge 5
Month Class
This class stores and retrieves months as both a number and a string.
*/

public class Month
{
	//Variable to hold the number of the month
	private int monthNumber;
	
	//Default constructor that sets monthNumber to 1
	public Month()
	{
		monthNumber = 1;
	}
	
	//Overloaded constructor that validates the argument and then assigns its value to monthNumber
	public Month(int m)
	{
		monthNumber = m;
		if(monthNumber < 1 || monthNumber > 12)
		{
			monthNumber = 1;
		}
	}
	
	//Sets monthNumber to the correct number based on a string month name passed as an argument
	public Month(String m)
	{
		if(m.equalsIgnoreCase("january"))
		{
			monthNumber = 1;
		}
		else if(m.equalsIgnoreCase("february"))
		{
			monthNumber = 2;
		}
		else if(m.equalsIgnoreCase("march"))
		{
			monthNumber = 3;
		}
		else if(m.equalsIgnoreCase("april"))
		{
			monthNumber = 4;
		}
		else if(m.equalsIgnoreCase("may"))
		{
			monthNumber = 5;
		}
		else if(m.equalsIgnoreCase("june"))
		{
			monthNumber = 6;
		}
		else if(m.equalsIgnoreCase("july"))
		{
			monthNumber = 7;
		}
		else if(m.equalsIgnoreCase("august"))
		{
			monthNumber = 8;
		}
		else if(m.equalsIgnoreCase("september"))
		{
			monthNumber = 9;
		}
		else if(m.equalsIgnoreCase("october"))
		{
			monthNumber = 10;
		}
		else if(m.equalsIgnoreCase("november"))
		{
			monthNumber = 11;
		}
		else if(m.equalsIgnoreCase("december"))
		{
			monthNumber = 12;
		}
		else
		{
			monthNumber = 1;
		}
	}
	
	//Manually sets the month number to the value of the argument
	public void setMonthNumber(int m)
	{
		this.monthNumber = m;
		if(monthNumber < 1 || monthNumber > 12)
		{
			this.monthNumber = 1;
		}
	}
	
	//Accessor method that returns the value currently stored in monthNumber
	public int getMonthNumber()
	{
		return monthNumber;
	}
	
	//Accessor method that returns the month name that corresponds with the value stored in monthNumber
	public String getMonthName()
	{
		String name;
		switch(monthNumber)
		{
		case 1:
			name = "January";
			break;
		case 2:
			name = "February";
			break;
		case 3:
			name = "March";
			break;
		case 4:
			name = "April";
			break;
		case 5:
			name = "May";
			break;
		case 6:
			name = "June";
			break;
		case 7:
			name = "July";
			break;
		case 8:
			name = "August";
			break;
		case 9:
			name = "September";
			break;
		case 10:
			name = "October";
			break;
		case 11:
			name = "November";
			break;
		case 12:
			name = "December";
			break;
		default:
			name = "Unknown";
		}
		return name;
	}
	
	//Returns the name of the month as a string, using the getMonthName() method above
	public String toString()
	{
		return getMonthName();
	}
	
	//Returns true if two months are equal, false otherwise
	public boolean equals(Month month2)
	{
		boolean status;
		
		if (month2.getMonthNumber() == monthNumber)
			status = true;
		else
			status = false;
		return status;
	}
	
	//Returns true if self comes after month passed as an argument, false otherwise.
	public boolean greaterThan(Month month2)
	{
		boolean status;
		
		if (monthNumber > month2.getMonthNumber())
			status = true;
		else
			status = false;
		return status;
	}
	
	//Returns true if self comes before month passed as an argument, false otherwise.
	public boolean lessThan(Month month2)
	{
		boolean status;
		
		if (monthNumber < month2.getMonthNumber())
			status = true;
		else
			status = false;
		return status;
	}
}
