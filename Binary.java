package parimala;
import java.io.*;


		// Java Program to Convert Integer Values into Binary

		// Importing Classes/Files
		

		class Binary {
			// Function converting decimal to binary
			static void decimalToBinary(int num)
			{
				// Function to print integer to binary using
				// inbuilt toBinaryString method
				System.out.println(Integer.toBinaryString(num));
			}

			// Main driver function
			public static void main(String[] args)
			{
				// Number to be converted into binary
				int num = 35;

				// Calling function
				decimalToBinary(num);
			}
		}
