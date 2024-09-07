package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Chassis extends SubsystemBase{
  private final static VictorSPX front_right = new VictorSPX(0);
  private final static TalonSRX back_right = new TalonSRX(1);
  private final static VictorSPX front_left = new VictorSPX(2);
  private final static TalonSRX back_left = new TalonSRX(3);
  // private final DifferentialDrive manejoChasis;

  public Chassis() {
    back_left.follow(front_left);
    back_right.follow(front_right);
  }
  
  @Override
  public void periodic() {}

  public void drive(double leftSpeed, double rightSpeed) {
    front_left.set(ControlMode.PercentOutput, leftSpeed);
    front_right.set(ControlMode.PercentOutput, -rightSpeed);
  }

  public static double getPosition(){
    //Function to get the velocity
    return front_left.getMotorOutputPercent();
  }
}