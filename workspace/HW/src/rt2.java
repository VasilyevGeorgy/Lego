import lejos.hardware.lcd.LCD;
//import lejos.hardware.motor.EV3LargeRegulatedMotor;
//import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
//import lejos.hardware.sensor.SensorConstants;
import lejos.hardware.sensor.SensorMode;
import lejos.robotics.SampleProvider;
//import lejos.robotics.RegulatedMotor;
import lejos.utility.Delay;
import lejos.hardware.sensor.EV3ColorSensor;


public class rt{

	private static EV3ColorSensor sensor;


	public static void main(String[] args) {
		Motor_class a1 = new Motor_class();
		sensor = new EV3ColorSensor(SensorPort.S1);
	   sensor.setFloodlight(false);

	    Delay.msDelay(3000);
	    
	    LCD.setAutoRefresh(false);
	    SensorMode brightnessSensorMode = sensor.getRGBMode();
	    float[] sample = new float[brightnessSensorMode.sampleSize()];
	    
		
		
		
		
		
	   //blue
	    double blue_min[] = {0.03137-0.01538,0.06176-0.02255,0.07353-0.02058};
	    double blue_max[] = {0.04705+0.01538,0.08431+0.02255,0.09411+0.02058};
	    //black
	    double black_min[] = {0.02254,0.02647,0.01372};
	    double black_max[] = {0.03235,0.03725,0.0245};
	    //green
	    double green_min[] = {0.03235-Math.abs(0.03235-0.04019),0.10294-Math.abs(0.10294-0.1156),0.03431-Math.abs(0.03431-0.04411)};
	    double green_max[] = {0.04019+Math.abs(0.03235+0.04019),0.1156+Math.abs(0.10294+0.1156),0.04411+Math.abs(0.03431+0.04411)};
	    //RED
	    double red_min[] = {0.1794-Math.abs(0.1794-0.1901),0.0372-Math.abs(0.0372-0.04901),0.0245-Math.abs(0.0245-0.03431)};
	    double red_max[] = {0.1901+Math.abs(0.1794+0.1901),0.04901+Math.abs(0.0372+0.04901),0.03431+Math.abs(0.0245+0.03431)};
	    //Brown
	    double brown_min[] = {0.09314-Math.abs(0.09314-0.10294),0.03431-Math.abs(0.03431-0.04412),0.02157-Math.abs(0.02157-0.03431)};
	    double brown_max[] = {0.10294+Math.abs(0.09314+0.10294),0.04412+Math.abs(0.03431+0.04412),0.03431+Math.abs(0.02157+0.03431)};
	    //Yellow
	    double yellow_min[] = {0.20882-Math.abs(0.20882-0.24902),0.16275-Math.abs(0.16275-0.20392),0.04020-Math.abs(0.04020-0.04510)};
	    double yellow_max[] = {0.24902+Math.abs(0.20882+0.24902),0.20392+Math.abs(0.16275+0.20392),0.04510+Math.abs(0.04020+0.04510)};
	    //White
	    double white_min[] = {0.15784-Math.abs(0.15784-0.16862),0.15784-Math.abs(0.15784-0.18235),0.15588-Math.abs(0.16961-0.15588)};
	    double white_max[] = {0.16862+Math.abs(0.15784+0.16862),0.18235+Math.abs(0.15784+0.18235),0.16961+Math.abs(0.16961+0.15588)};
	    
	    
	    boolean a = false;
	    boolean b = false;
	    boolean c = true;
	    int k = 0;
	    

	    while(c) {
	    int i = 0;
	    
	    
		//Blue
	    while(i < 25) {
	    	
	    	++i;
	        brightnessSensorMode.fetchSample(sample, 0);
	        LCD.refresh();
	        LCD.clear();
	        //System.out.println("R: " + sample[0] + " G: " + sample[1] + " B: " + sample[2]);
	        
	        if ((blue_min[0]<=sample[0]) && (blue_min[1]<=sample[1]) && (blue_min[2]<=sample[2])) {
	        	a = true;
	        }
	        if ((blue_max[0]>=sample[0]) && (blue_max[1]>=sample[1]) && (blue_max[2]>=sample[2])) {
	        	b = true;
	        }
	        if  (a && b) {
	        	LCD.drawString("Blue",0,0);
	        	Delay.msDelay(3000);
	        	a = false;
	        	b = false;
	        	i = 0;
	        	c = false;
	        	break;
	        }
	        else {a = false;
        	b = false;
        	i = 0;
        	break;}
	    }
	    //LCD.drawString("End Blue while",0,0);
    	//Delay.msDelay(3000);
    
	        //black
		    
		    while(i < 25) {
		    	++i;
		        brightnessSensorMode.fetchSample(sample, 0);
		        LCD.refresh();
		        LCD.clear();
		        //System.out.println("R: " + sample[0] + " G: " + sample[1] + " B: " + sample[2]);
		        
		        if ((black_min[0]<=sample[0]) && (black_min[1]<=sample[1]) && (black_min[2]<=sample[2])) {
		        	a = true;
		        }
		        if ((black_max[0]>=sample[0]) && (black_max[1]>=sample[1]) && (black_max[2]>=sample[2])) {
		        	b = true;
		        }
		        if  (a && b) {
		        	LCD.drawString("Black",0,0);
		        	Delay.msDelay(3000);
		        	a = false;
		        	b = false;
		        	i = 0;
		        	c = false;
		        	break;
		        }
		        else {a = false;
	        	b = false;
	        	i = 0;
	        	break;}
		    }
		    //LCD.drawString("End Black while",0,0);
        	//Delay.msDelay(3000);
		        //green
			    
			    while(i < 25) {
			    	++i;
			        brightnessSensorMode.fetchSample(sample, 0);
			        LCD.refresh();
			        LCD.clear();
			        //System.out.println("R: " + sample[0] + " G: " + sample[1] + " B: " + sample[2]);
			        
			        if ((green_min[0]<=sample[0]) && (green_min[1]<=sample[1]) && (green_min[2]<=sample[2])) {
			        	a = true;
			        }
			        if ((green_max[0]>=sample[0]) && (green_max[1]>=sample[1]) && (green_max[2]>=sample[2])) {
			        	b = true;
			        }
			        if  (a && b) {
			        	LCD.drawString("Green",0,0);
			        	Delay.msDelay(3000);
			        	a = false;
			        	b = false;
			        	i = 0;
			        	c = false;
			        	break;
			        }
			        else {a = false;
		        	b = false;
		        	i = 0;
		        	break;}
	        
			    }
			    //LCD.drawString("End Green while",0,0);
	        	//Delay.msDelay(3000);
	    
		       //RED
			    while(i < 25) {
			    	++i;
			        brightnessSensorMode.fetchSample(sample, 0);
			        LCD.refresh();
			        LCD.clear();
			        //System.out.println("R: " + sample[0] + " G: " + sample[1] + " B: " + sample[2]);
			        
			        if ((red_min[0]<=sample[0]) && (red_min[1]<=sample[1]) && (red_min[2]<=sample[2])) {
			        	a = true;
			        }
			        if ((red_max[0]>=sample[0]) && (red_max[1]>=sample[1]) && (red_max[2]>=sample[2])) {
			        	b = true;
			        }
			        if  (a && b) {
			        	LCD.drawString("RED!",0,0);
			        	Delay.msDelay(3000);
			        	a = false;
			        	b = false;
			        	i = 0;
			        	c = false;
			        	break;
			        }
			        else {a = false;
		        	b = false;
		        	i = 0;
		        	break;}
	        
			    }
			    
		        //Brown
			    while(i < 25) {
			    	++i;
			        brightnessSensorMode.fetchSample(sample, 0);
			        LCD.refresh();
			        LCD.clear();
			        //System.out.println("R: " + sample[0] + " G: " + sample[1] + " B: " + sample[2]);
			        
			        if ((brown_min[0]<=sample[0]) && (brown_min[1]<=sample[1]) && (brown_min[2]<=sample[2])) {
			        	a = true;
			        }
			        if ((brown_max[0]>=sample[0]) && (brown_max[1]>=sample[1]) && (brown_max[2]>=sample[2])) {
			        	b = true;
			        }
			        if  (a && b) {
			        	LCD.drawString("Brown",0,0);
			        	Delay.msDelay(3000);
			        	a = false;
			        	b = false;
			        	i = 0;
			        	break;
			        }
			        else {a = false;
		        	b = false;
		        	i = 0;
		        	c = false;
		        	break;}
	        
			    }
			    
		        //Yellow
			    while(i < 25) {
			    	++i;
			        brightnessSensorMode.fetchSample(sample, 0);
			        LCD.refresh();
			        LCD.clear();
			        //System.out.println("R: " + sample[0] + " G: " + sample[1] + " B: " + sample[2]);
			        
			        if ((yellow_min[0]<=sample[0]) && (yellow_min[1]<=sample[1]) && (yellow_min[2]<=sample[2])) {
			        	a = true;
			        }
			        if ((yellow_max[0]>=sample[0]) && (yellow_max[1]>=sample[1]) && (yellow_max[2]>=sample[2])) {
			        	b = true;
			        }
			        if  (a && b) {
			        	LCD.drawString("Yellow",0,0);
			        	Delay.msDelay(3000);
			        	a = false;
			        	b = false;
			        	i = 0;
			        	break;
			        }
			        else {a = false;
		        	b = false;
		        	i = 0;
		        	c = false;
		        	break;}
	        	        
			    }
			    
		        //White
			    while(i < 25) {
			    	++i;
			        brightnessSensorMode.fetchSample(sample, 0);
			        LCD.refresh();
			        LCD.clear();
			        //System.out.println("R: " + sample[0] + " G: " + sample[1] + " B: " + sample[2]);
			        
			        if ((white_min[0]<=sample[0]) && (white_min[1]<=sample[1]) && (white_min[2]<=sample[2])) {
			        	a = true;
			        }
			        if ((white_max[0]>=sample[0]) && (white_max[1]>=sample[1]) && (white_max[2]>=sample[2])) {
			        	b = true;
			        }
			        if  (a && b) {
			        	LCD.drawString("White",0,0);
			        	Delay.msDelay(3000);
			        	a = false;
			        	b = false;
			        	i = 0;
			        	break;
			        }
			        else {a = false;
		        	b = false;
		        	i = 0;
		        	c = false;
		        	break;}
			    }
			    ++k;
			    a1.Motor_Forword(k);
			    c = true;
			    }
			    
		        /*else {LCD.drawString("Not Blue",0,0);
	        	Delay.msDelay(3000);
	        	break;}*/
	        	
	        /*LCD.drawString("R: " + sample[0], 1, 1);
	        LCD.drawString("G: " + sample[1], 1, 2);
	        LCD.drawString("B: " + sample[2], 1, 3);*/
	 }
	}
//}

	