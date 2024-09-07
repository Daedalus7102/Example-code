// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.commands.DriveCommand;
import frc.robot.subsystems.Chassis;
import edu.wpi.first.wpilibj.PS4Controller;
import edu.wpi.first.wpilibj2.command.Command;

public class RobotContainer {
  private static final Chassis chassis = new Chassis();
  private static final PS4Controller driveControl = new PS4Controller(0);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the trigger bindings
    configureBindings();

    chassis.setDefaultCommand(
      new DriveCommand(
        chassis,
        () -> (-driveControl.getRawAxis(1)),
        () -> (driveControl.getRawAxis(2))
      )
    );
  }

  private void configureBindings() {
    //Chassis driver controls
  }


  public Command getAutonomousCommand() {
    // An example command will be run in autonomous
    return null;
  }
}
