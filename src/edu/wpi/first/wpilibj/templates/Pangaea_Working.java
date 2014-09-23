
package edu.wpi.first.wpilibj.templates;
 
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SimpleRobot;
import edu.wpi.first.wpilibj.Timer;
 
public class Pangaea_Working extends SimpleRobot {
    
    RobotDrive chassis = new RobotDrive(1,2);
    Joystick mainStick = new Joystick(1);
    Jaguar jaguar = new Jaguar(3);
    
    public void autonomous() {
      chassis.setSafetyEnabled(false);
      while (isAutonomous() && isEnabled()) {
      chassis.drive(0.5, 1);
      Timer.delay(0.02);
      chassis.drive(0.0, 0.0);
    }
    }
    
    public void operatorControl() {
        chassis.setSafetyEnabled(true);
        while (isOperatorControl() && isEnabled()) {
            double speed;
            double rot;
            speed = mainStick.getY();
            rot = -mainStick.getX();
            chassis.arcadeDrive(speed,rot);// drive w/joysticks
            Timer.delay(0.02);
            boolean buttonValue;
            buttonValue = mainStick.getRawButton(3);
            buttonValue = mainStick.getRawButton(4);
            if (buttonValue = mainStick.getRawButton(3)){
                jaguar.set(1);
            }
            if (buttonValue = mainStick.getRawButton(4)){
                jaguar.set(-1);
            }
    }
    }
   
    public void test() {
       
    }
}    