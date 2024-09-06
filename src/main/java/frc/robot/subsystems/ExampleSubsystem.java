package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ExampleSubsystem extends SubsystemBase{
  //private final static Servo servo = new Servo(0);
  private final static VictorSP cim = new VictorSP(0);

  public ExampleSubsystem() {
  }

  @Override
  public void periodic() {}

  public void moveServo(double velocity) {
    //servo.setAngle(velocity);
    cim.set(velocity);
  }

  public static int getPosition(){
    return cim.getChannel();
  }
}