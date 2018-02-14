import lejos.hardware.lcd.LCD;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.RegulatedMotor;
import lejos.utility.Delay;



public class Motor_class {
	
	private static RegulatedMotor big_motorA;
	private static RegulatedMotor big_motorB;
	
	double r = 90.0; //mm
	double d = 153.0; //mm
	double l = 178.0; // mm
	
	 
	double x = r - Math.sqrt((r*r)-(d/2)*(d/2));
	double alpha = 9*1250/17.8;
	double beta = (Math.atan2(d/2, r-x))/Math.PI*180;
	//System.out.print(beta);
	
	public void Motor_Forword(int korobok) {
	//case1
	    big_motorA = new EV3LargeRegulatedMotor(MotorPort.A);//большой мотор подключенный к А
	    big_motorA.setSpeed(90);

	    big_motorB = new EV3LargeRegulatedMotor(MotorPort.B);//большой мотор подключенный к B
	    big_motorB.setSpeed(30);
		
		switch (korobok) {
		case 1:
			    big_motorA.rotate((int)alpha);//откатиться назад на ...
			    Delay.msDelay(1000);
			    big_motorB.rotate(-90);
			    Delay.msDelay(1000);
			break;
			
		case 2:
        	//LCD.drawString("Case 2",0,0);
        	//Delay.msDelay(3000);
			big_motorB.rotate(-90);
		    Delay.msDelay(1000);
		    big_motorA.rotate(-(int)alpha);//прикатиться вперед
		    Delay.msDelay(1000);
		    break;

		default:
			break;
		}
 
	}
	
    //case2

    
}
  

//forward() – двигаться вперёд до получения команды стоп (или её эквивалента);
//backwards() – двигаться назад до получения команды стоп (или её эквивалента);
//stop() – остановить мотор;
//flt() – остановить мотор без торможения;
// setSpeed(int speed) – установить скорость;
// rotate(int angle) – повернуть на угол (угол может быть положительным или отрицательным в градусах);
//rotateTo(int angle) – повернуть мотор до угла (в градусах)