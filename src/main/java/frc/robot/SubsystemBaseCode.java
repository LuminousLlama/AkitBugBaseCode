package frc.robot;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import org.littletonrobotics.junction.AutoLogOutput;

public class SubsystemBaseCode extends SubsystemBase {

  @AutoLogOutput double test = 0.0;

  @Override
  public void periodic() {
    test = 29.30;
  }
}
