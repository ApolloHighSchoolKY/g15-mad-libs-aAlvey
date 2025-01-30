//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MadLib
{
	private ArrayList<String> verbs = new ArrayList<String>();
	private ArrayList<String> nouns = new ArrayList<String>();
	private ArrayList<String> adjectives = new ArrayList<String>();
	private ArrayList<String> daStory = new ArrayList<String>();
	private String story = "";

	public MadLib()
	{
		verbs.add("punched");
		nouns.add("Wal-Mart");
		adjectives.add("MASSIVE");
		story= "I punched Wal-Mart in a MASSIVE way.";
	}

	public MadLib(String fileName)
	{
		//load stuff
		loadAdjectives();
		loadNouns();
		loadVerbs();

		try
		{
			//Read the different parts of the story and concatenate the resulting
			//story using the symbols to tell you the parts of speech
			Scanner scannerStory = new Scanner(new File("story.dat"));

				while(scannerStory.hasNext())
				{
					daStory.add(scannerStory.next());
				}
				
				scannerStory.close();


			



			//While there is more of the story, read in the word/symbol

				//If what was read in is one of the symbols, find a random
				//word to replace it.
			

				int count = 0;
				

				for(int i = 0; i < daStory.size()-1 ;i++)
					
				
				
				if(daStory.get(i) == "#")
				{
					
					
					count++;
					

				}

				System.out.println(count); 

		}
		catch(Exception e)
		{
			System.out.println("Houston we have a problem!");
		}

	}

	public void loadNouns()
	{
		try
		{
			Scanner scannerNouns = new Scanner(new File("nouns.dat"));

			while(scannerNouns.hasNext()) {
				
				nouns.add(scannerNouns.next());
			}

			scannerNouns.close();
		}
		catch(Exception e)
		{
			System.out.println("nouns.dat does not exist");
		}

	}

	public void loadVerbs()
	{
		try
		{
			Scanner scannerVerb = new Scanner(new File("verbs.dat"));

				while(scannerVerb.hasNext())
				{
					verbs.add(scannerVerb.next());
				}

				scannerVerb.close();
		}
		catch(Exception e)
		{
			System.out.println("verbs.dat does not exist");
		}
	}

	public void loadAdjectives()
	{
		try
		{
			Scanner scannerAd = new Scanner(new File("adjectives.dat"));

				while(scannerAd.hasNext())
				{
					adjectives.add(scannerAd.next());
				}

				scannerAd.close();

		}
		catch(Exception e)
		{
			System.out.println("adjectives.dat does not exist");
		}
	}

	public String getRandomVerb()
	{
		int spot =(int) (Math.random()*verbs.size());
	
		return "" + verbs.get(spot);
	}

	public String getRandomNoun()
	{
		int spot2 =(int) (Math.random()*nouns.size());
		
		return "" + nouns.get(spot2);
	}

	public String getRandomAdjective()
	{
		int spot3 =(int) (Math.random()*adjectives.size());
		
		return "" + adjectives.get(spot3);
	}

	public String toString()
	{
		return "" + story;
	}
}