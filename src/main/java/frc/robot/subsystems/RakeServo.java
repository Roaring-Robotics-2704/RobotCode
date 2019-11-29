/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Servo;

import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class RakeServo extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private Servo rakeServo = new Servo(RobotMap.rakeServo);
  //The amount added to the current postition of the servo
  private double rakeServoDistance = 90;

  public RakeServo(){
    rakeServo.setAngle(90);
  }

  public void rakeUp(){
    rakeServo.setAngle(rakeServo.getAngle() + rakeServoDistance);
    
  }

  public void rakeDown(){
    rakeServo.setAngle(rakeServo.getAngle() - rakeServoDistance);
  
  }
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
