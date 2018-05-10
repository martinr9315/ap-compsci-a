package unit6;
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.lang.Math;

public class Prime
{
	private int number;

	public Prime()
	{
		number = 11;
	}

	public Prime(int num)
	{
		setPrime(num);
	}

	public void setPrime(int num)
	{
		number = num;
	}

	public boolean isPrime()
	{
		for (double i=2; i<Math.sqrt(number);i++) {
			if (number%i==0) 
				return false;	
		}
		return true;
	}

	public String toString()
	{
		String output="";
		if (isPrime())
			output+=number+" is prime.";
		else
			output+=number+" is not prime";
		return output;
	}
}