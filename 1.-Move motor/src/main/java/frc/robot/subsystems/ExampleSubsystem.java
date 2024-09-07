package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ExampleSubsystem extends SubsystemBase{
  private final static VictorSPX cim0 = new VictorSPX(0);
  private final static VictorSPX cim1 = new VictorSPX(1);
  private final static TalonSRX cim2 = new TalonSRX(2);
  private final static TalonSRX cim3 = new TalonSRX(3);

  public ExampleSubsystem() {
  }

  @Override
  public void periodic() {}

  public void moveMotor(double velocity) {
    cim0.set(ControlMode.PercentOutput, velocity);
    cim1.set(ControlMode.PercentOutput, velocity);
    cim2.set(ControlMode.PercentOutput, velocity);
    cim3.set(ControlMode.PercentOutput, velocity);
  }

  public static double getPosition(){
    //Function to get the velocity
    return cim0.getMotorOutputPercent();
  }
}