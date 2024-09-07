// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;
import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Chassis;

public class DriveCommand extends Command {
  private final Chassis chassis;
  Supplier<Double> ySpeed, zSpeed;

  public DriveCommand(Chassis chassis, Supplier<Double> ySpeed, Supplier<Double> zSpeed) {
    addRequirements(chassis);
    this.chassis = chassis;

    this.ySpeed = ySpeed;
    this.zSpeed = zSpeed;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double speed = this.ySpeed.get() * 0.6;
    double turn = this.zSpeed.get() * 0.3;

    double left = speed + turn;
    double right = speed - turn;

    chassis.drive(left, right);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    chassis.drive(0,0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
