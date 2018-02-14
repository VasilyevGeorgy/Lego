import lejos.hardware.lcd.LCD;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.SensorConstants;
import lejos.hardware.sensor.SensorMode;
import lejos.robotics.RegulatedMotor;
import lejos.utility.Delay;
import lejos.hardware.sensor.EV3ColorSensor;



public class rt{

	private static EV3ColorSensor sensor;
	/*private static RegulatedMotor big_motor;
	private static RegulatedMotor big_motor2;*/

	public static void main(String[] args) {
		sensor = new EV3ColorSensor(SensorPort.S1);
	    sensor.setFloodlight(false);
	    LCD.drawString("Init", 2, 2);
	    LCD.setAutoRefresh(false);
	    SensorMode brightnessSensorMode = sensor.getRGBMode();
	    float[] sample = new float[brightnessSensorMode.sampleSize()];
	    int i = 0;
	   /* double blue_min[] = {0.03137-0.01538,0.06176-0.02255,0.07353-0.02058};
	    double blue_max[] = {0.04705+0.01538,0.08431+0.02255,0.09411+0.02058};
	    boolean a = false;
	    boolean b = false;*/

	    while(i < 25) {
	    	++i;
	        brightnessSensorMode.fetchSample(sample, 0);
	        LCD.refresh();
	        LCD.clear();
	        System.out.println("R: " + sample[0] + " G: " + sample[1] + " B: " + sample[2]);
	        /*if ((blue_min[0]<=sample[0]) && (blue_min[1]<=sample[1]) && (blue_min[2]<=sample[2])) {
	        	a = true;
	        }
	        if ((blue_max[0]>=sample[0]) && (blue_max[1]>=sample[1]) && (blue_max[2]>=sample[2])) {
	        	b = true;
	        }
	        if  (a && b) {
	        	LCD.drawString("Blue",0,0);
	        	Delay.msDelay(3000);
	        	break;
	        }
	        else {LCD.drawString("Not Blue",0,0);
	        	Delay.msDelay(3000);
	        	break;}*/
	        	
	        LCD.drawString("R: " + sample[0], 1, 1);
	        LCD.drawString("G: " + sample[1], 1, 2);
	        LCD.drawString("B: " + sample[2], 1, 3);
	        
	    }
	    /*big_motor = new EV3LargeRegulatedMotor(MotorPort.A);//большой мотор подключенный к А
	    big_motor.rotate(1260);//повернуть на 360 градусов
	    Delay.msDelay(2000);
	    big_motor2 = new EV3LargeRegulatedMotor(MotorPort.B);
	    big_motor2.rotate(360);
	    big_motor.
        //forward() – двигаться вперёд до получения команды стоп (или её эквивалента);
        //backwards() – двигаться назад до получения команды стоп (или её эквивалента);
        //stop() – остановить мотор;
        //flt() – остановить мотор без торможения;
       // setSpeed(int speed) – установить скорость;
       // rotate(int angle) – повернуть на угол (угол может быть положительным или отрицательным в градусах);
        //rotateTo(int angle) – повернуть мотор до угла (в градусах).*/

		
		 }
      
}