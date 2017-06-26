/**
 * File Name: JavaFunApp.java<br>
 * Chu, Edwin<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jun 17, 2017
 */
package com.sqa.ec;

import java.util.*;

import com.sqa.ec.helpers.*;

/**
 * JavaFunApp //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Chu, Edwin
 * @version 1.0.0
 * @since 1.0
 */
public class JavaFunApp
{

	private static String appName = "Java Fundamentals";

	private static String name;

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		name = AppBasics.greetUserAndGetName(appName);
		compareValueTo10();
		evalMonth();
		evalGradeLetter();
		AppBasics.fareWellUser(name);
	}

	private static void compareValueTo10()
	{
		// Function that takes int parameter and print message on screen that
		// "number is greater than 10"
		// otherwise it should print "number is smaller than 10"
		int inputNumber;
		int compareValue = 10;
		String input;
		System.out.println(name + ", Please enter a number.");
		input = scanner.nextLine();
		inputNumber = Integer.parseInt(input);
		if (inputNumber > compareValue)
		{
			System.out.println("Number is greater than " + compareValue + ".\n");
		} else if (inputNumber == compareValue)
		{
			System.out.println("Number is equal to " + compareValue + ".\n");
		} else
		{
			System.out.println("Number is smaller than " + compareValue + ".\n");
		}
	}

	private static void evalGradeLetter()
	{
		// Function that ask user for grade value and print associated grade
		// letter
		int gradeNumber;
		char gradeLetter;
		String input;
		System.out.println("Please enter grade number 1 - 100.\n");
		input = scanner.nextLine();
		gradeNumber = Integer.parseInt(input);
		if (gradeNumber >= 80 && gradeNumber <= 100)
		{
			gradeLetter = 'A';
			System.out.println("Awesome Job " + name + ", you got an " + gradeLetter);
		} else if (gradeNumber >= 70 && gradeNumber < 80)
		{
			gradeLetter = 'B';
			System.out.println("Great Job " + name + ", you got " + gradeLetter + "on your class\n");
		} else if (gradeNumber >= 60 && gradeNumber < 70)
		{
			gradeLetter = 'C';
			System.out.println("Good Job " + name + ", your grade is " + gradeLetter);
		} else if (gradeNumber >= 50 && gradeNumber < 60)
		{
			gradeLetter = 'D';
			System.out.println("You can do better next time" + name + ", you grade is " + gradeLetter);
		} else if (gradeNumber >= 0 && gradeNumber < 50)
		{
			gradeLetter = 'F';
			System.out.println("Ah oh, there is always next time, your grade is " + gradeLetter);
		} else
		{
			System.out.println("Please re-enter grade number 1 - 100.\n");
		}
	}

	private static void evalMonth()
	{
		// Function that prints the name of month using switch statement given a
		// number from user.
		int monthNumber;
		String input, month;
		System.out.println("Please enter month in corresponding number, from 1 - 12.\n");
		input = scanner.nextLine();
		monthNumber = Integer.parseInt(input);
		switch (monthNumber)
		{
		case 1:
			month = "January";
			System.out.println("The month is " + month + ".\n");
			break;
		case 2:
			month = "February";
			System.out.println("The month is " + month + ".\n");
			break;
		case 3:
			month = "March";
			System.out.println("The month is " + month + ".\n");
			break;
		case 4:
			month = "April";
			System.out.println("The month is " + month + ".\n");
			break;
		case 5:
			month = "May";
			System.out.println("The month is " + month + ".\n");
			break;
		case 6:
			month = "June";
			System.out.println("The month is " + month + ".\n");
			break;
		case 7:
			month = "July";
			System.out.println("The month is " + month + ".\n");
			break;
		case 8:
			month = "August";
			System.out.println("The month is " + month + ".\n");
			break;
		case 9:
			month = "September";
			System.out.println("The month is " + month + ".\n");
			break;
		case 10:
			month = "October";
			System.out.println("The month is " + month + ".\n");
			break;
		case 11:
			month = "November";
			System.out.println("The month is " + month + ".\n");
			break;
		case 12:
			month = "December";
			System.out.println("The month is " + month + ".\n");
			break;
		default:
			System.out.println("You've entered invalid number for the month.\n");
			break;
		}
	}
}
