
//Import line for using new Random
import java.util.Random;

public class RandomStuff {

    public static void main (String[] args)
    {
    	//Math.random version
    	int x = (int)(Math.random()*50 + 1);

    	System.out.println(x);

    	//new Random version
    	Random rand = new Random();
    	int y = rand.nextInt(50) + 1;

    	System.out.println(y);

		//Range from -3 to 8: 12 possible numbers
		int x = (int)(Math.random()*12 - 3);

		//13 to 27: 15 possible numbers
		Random rand = new Random();
		int y = rand.nextInt(15) + 13;

    }


}