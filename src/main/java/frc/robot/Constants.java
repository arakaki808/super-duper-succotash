// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {


  public static final class ArmConstants {
    public static int kLeftMotorPort = 5;
    public static int kRightMotorPort = 6;

    

    // FeedForward Constants
    public static double kSVolts = 0;
    public static double kGVolts = 0;
    public static double kVVoltSecondPerRad = 0;
    public static double kAVoltSecondSquaredPerRad = 0;

    //TrapezoidProfile Constraints
    public static double kMaxVelocityRadPerSecond = 3;
    public static double kMaxAccelerationRadPerSecSquared = 3;

    //PID coefficients
    public static double kP = .1; 
    public static double kI = 0;
    public static double kD = 0; 
    public static double kIz = 0; 
    public static double kFF = 10; 
    public static double kMaxOutput = 1; 
    public static double kMinOutput = -1;
    public static double  maxRPM = 11000;
    
    // The offset of the arm from the horizontal in its neutral position,
    // measured from the horizontal
    public static double kTarget = .5;
    public static double kHome = 0;
  }

  public static final class OIConstants {
    public static final int kDriverControllerPort = 0;
  }
}
