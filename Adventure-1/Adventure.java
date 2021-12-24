

import java.util.Scanner;

public class Adventure {

	public static void main(String[] args) {
		
		int row=0;
		int column=0;

		String command="";
		Scanner input =new Scanner(System.in);
		//Prompt user for a command 
		
		String [] splitCommand=new String[2];
		//prompt user for a command until the user enters quit
		while(!command.equalsIgnoreCase("quit"))
		{
			System.out.println("Please enter a command or quit to exit");
			
			command=input.nextLine();
			splitCommand= command.split(" +");
			//check if command is valid check go 
			
			//int[] []map=new int [5][5];
			  
		if(splitCommand[0].startsWith("g"))
		{
			
		
			if(splitCommand[1]==null)
			{
				System.out.println("You need to specify the direction");
				continue;
			}
			
			//check which move to make
			switch(splitCommand[1])
			{
				case "north": {
								if(row==0)
								{
									System.out.println("Move not allowed you are at the top");
								}
								else
									row=row-1; 
								
								break;
							  }
				case "south": {
					if(row==4)
					{
						System.out.println("Move not allowed you are at the bottom");
					}
					else
					row=row+1; 
					break;
					
				
				}
				case "east":{ 
					if(column==4)
					{
						System.out.println("Move not allowed you are at the end of the grid");
					}
					else
					column=column+1; 
					break;
					}
				case "west":{ 
					if(column==0)
					{
						System.out.println("Move not allowed you are at the end of the grid");
					}
					else
					    column=column-1;
					break;
								
				}
				default:System.out.println("invalid move try again");
			}//end switch
			
			System.out.println("The new location is : (" +row +" , "+column+")");
		}
		else if(splitCommand[0].startsWith("i"))
		{
			String [] inventory= {"brass" ,"lantern", "rope","rations","staff"};
			System.out.println("Inventory  :");
			for(String inventoryItem: inventory)
			{
				System.out.println(inventoryItem);
			}
		}
		
		
		}
		
		

	}

	
	
}
