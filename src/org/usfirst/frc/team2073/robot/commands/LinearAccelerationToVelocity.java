package org.usfirst.frc.team2073.robot.commands;

import org.usfirst.frc.team2073.robot.Robot;
import org.usfirst.frc.team2073.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class LinearAccelerationToVelocity extends Command {
	private double time;
	private double encoderPosition;
	private double initialTime;
	private double elapsedTime;
	private double velocity;

    public LinearAccelerationToVelocity(double time, double encoderPosition) {
    	requires(Robot.drivetrain);
    	this.time = time;
    	encoderPosition = this.encoderPosition;
    	
    
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    private void requires(DriveTrain drivetrain) {
		// TODO Auto-generated method stub
		
	}

	// Called just before this Command runs the first time
    protected void initialize() {
    	velocity = encoderPosition/time;
    	time = System.currentTimeMillis()/1000;
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
		motor.set(ControlMode.PercentOutput, velocity);
		System.out.println(time);
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
    }
}
