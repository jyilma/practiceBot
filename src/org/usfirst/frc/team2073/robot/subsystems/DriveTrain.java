package org.usfirst.frc.team2073.robot.subsystems;

import org.usfirst.frc.team2073.robot.OI;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem{
	public TalonSRX motor = new TalonSRX(4);
	Talon frontLeft, frontRight, rearLeft, rearRight;
	private Joystick stick = OI.getJoystick();

    public void initDefaultCommand() {
    	
  
    }
    public void getY(){
    	setMotorSpeed(-stick.getRawAxis(1));
    	
    }
    public void halfSpeed(){
    	setMotorSpeed(-.5);
    }
    public void fullSpeed(){
    	setMotorSpeed(-1);
    }
    public void halfReverse(){
    	setMotorSpeed(.5);
    }
    public void slow(){
    	setMotorSpeed(-.1);
    }

    public void forward() {
    	motor.set(ControlMode.PercentOutput, .5);
    }
    public void reverse() {
    	motor.set(ControlMode.PercentOutput, -.5);
    }
    public void stop() {
		motor.set(ControlMode.PercentOutput, 0);
	}
	
	public void variableDrive(double speed) {
		motor.set(ControlMode.PercentOutput, speed);
	}
	public double getMotorSpeed() {
		return motor.getSelectedSensorVelocity(0);
	}
	public void setMotorSpeed(double speed) {
		motor.set(ControlMode.PercentOutput, speed);
	}
	
}

