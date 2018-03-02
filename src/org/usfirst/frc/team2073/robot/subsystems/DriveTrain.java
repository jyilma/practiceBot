package org.usfirst.frc.team2073.robot.subsystems;

import org.usfirst.frc.team2073.robot.OI;
import org.usfirst.frc.team2073.robot.RobotMap;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem implements OI{
	Talon motor = RobotMap.DriveTrainMotor;
	RobotDrive myDrive;
	Talon frontLeft, frontRight, rearLeft, rearRight;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private Joystick stick = OI.getJoystick();

    public void initDefaultCommand() {
    	frontLeft = new Talon(1);
    	frontRight = new Talon(2);
    	rearLeft = new Talon(3);
    	rearRight = new Talon(4);
    	myDrive = new RobotDrive(frontLeft, rearLeft, frontRight, rearRight);
    }
    public void getY(){
    	motor.set(stick.getY());
    	
    }
    public void forward() {
    	motor.set(.5);
    }
    public void reverse() {
    	motor.set(-.5);
    }
    public void stop(){
    	motor.set(0);
    }
    
}

