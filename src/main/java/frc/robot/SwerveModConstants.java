package frc.robot;

import edu.wpi.first.math.geometry.Rotation2d;

public class SwerveModConstants {

    public double driveMotorID;
    public double angleMotorID;
    public Rotation2d angleOffset;

    public SwerveModConstants(double driveMotorID, double angleMotorID, Rotation2d angleOffset)
    {
        this.driveMotorID = driveMotorID;
        this.angleMotorID = angleMotorID;
        this.angleOffset = angleOffset;
    }
}
