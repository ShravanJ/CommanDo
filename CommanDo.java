/**CommanDo -  a command line interpreter for Java
*@author Shravan Jambukesan
*Copyright 2014-2015 Inferno Group
*/

import java.util.Scanner;

public class CommanDo
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);


		

		System.out.println("CommanDo - a command line interpreter for Java");
		boolean validInput = true;

		while (validInput)
		{
			System.out.print(">");



			if (scan.hasNext())
			{
				String input = scan.nextLine();
				if (input.indexOf("exit") == 0)
				{
					validInput = false;
				}

				if (input.indexOf("print") == 0)
				{
					String output = input;
					String regex = "\\s*\\bprint\\b\\s*";
					output = output.replaceAll(regex, " ");
					System.out.println(output);
				}

				if (input.indexOf("clear") == 0)
				{
					for(int x = 0; x < 30; x++)
					{
						System.out.println();
					}
					System.out.println("CommanDo -  a command line interpreter fo Java");
				}

				if(input.indexOf("loopcount++") == 0)
				{
					System.out.print("Define starting value (integer): ");
					int startInt = scan.nextInt();
					System.out.print("Define operator (>, <, =, >=, <=): ");
					input = scan.next();
					System.out.print("Define arguement (integer): ");
					int argInt = scan.nextInt();

					if (input.indexOf(">") == 0)
					{
						
						while (startInt > argInt)
						{
							argInt++;
							System.out.println(argInt);

						}
					}
					if (input.indexOf("<") == 0)
					{
						while (startInt < argInt)
						{
							argInt++;
							System.out.println(argInt);
						}
					}
					if (input.indexOf("=") == 0)
					{
						while (startInt == argInt)
						{
							argInt++;
							System.out.println(argInt);
						}
					}
					if (input.indexOf(">=") == 0)
					{
						while (startInt >= argInt)
						{
							argInt++;
							System.out.println(argInt);
						}
					}
					if (input.indexOf("<=") == 0)
					{
						while (startInt <= argInt)
						{
							argInt++;
							System.out.println(argInt);
						}
					}

				}

			}
			else
			{
				validInput = false;
			}
		}

	}
















}
