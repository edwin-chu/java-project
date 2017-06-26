/**
 * File Name: MoreFunLoopApp.java<br>
 * Chu, Edwin<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jun 25, 2017
 */
package com.sqa.ec;

import com.sqa.ec.helpers.*;

/**
 * MoreFunLoopApp //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Chu, Edwin
 * @version 1.0.0
 * @since 1.0
 */
public class MoreFunLoopApp
{

	private static String appName = "More Fundamental Loops";

	private static String name;

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String name = AppBasics.greetUserAndGetName(appName);
		loop1();
		loop2();
		loop3();
		loop4();
		AppBasics.fareWellUser(name);
	}

	private static void loop1()
	{
		int i = 10;
		while (i >= 5)
		{
			System.out.print(i);
			if (i != 5)
			{
				System.out.print(",");
			}
			i--;
		}
		System.out.println("\n");
		int j = 5;
		for (int k = 0; k <= j; k++)
		{
			System.out.print("[" + k + "]");
		}
		System.out.println("\n");
		int number = 1000;
		int denominator = 5;
		do
		{
			System.out.print(number + "<<<");
			number = number / 5;
		} while (number % denominator == 0);
		System.out.print(number + "\n\n");
		int counter = 3;
		int num = -9999;
		while (counter > 0)
		{
			System.out.print("{{{{" + num);
			num = num / 3;
			counter--;
		}
		System.out.print("\n\n");
	}

	private static void loop2()
	{
		int iter1 = 6;
		// loop to print 6 lines of *
		while (iter1 > 0)
		{
			int iter2 = iter1;
			// loop to print number of * in a line
			while (iter2 > 0)
			{
				System.out.print("*");
				iter2--;
			}
			System.out.print("\n");
			iter1--;
		}
	}

	private static void loop3()
	{
		int index1 = 6;
		int starCount = 0;
		int starMaxCount = 6;
		// loop to print 6 lines of *
		while (index1 > 0)
		{
			int index2 = index1;
			// loop to print space before the *
			while (index2 > 1)
			{
				System.out.print(" ");
				index2--;
			}
			// loop to print *, ensure # of space in 2nd while loop + # of star
			// always = starMaxCount
			while (index1 + starCount <= starMaxCount)
			{
				System.out.print("*");
				starCount++;
			}
			starCount = 0;
			index1--;
			System.out.print("\n");
		}
	}

	private static void loop4()
	{
		String prompt;
		String exitCondition = "exit";
		do
		{
			prompt = AppBasics.requestString("What do you want to do?");
		} while (exitCondition.equalsIgnoreCase(prompt) != true);
	}
}
