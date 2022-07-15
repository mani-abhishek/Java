// Java program to demonstrate finally block
// When exception rise and not handled by catch

import java.io.*;

public class finallyIntro {
	public static void main(String[] args)
	{
		try {
			System.out.println("Inside try block");

			// Throw an Arithmetic exception
			System.out.println(34 / 0);
		}

		// Can not accept Arithmetic type exception
		// Only accept Null Pointer type Exception
		catch (NullPointerException e) {

			System.out.println(
				"catch : exception not handled.");
		}

		// Always execute
		finally {

			System.out.println(
				"finally : i will execute always.");
		}
		// This will not execute
		System.out.println("i want to run");
	}
}
