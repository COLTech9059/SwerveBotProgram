package frc.robot;

import com.ctre.phoenix6.signals.InvertedValue;
import com.ctre.phoenix6.signals.SensorDirectionValue;

import edu.wpi.first.math.util.Units;

public class TalonFXSwerveConstants {

    public final double wheelDiameter;
    public final double wheelCircumference;
    public final double angleGearRatio;
    public final double driveGearRatio;
    public final double angleKP;
    public final double angleKI;
    public final double angleKD;
    public final InvertedValue driveMotorInvert;
    public final InvertedValue angleMotorInvert;

    private TalonFXSwerveConstants(double wheelDiameter, double angleGearRatio, double driveGearRatio, double angleKP, double angleKI, double angleKD, InvertedValue driveMotorInvert, InvertedValue angleMotorInvert)
    {
        this.wheelDiameter = wheelDiameter;
        this.wheelCircumference = wheelDiameter * Math.PI;
        this.angleGearRatio = angleGearRatio;
        this.driveGearRatio = driveGearRatio;
        this.angleKP = angleKP;
        this.angleKI = angleKI;
        this.angleKD = angleKD;
        this.driveMotorInvert = driveMotorInvert;
        this.angleMotorInvert = angleMotorInvert;
    }

    //L3 driveGearRatio = (6.12 / 1)
    public static final TalonFXSwerveConstants KrakenX60(double driveGearRatio){
                double wheelDiameter = Units.inchesToMeters(4.0);
        
                /** This value will have to be determined later */
                double angleGearRatio = (1);
        
                double angleKP = 1.0;
                double angleKI = 0.0;
                double angleKD = 0.0;
        
                InvertedValue driveMotorInvert = InvertedValue.CounterClockwise_Positive;
                InvertedValue angleMotorInvert = InvertedValue.Clockwise_Positive;
                return new TalonFXSwerveConstants(wheelDiameter, angleGearRatio, driveGearRatio, angleKP, angleKI, angleKD, driveMotorInvert, angleMotorInvert);
            }
}
