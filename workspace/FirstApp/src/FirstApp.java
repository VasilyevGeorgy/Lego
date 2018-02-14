import lejos.hardware.BrickFinder;
import lejos.hardware.lcd.GraphicsLCD;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.RegulatedMotor;
import lejos.utility.Delay;


public class FirstApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 RegulatedMotor a = new EV3LargeRegulatedMotor(MotorPort.A);
	 a.rotate(-90); // is same with ordinary
	 RegulatedMotor b = new EV3LargeRegulatedMotor(MotorPort.B);
	 b.rotate(-40);// -35 is max anticlockwise for if start position is normal, 70 is max clockwise
	 RegulatedMotor c = new EV3MediumRegulatedMotor(MotorPort.C);
	 c.rotate(-90);// 90 is max, plus is forward, minus is backward
	 
     GraphicsLCD g  = BrickFinder.getDefault().getGraphicsLCD();
     
     //g.drawString("Hello World!", 0, 0, GraphicsLCD.VCENTER | GraphicsLCD.LEFT);

     //Delay.msDelay(5000);
		
	}

}
