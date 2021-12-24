import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FractionCalc {

	static      String regex ="-?[0-9]+[ \t]*/[ \t]*-?[0-9]+[ \t]*[+-/\\*][ \t]*-?[0-9]+[ \t]*/[ \t]*-?[0-9]+";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	List<String> list= new ArrayList<>();
	List<String> strings= new ArrayList<>();
		//Prompts the user to enter a potential fraction expression
	System.out.println("Please enter   your fraction expression : ");
		//Reads the expression as a string with a Scanner (this is specified to ease grading); the program does not loop on failed input
	String inputString= input.nextLine();
	StringBuilder sb= new StringBuilder();
	//validate if the string is a fraction expression
	if (inputString.matches(regex))
	{
		System.out.println("Match:    " + inputString);
		//trim
		 inputString=inputString.trim();
		
		
		//use string tokenizer 
	 
		StringTokenizer st = new StringTokenizer(inputString, " "); 
		//Parses the expression into a token stream (technique to be determined below)
		
		//eliminate space
				while (st.hasMoreTokens()) {
					sb.append(st.nextToken());
					
				}
				 
			
					  st = new StringTokenizer(sb.toString(), "-/+*/",true); 
				
					 
		
						
						
				///from here
					
					//	StringBuilder  sb= new StringBuilder();
				//use stream tokenizer to eliminate  first number
						String sr=sb.toString();
					int numerator1= getNextInt(sr);
					 
						
						StringBuilder sx= new StringBuilder(sr.substring(sr.indexOf("/")+1));
		 
						
						
						 int denominator1= getNextInt( sx.toString());
					
							 st = new StringTokenizer(sx.toString(), "-*+/",true); 

							 String temp=null;
						
									while (st.hasMoreTokens()) {
										temp= st.nextToken();
										strings.add(temp);
									
									}
							 
									 temp=strings.get(1);
									 String operator=temp;
							 
									 
									 sx= new StringBuilder(sx.substring(sx.indexOf(temp)+1));
									 
						
						
									 int numerator2= getNextInt( sx.toString());
					
					
						
									  st = new StringTokenizer(sx.toString(), "/"); 

									   temp=null;
									
									   strings.clear();
											while (st.hasMoreTokens()) {
												temp= st.nextToken();
												strings.add(temp);
										
											}
									 
											temp=strings.get(1);
									 
							 
						
						int denominator2=getNextInt(temp);
						
						
						
						//create fractions
						
						Fraction firstFraction= new Fraction(numerator1, denominator1);
						Fraction secondFraction= new Fraction(numerator2, denominator2);
					//System.out.println(firstFraction);
					//System.out.println(secondFraction);
					
					switch(operator)
					{
					case "+": System.out.println("answer "+ firstFraction.add(secondFraction));break;
					case "-":System.out.println("answer "+ firstFraction.sub(secondFraction));break;
					case "*": System.out.println("answer "+ firstFraction.mult(secondFraction));break;
					case "/":System.out.println("answer "+ firstFraction.div(secondFraction));break;
					
					}
				 
						
						
						
						
						
						
		
		
	}
	else
	{
		System.out.println("Invalid expression please enter  a fraction expression : " + inputString);
		//exit program
	}

	}
	
	
	public static int getNextInt(String input)
	{
		int num = 0;
		StringReader sr= new StringReader(input);
		StreamTokenizer st= new StreamTokenizer(sr);
		 try {
		 
			if(st.nextToken()!=StreamTokenizer.TT_EOF && st.ttype==StreamTokenizer.TT_NUMBER)
			{
				 
				  num= (int)st.nval;
				 
			}
			
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num ;
		
		
	}
	
	
	
}