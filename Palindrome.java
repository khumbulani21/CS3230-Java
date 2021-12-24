//package palindrome;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String word="";
		StringBuilder temp= new StringBuilder();
		StringBuilder reversedWord=new StringBuilder();
		Scanner input= new Scanner(System.in);
		
		//check number of command line arguments
		 if(args.length>0)
		 { 
			 for(int i=0;i<args.length;i++)
			 word+=args[i]; 
		 }
		 else
		 {
			 System.out.println("Please enter a potential palindrome:"); 
			 word=input.nextLine();
		 }
		//remove spaces
		 temp= temp.append(word);
		word= word.replaceAll(" ","");
		reversedWord= new StringBuilder(word).reverse();
	for(int i=0;i<word.length();i++)
	{
		if(word.charAt(i)==reversedWord.charAt(i))
		{
			if(i==word.length()-1)
			{
				System.out.println( "Your string is a palindrome ");
			}
			continue;
		}
		else 
			{
			System.out.println("Your string is not a palindrome ");
			break;
			}
	}
		
	
		
		

	}

}
