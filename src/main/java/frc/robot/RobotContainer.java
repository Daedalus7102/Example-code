// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.commands.ExampleCommand;
import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj.PS4Controller;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class RobotContainer {
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();
  private static final PS4Controller driveControl = new PS4Controller(0);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the trigger bindings
    configureBindings();
  }

  private void configureBindings() {
    //Chassis driver controls
    new JoystickButton(driveControl, 4).whileTrue(new ExampleCommand(m_exampleSubsystem, 0.3));
    new JoystickButton(driveControl, 2).whileTrue(new ExampleCommand(m_exampleSubsystem, -0.3));
  }


  public Command getAutonomousCommand() {
    // An example command will be run in autonomous
    return null;
  }
}
