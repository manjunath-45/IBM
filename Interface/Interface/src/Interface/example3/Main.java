package Interface.example3;

public class Main {
     
	public static void main( String[] args)
	{
		Flyable[] fly = {new Spacecraft(), new Airplane() , new Helicopter()};
		
		for(Flyable obj: fly) {
			obj.fly();
		}
	}
}
