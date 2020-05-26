5)write a programs to print all numbers from 1 to 100.
code::
import java.io.*; 
import java.util.*; 
import java.text.*; 
import java.math.*; 
import java.util.regex.*; 

class GFG 
{ 
	// Prints numbers from 1 to n 
	static void printNos(int n) 
	{ 
		if(n > 0) 
		{ 
			printNos(n - 1); 
			System.out.print(n + " "); 
		} 
		return; 
	} 

	// Driver Code 
	public static void main(String[] args) 
	{ 
		printNos(100); 
	} 
} 


6)program to print alternate odd numbers from 1 to 99
code::
import java.util.*;
 public class Exercise48 {
     public static void main(String[] args){
	for (int i = 1; i < 100; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
    }
}

7)program to print alternate even numbers from 1 to 100.
code::
class JavaExample {
   public static void main(String args[]) {
	int n = 100;
	System.out.print("Even Numbers from 1 to "+n+" are: ");
	for (int i = 1; i <= n; i++) {
	   //if number%2 == 0 it means its an even number
	   if (i % 2 == 0) {
		System.out.print(i + " ");
	   }
	}
   }
}

8)program to accept  two numbers and print whether their sum is even or odd.
code::
import java.util.Scanner;
public class Sum_Odd_Even 
{
    public static void main(String[] args) 
    {
        int n, sumE = 0, sumO = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements in array:");
        n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            if(a[i] % 2 == 0)
            {
                sumE = sumE + a[i];
            }
            else
            {
                sumO = sumO + a[i];
            }
        }
        System.out.println("Sum of Even Numbers:"+sumE);
        System.out.println("Sum of Odd Numbers:"+sumO);
    }
}


 
