/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.Servo;
import frc.robot.RobotMap;
import frc.robot.Robot;

public class Arm extends Subsystem {
  //Create encoder and related variables
  public Encoder armEncoder = new Encoder(RobotMap.armEncoderPorts[0], RobotMap.armEncoderPorts[1], false, Encoder.EncodingType.k4X);
  private static Double wheelDiameter = 6.0/12.0;
  
  // Create Motor object
  private PWMVictorSPX liftMotor = new PWMVictorSPX(RobotMap.liftMotor);

  //Create a Servo object
  private Servo stopperServo = new Servo (RobotMap.stopperServo);


  public Arm() {
    //The distance per pulse used here is for the REV-11-1271 encoder.
    armEncoder.setDistancePerPulse(wheelDiameter*3.14/2048);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
