import java.util.ArrayList;
import java.util.Scanner;

public class PlayGame  
	{
		
		
		static Scanner userStringInput= new Scanner(System.in);
		static Scanner userIntInput= new Scanner(System.in);
		
		static String name;
		static Player hero;
		static int choice;
		

		public static void main(String[] args)
			{
				Place.addLocations();
				introduceCharacter();
				pressEnter();
				tutorial();
				pressEnter();
				choice1();
				
				
				
				
				
			}

		
		public static void introduceCharacter()
		{
			
			//setting up backstory
			
			
			System.out.println("Hero, thank goodness you've arrived here at Okobure Village!");
			System.out.println();
			System.out.println("The darkness is continuing to spread and only you can defeat it.\n"
					+ "Please traveler, what is your name?");		
					
			name = userStringInput.nextLine();
			
			hero = new Player (name, 1, 100, 0);
			
			System.out.println("");
			System.out.println(name+", you are our last hope. As you battle to defeat the darkness, \n"
					+ "you will have to use your intution to find your way through. \n"
					+ "You will be given multiple paths, but it is up to you to decide which is best. \n"
					+ "Good luck " + name+ ", it is up to you to save us all.");
			
			System.out.println();
			System.out.println();
			System.out.println();
			

			
			System.out.println("PRESS ENTER TO CONTINUE");
			
			
		}
		
		public static void pressEnter()
		{
			
			
			String enter = userStringInput.nextLine();
			
			for(int i = 0;i<=100;i++)
				{
					System.out.println(" ");
				}
						
		}
		
		public static void tutorial()
		{
			
			System.out.println("TUTORIAL:");
			System.out.println("Your player stats will always appear on screen");
			System.out.println("name: "+hero.getName()+"       lvl: "+hero.getLevel()+"       health: "+hero.getHealth()+"       armor: "+hero.getArmor());
			
			System.out.println();
			System.out.println();
			System.out.println();
			
			System.out.println("Some monsters will require a certain level to beat, your stats will show\nyou if you can. In all activities, "
					+ "and when fighting, you will be given \n2-4 options for things you can do. To select an option, simply type in the \nnumber"
					+ " of the option with no spaces or extra characters and press enter. \nGood luck on your journey hero!");
			
			System.out.println();
			System.out.println();
			System.out.println();
			
			System.out.println("PRESS ENTER TO CONTINUE");
			
			for(int i = 0;i<=39;i++)
				{
					System.out.println(" ");
				}
			
		}
		
		
		public static void playerStats()
		{
			System.out.println("name: "+hero.getName()+"       lvl: "+hero.getLevel()+"       health: "+hero.getHealth()+"       armor: "+hero.getArmor());
			System.out.println();
			System.out.println();
			System.out.println();
		}
		
		public static void choice1()
		{
			//where to go in the game
			
			
			playerStats();
			System.out.println("In Okobure Village, you decide on two things, stay in the village for one more \nday "
					+ "to collect information and supplies to defeat the darkness, \nor head to the Humming Forest. ");
			
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("1) Stay in the village for one more day to collect information and supplies\n"
					+ "2) Leave and head to the Humming Forest");
			System.out.println();
			System.out.println();
			System.out.println();
			
			
			for(int i = 0;i<=39;i++)
				{
					System.out.println(" ");
				}
			
			choice = userIntInput.nextInt();
			
			
			
			for(int i = 0;i<=100;i++)
				{
					System.out.println(" ");
				}
			
			
			if(choice == 1)
				{
					
					System.out.println(Place.places.get(0).getName());
					System.out.println();
					System.out.println(Place.places.get(0).getDescription());
					
					System.out.println("\n\n\n");
					System.out.println();

				}
			else if(choice == 2)
				{
					System.out.println(Place.places.get(1).getName());
					System.out.println();
					System.out.println(Place.places.get(1).getDescription());
				}
			else
				{
					choice1();
				}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
