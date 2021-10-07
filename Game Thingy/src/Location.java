import java.util.ArrayList;
import java.util.Scanner;

public class Location
	{
		private String name;
		private String description;
		private boolean hasRandomMonster;
		
		
	
		public Location(String name, String description, boolean hasRandomMonster)
			{
				
				this.name = name;
				this.description = description;
				this.hasRandomMonster = hasRandomMonster;
				
				
			}



		public String getName()
			{
				return name;
			}



		public void setName(String name)
			{
				this.name = name;
			}



		public String getDescription()
			{
				return description;
			}



		public void setDescription(String description)
			{
				this.description = description;
			}



		public boolean isHasRandomMonster()
			{
				return hasRandomMonster;
			}



		public void setHasRandomMonster(boolean hasRandomMonster)
			{
				this.hasRandomMonster = hasRandomMonster;
			}
		
		
		
		
		
		
		
		
		
	}

