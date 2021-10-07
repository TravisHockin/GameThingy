import java.util.ArrayList;
import java.util.Scanner;

public class Player
	{

		private String name;
		private int level;
		private int health;
		private int armor;
		
		
		
		public Player(String name, int level, int health, int armor)
		{
			
			this.name = name;
			this.level = level;
			this.health = health;
			this.armor = armor;
			
		}



		public String getName()
			{
				return name;
			}



		public void setName(String name)
			{
				this.name = name;
			}



		public int getLevel()
			{
				return level;
			}



		public void setLevel(int level)
			{
				this.level = level;
			}



		public int getHealth()
			{
				return health;
			}



		public void setHealth(int health)
			{
				this.health = health;
			}



		public int getArmor()
			{
				return armor;
			}



		public void setArmor(int armor)
			{
				this.armor = armor;
			}


		
		
		
		
		
		
		
		
	}


