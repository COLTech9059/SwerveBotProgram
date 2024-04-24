// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;
//Imports
import edu.wpi.first.math.util.Units;
import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static final class portConstants {
    public static final int kDriverControllerPort = 0;
  }

  public static final class driveConstants {
    //Speed Constraints
    public static final double maxSpd = 0.0;
    public static final double maxTurnSpeed = Math.PI * 2; //Radians per second, rotates a full circle in a second at base.

    //Chassis Information
    public static final double wheelWidth = Units.inchesToMeters(0.0); //Distance between the left and right wheels.
    public static final double wheelLength = Units.inchesToMeters(0.0); //Distance between the front and back wheels.

    //Each Translation2d represents the wheel in relation to the center of the robot.
    public static final SwerveDriveKinematics SDK = new SwerveDriveKinematics(
      new Translation2d(wheelWidth/2, wheelLength/2), //Top right facing forward
      new Translation2d(-wheelWidth/2, wheelLength/2), //Top left facing forward
      new Translation2d(wheelWidth/2, -wheelLength/2), //Bottom right facing forward
      new Translation2d(-wheelWidth/2, -wheelLength/2) //Bottom left facing forward
    );

  }
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }
}
