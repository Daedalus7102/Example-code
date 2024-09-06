package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ExampleSubsystem extends SubsystemBase{
  //private final static Servo servo = new Servo(0);
  private final static VictorSPX cim = new VictorSPX(0);
  private final static TalonSRX cim2 = new TalonSRX(1);

  public ExampleSubsystem() {
  }

  @Override
  public void periodic() {}

  public void moveServo(double velocity) {
    //servo.setAngle(velocity);
    cim.set(ControlMode.PercentOutput, velocity);
    cim2.set(ControlMode.PercentOutput, velocity);
  }

  public static double getPosition(){
    //Function to get the velocity
    return cim.getMotorOutputPercent();
  }
}