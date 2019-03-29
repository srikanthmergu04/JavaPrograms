import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.*;

class Game implements Serializable
{
	String name;
	int score;
	int level;
	Game(String name,int score,int level)
	{
		this.name = name;
		this.score = score;
		this.level = level;
	}
}
public class SearializableDeserializable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Game g1  = new Game("Srikanth",123,10);
		Game g2  = new Game("Uday",155,12);
		Game g3  = new Game("Krishna",211,19);
		
		try {
			
			FileOutputStream fstr = new FileOutputStream("game.ser");
			
			ObjectOutputStream os = new ObjectOutputStream(fstr);
			
			os.writeObject(g1);
			os.writeObject(g2);
			os.writeObject(g3);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		try
		{
			FileInputStream fstr1 = new FileInputStream("game.ser");
			ObjectInputStream os1 = new ObjectInputStream(fstr1);
			
			Game game1 = (Game) os1.readObject();
			Game game2 = (Game) os1.readObject();
			Game game3 = (Game) os1.readObject();
			System.out.println(" Name = "+game2.name+" level =  "+game2.level+" score = "+game3.score);
		  	
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	    
	    	
	    
		
		

	}

}
