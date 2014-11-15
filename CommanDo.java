/**CommanDo -  a command line interpreter for Java
*@author Shravan Jambukesan
*Copyright 2014 Bloosoft Ltd
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
				if (input.equalsIgnoreCase("exit"))
				{
					validInput = false;
				}
				

				if (input.contains("print"))
				{
					String output = input;
					String regex = "\\s*\\bprint\\b\\s*";
					output = output.replaceAll(regex, " ");
					System.out.println(output);
				}

				if (input.contains("clear"))
				{
					for(int x = 0; x < 30; x++)
					{
						System.out.println();
					}
					System.out.println("CommanDo -  a command line interpreter fo Java");
				}

			}
			else
			{
				validInput = false;
			}
		}

	}
















}
