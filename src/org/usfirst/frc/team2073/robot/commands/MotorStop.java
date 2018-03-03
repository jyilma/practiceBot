package org.usfirst.frc.team2073.robot.commands;

import javax.management.modelmbean.RequiredModelMBean;

import org.usfirst.frc.team2073.robot.Robot;
import org.usfirst.frc.team2073.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class MotorStop extends Command {

    public MotorStop() {
    	requires(Robot.drivetrain);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    private void requires(DriveTrain drivetrain) {
		// TODO Auto-generated method stub
		
	}

	// Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drivetrain.stop();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
