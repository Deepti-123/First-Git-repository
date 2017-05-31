package firstMaven.SelMaven;

public class CarTest 
{
	public static void main(String args[])
	{
		System.out.println("Running BMW");
		CarTest oBMW =new CarTest();
		oBMW.sColor = "Silver";
		oBMW.iNumberOfDoors = 4;
		oBMW.start();
		oBMW.moveForward();
		oBMW.moveBackward();
		oBMW.stop();
		
		System.out.println("\n\nRunning Nissan");
		CarTest oNissan =new CarTest();
		oNissan.sColor = "Grey";
		oNissan.iNumberOfDoors = 6;
		oNissan.start();
		oNissan.moveForward();
		oNissan.moveBackward();
		oNissan.stop();
		
	}
	String sColor;
	int iNumberOfDoors;
	boolean IsAutoTransmission;
	float Length;
	
	void start()
	{
		System.out.println("Logic related to Star the Car ");
	}
	
	void stop()
	{
		System.out.println("Logic related to Stop the Car");
	}
	
	void moveForward()
	{
		System.out.println("Logic related to moveForward the Car");
	}
	
	void moveBackward()
	{
		System.out.println("Logic related to moveBackward the Car");
		
	}
	
	

	
		
	}
	
	
	
	


