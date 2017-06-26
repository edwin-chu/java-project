/**
 * File Name: FunLoopsApp.java<br>
 * Chu, Edwin<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jun 19, 2017
 */
package com.sqa.ec;

import java.util.*;

import com.sqa.ec.helpers.*;

/**
 * FunLoopsApp //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Chu, Edwin
 * @version 1.0.0
 * @since 1.0
 */
public class FunLoopsApp
{

	private static String appName = "Fundamental Loops";

	private static String name;

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String name = AppBasics.greetUserAndGetName(appName);
		forLoopsExercise();
		whileLoopsExercise();
		calcGradePointAvg();
		AppBasics.fareWellUser(name);
	}

	private static void calcGradePointAvg()
	{
		int numTotalGrade = 0;
		int inputNumber;
		float totalGradePoint = 0;
		double roundedNumber = 0;
		String input;
		boolean status = true;
		do
		{
			System.out.println("Please enter grade number, 1 - 100 or 0 to quit: ");
			input = scanner.nextLine();
			inputNumber = Integer.parseInt(input);
			if (inputNumber == 0)
			{
				status = false;
			} else if (inputNumber > 100 || inputNumber < 0)
			{
				System.out.println("Invalid Number. This entry is not counted.\n");
			} else
			{
				totalGradePoint += inputNumber;
				numTotalGrade++;
			}
		} while (status);
		if (numTotalGrade == 0)
		{
			System.out.println("Grade Point Average not available.\n");
		} else
		{
			roundedNumber = Math.round((totalGradePoint / numTotalGrade) * 100.0) / 100.0;
			System.out.println("Grade Point Average is " + roundedNumber);
		}
	}

	private static void forLoopsExercise()
	{
		for (int i = 1; i <= 100; i++)
		{
			System.out.println(i);
		}
		for (int j = 200; j >= 100; j--)
		{
			System.out.println(j);
		}
		for (int x = 10; x <= 10000; x += 10)
		{
			System.out.println(x);
		}
	}

	private static void whileLoopsExercise()
	{
		int y = 1;
		while (y <= 100)
		{
			if (y % 2 == 0)
			{
				System.out.println(y);
			}
			y++;
		}
		int z = 300;
		while (z <= 400)
		{
			if (z % 2 != 0)
			{
				System.out.println(z);
			}
			z++;
		}
		int zz = 30;
		while (zz <= 300)
		{
			if (zz % 3 == 0)
			{
				System.out.println(zz);
			}
			zz++;
		}
	}
}
