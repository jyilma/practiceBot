package org.usfirst.frc.team2073.robot.commands;

import org.usfirst.frc.team2073.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drive extends Command {
	double speed ;
	public Drive(double speed) {
    	requires(Robot.drivetrain);
    	this.speed = speed;
    	//setTimeout(.5);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
   
    protected void execute() {
    	Robot.drivetrain.getY();
    	Robot.drivetrain.setMotorSpeed(speed);
    	

    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
       return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drivetrain.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
