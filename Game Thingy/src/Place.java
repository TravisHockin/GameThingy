import java.util.ArrayList;
public class Place
	{

		static ArrayList <Location> places = new ArrayList <Location>();
		public static void addLocations()
		{
		
		//0
		places.add(new Location("Okobure Village", "Okobure village, also known as Leftover Village, is one of the few villages \nleft just outside of "
				+ "the range of the darkness. It is a small village of \nabout 70 people with just enough arable land to sustain everyone.", false));
		//1
		places.add(new Location("Humming Forest", "The Humming Forest is the first terrain that must be passed through on the \n"
				+ "way to the mountains where the Leader of the Darkness resides. \n"
				+ "It is called the Humming Forest due to the humming sound made from wind \n"
				+ "blowing through the odd shape of the trees.", true));
		//2
		places.add(new Location("f", "f", true));
		
		
		
		
		}
	}
