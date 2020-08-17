import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		double relBatteryHeight, shellVelocity, targetDist;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insert the height of the battery relative to the water line in meters: \n");
		relBatteryHeight = input.nextDouble();
			
		System.out.println("Insert the velocity of the shell in meters per second: \n");
		shellVelocity = input.nextDouble();
				
		System.out.println("Insert the distance to the target in meters: \n");
		targetDist = input.nextDouble();
		
		System.out.println("Given information");
		System.out.println("Battery Height: " + relBatteryHeight + " meters");
		System.out.println("Shell Velocity: " + shellVelocity + " meters per second");
		System.out.println("Target Distance: " + targetDist + " meters \n");
		
		double a = -4.9*(targetDist/shellVelocity)*(targetDist/shellVelocity);
		
		double b = targetDist;
		
		double c = a + relBatteryHeight;
		
		double tanTheta = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
		
		double angle = Math.atan(tanTheta)*180/3.1415926;
		
		System.out.println("Fire at " + angle + " degrees");
		
	}
}
