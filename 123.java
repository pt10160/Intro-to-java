package cs141_wow;

import java.util.Scanner;

//martin
public class 123 {
	public static void main(String[] args) {
		System.out.println("Welcome to LETS MAKE A DEAL!! Enter A to play, else to quit\n");//start the game or no
		Scanner input = new Scanner(System.in);
		String choice = input.next();
		
			
		
		
		
		boolean done = false;   
		double wins = 0;
		double loses = 0;       
		double games = 0;
		while (!done)
	    {	
		
		if(choice.equals("A")|| choice.equals("a")) {
			
			
				System.out.println("Which door do you want to choose? \n" +
						"Door number 1, 2 or 3?  \n");
				Scanner number = new Scanner(System.in);
				System.out.println("Please type 1, 2 ,3 ");
				
				if(number.hasNextInt()){ 
					int scan = number.nextInt();
					if(scan <= 3 || scan > 0) {
						int prizeIs =0;
						prizeIs = (int) ((Math.random() * 3) + 1);
						System.out.println(prizeIs);//this one is remind the user how to win 
						int win_door = 0;//new value
		                int chosedoor = 0;
		
		
		                    while (prizeIs == scan)
		                    {
		                        chosedoor = (int) ((Math.random() * 3) + 1);//get a random number
		                        while (chosedoor == prizeIs)
		                        {
		                            chosedoor = (int) ((Math.random() * 3) + 1);
		                        }
		                    }
		                    if (prizeIs == 1 && scan == 2)//little think here kinda hard explain
		                    {
		                        chosedoor = 3; 
		                    }
		                    else if (prizeIs == 1 && scan == 3 )
		                    {
		                        chosedoor = 2; 
		                    }
		                    else if (prizeIs == 2 && scan == 1 )
		                    {
		                        chosedoor = 3;
		                    }
		                    else if (prizeIs == 2 && scan == 3 )
		                    {
		                        chosedoor = 1;
		                    }
		                    else if (prizeIs == 3 && scan == 1 )
		                    {
		                        chosedoor = 2;
		                    }
		                    else if (prizeIs == 3 && scan == 2 )
		                    {
		                        chosedoor = 1;
		                    }
		                    System.out.println("\n now i am gonna open \n\nDoor [" + chosedoor + "]");// open one door that is not the prize door
		                    System.out.println("\nwould you like to switch doors? ('Y' or 'N') ");//ask to swithch door
		                    String decision = input.next();

		                    if(decision.equals("Y"))//if decision equal y then switch door
	                        {
	                            System.out.println("pick a new door please (can not be the one with a zonk)");
	                            scan = input.nextInt();
	                            win_door = scan;
	                            System.out.println("The Prize is in\n\nDoor [" + prizeIs + "]");
	                            if (prizeIs == win_door || prizeIs == scan)
	                            {
	                                System.out.println("\nnice you win!");
	                                
	                            }
	                            else 
	                            {
	                                System.out.println("\n..sorry you lost the game.");
	                                
	                            }

	                            
	                            System.out.println("\nWould You Like To Play Again? ('Y' or 'N')");
	                            decision = input.next();

	                            if(decision.equals("N"))
	                            {
	                                System.out.println("gg,welcome next time");
	                            }
	                            else if(decision.equals("Y"))
	                            {

	                                System.out.println("*******************************");

	                            }
	                            else
	                            {
	                                System.out.println("Invalid Entry, Please Try Again ('Y' or 'N')");

	                            }

	                        }
	                        else if(decision.equals("N"))
	                        {
	                            win_door = scan;
	                            System.out.println("The Prize is in\n\nDoor [" + prizeIs + "]");
	                            if (prizeIs == win_door || prizeIs == scan)
	                            {
	                                System.out.println("\nCONGRATUALTIONS!!!\nYOU WON!!!!!");
	                                
	                            }
	                            else 
	                            {
	                                System.out.println("\n..Sorry, You Lost.");
	                                
	                            }
	                            System.out.println("\nWould You Like To Play Again? ('Y' or 'N')");
	                            decision = input.next();

	                            if(decision.equals("N"))
	                            {
	                                System.out.println("\nWell Thanks For Playing\nYour Win Percentage was ");
	                                if(wins <= 0.0 || wins < loses)
	                                {
	                                    double percentage = 0;
	                                    System.out.printf(percentage +"%");
	                                }
	                                else
	                                {
	                                    double percentage = (wins-loses)/games * 100;
	                                    System.out.printf("%5.2f", percentage +"%");
	                                }   
	                                done = true;
	                                input.close();
	                            }
	                            else if(decision.equals("Y"))
	                            {

	                                System.out.println("*******************************");

	                            }
	                            else
	                            {
	                                System.out.println("Invalid Entry, Please Try Again ('Y' or 'N')");

	                            }

	                        }
	                        else 
	                        {
	                            System.out.println("Invalid Entry, Please Try Again ('Y' or 'N')");

	                        }


	                    }
	                else
	                {
	                    System.out.println("Invalid Entry, Please Try Again.");
	                }

	                }
	                else
	                {
	                    System.out.println("Invalid Entry, Please Try Again.");
	                    input.next();
	                }
	            }

                        
                        
        			}
                    
			
		}
				
}	

		
			
		

		

	
